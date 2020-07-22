package proyecto4_servidor;

//IMPORTS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;

import proyecto2_graficos.Frame_principal;
import proyecto3_database.database;

/*
 * En esta clase "AppServidor.java" se encuentra:
 * 
 * -METODO MAIN para la ejecucion del servidor con su hilo y el marco principal (gerente) independientemente de la app del cliente.
 * -La vista de la consola del servidor, que mostrara los comandos que envian los clientes.
 * -Definicion del hilo que se estara ejecutando siempre y cuando no se pulse el boton de "CERRAR" en la consola del servidor.
 * -Socket y SocketServer con sus DataInput y DataOutput para la recepcion de comandos y envio de respuestas a los clientes (administradores)
 */

public class AppServidor extends Thread{

	
	//METODO MAIN PARA LA EJECUCION DE LA APPSERVER (GERENTE)
	public static void main(String[] args) {
		AppServidor as = new AppServidor();
		as.start();
	}
	
	//ATRIBUTOS
	private JFrame frameServer;
	private JPanel panelServer;
	private JTextArea textAreaServer;
	private JScrollPane scrollPaneServer;
	private JButton botonCerrarServer = new JButton("CERRAR");
		
	private Socket socket = null;
	private ServerSocket servidor;
	private boolean continuar = true;

	//OVERRIDE DEL METODO RUN
	public void run() {
		
		/*
		 * INSTANCIAS NECESARIAS PARA LA EJECUCION DEL HILO...
		 * 
		 * NOTA: al instanciar en este punto un objeto de tipo "Frame_principal" se mostrara la vista de la app principal del gerente.
		 */
		
		Frame_principal fp = new Frame_principal();
		
		database DB = database.getInstances();
		
		/*
		 * CARACTERISTICAS DEL FRAME DEL SERVER
		 */
		
		frameServer = new JFrame();
		frameServer.setBounds(120, 220, 318, 575);
		frameServer.setVisible(true);
		
		panelServer = new JPanel();
		panelServer.setLayout(null);
		
		textAreaServer = new JTextArea("\t**CONSOLA DEL SERVIDOR**\n");
		
		scrollPaneServer = new JScrollPane(textAreaServer);
		scrollPaneServer.setBounds(0, 0, 300, 480);
		
		panelServer.add(scrollPaneServer);
		
		botonCerrarServer.setBounds(110, 490, 85, 25);
		panelServer.add(botonCerrarServer);
		
		frameServer.setContentPane(panelServer);
		frameServer.invalidate();
		frameServer.validate();
		
		try {
			servidor = new ServerSocket(3005);
			while(continuar) {
				
				botonCerrarServer.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent k) {
						try {
							
							//socket.close();
							servidor.close();
							continuar=false;
							frameServer.dispose();
							
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
				
				socket = servidor.accept();
				DataInputStream solicitudesClientes = new DataInputStream(socket.getInputStream());
				DataOutputStream respuesta = new DataOutputStream(socket.getOutputStream());

				//ALMACENAMIENTO DEL MENSAJE ENVIADO POR EL CLIENTE
				String mensaje_texto = solicitudesClientes.readUTF();
				textAreaServer.append("\n" + socket.getRemoteSocketAddress().toString() + " Escribe: " + mensaje_texto);

				
				//CONDICIONAL CUANDO SE EJECUTA EL COMANDO DE FINALIZAR
				if(mensaje_texto.equals("/fin")) {
					respuesta.writeUTF("Hasta luego... Sesion finalizada.");
				}
				
				//CONDICIONAL CUANDO SE EJECUTA EL COMANDO DE AYUDA
				if(mensaje_texto.equals("/ayuda")) {
					//DataOutputStream respuesta = new DataOutputStream(misocket.getOutputStream());
					respuesta.writeUTF("LISTA DE COMANDOS DISPONIBLES:\n\t/animales\n\t/id <No.ID>\n\t/clear\n\t/fin");
				} 
				if(mensaje_texto.equals("/clear")) {
					//DataOutputStream respuesta = new DataOutputStream(misocket.getOutputStream());
					respuesta.writeUTF("Ha limpiado la pantalla...");
				} 
				
				//CONDICIONAL PARA LA LISTA DE TODOS LOS ANIMALES EN EL ZOO
				if(mensaje_texto.equals("/animales")) {
					respuesta.writeUTF(DB.dbStatementTablaCompletaString("select *from animales"));
				}
				
				//CONDICIONALES PARA LOS COMANDOS DE LAS ESPECIES DE ANIMALES
				if(mensaje_texto.equals("/aves")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Ave'"));
				}
				if(mensaje_texto.equals("/reptiles")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Reptil'"));
				}
				if(mensaje_texto.equals("/peces")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Pez'"));
				}
				if(mensaje_texto.equals("/felinos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Felino'"));
				}
				if(mensaje_texto.equals("/primates")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Primate'"));
				}
				if(mensaje_texto.equals("/bovinos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where especie='Bovino'"));
				}
				
				//CONDICIONALES PARA LOS COMANDOS DE LOS ANIMALES PROPIOS
				if(mensaje_texto.equals("/aguilas")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Aguila'"));
				}
				if(mensaje_texto.equals("/pinguinos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Pinguino'"));
				}
				if(mensaje_texto.equals("/serpientes")) {
					respuesta.writeUTF(DB.dbStmtTablaEspecialesString("select *from animales where animal='Serpiente'"));
				}
				if(mensaje_texto.equals("/cocodrilos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Cocodrilo'"));
				}
				if(mensaje_texto.equals("/kois")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Koi'"));
				}
				if(mensaje_texto.equals("/peces globo")) {
					respuesta.writeUTF(DB.dbStmtTablaEspecialesString("select *from animales where animal='Pez Globo'"));
				}
				if(mensaje_texto.equals("/guepardos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Guepardo'"));
				}
				if(mensaje_texto.equals("/pumas")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Puma'"));
				}
				if(mensaje_texto.equals("/monos")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Mono'"));
				}
				if(mensaje_texto.equals("/gorilas")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Gorila'"));
				}
				if(mensaje_texto.equals("/vacas")) {
					respuesta.writeUTF(DB.dbStmtTablaEspecialesString("select *from animales where animal='Vaca'"));
				}
				if(mensaje_texto.equals("/toros")) {
					respuesta.writeUTF(DB.dbStmtTablaPropiaString("select *from animales where animal='Toro'"));
				}
				
				/*
				 * Al no entrar en ningun condicional; hay dos opciones, ver si se ejecuto un comando /id <n>
				 * o si se escribio un comando o una palabra no disponible
				 */
				else {
					for(int i=0;i<fp.getID();i++) {
						if(mensaje_texto.equals("/id " + i)) {
							respuesta.writeUTF(DB.dbStatementTablaCompletaString("select *from animales where identificacion="+i));
						}
					}
					respuesta.writeUTF("");
				}
				
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
}
	

