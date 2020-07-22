package proyecto4_cliente;

//IMPORTS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.net.*;

import javax.swing.*;

/*
 * En esta clase "AppCliente.java" se encuentra:
 * 
 * -La vista para la app de los administradores (cliente) con todos sus atributos
 * -Socket con sus DataInput y DataOutput para el envio de comandos y recepcion de respuestas por parte del server
 * -METODO MAIN para la ejecucion independiente de la app del cliente
 */

public class AppCliente {

	private JFrame framePrincipalAppCliente = new JFrame();
	private JPanel panelPrincipalAppCliente = new JPanel();
	private JTextArea textAreaChat = new JTextArea();
	private JScrollPane scrollPaneChat = new JScrollPane(textAreaChat);
	private JTextField textFieldBarraEscribir = new JTextField();
	private JButton botonEnviar = new JButton("ENVIAR");
	
	public static void main(String[] args) {
		AppCliente ac = new AppCliente();
	}

	public AppCliente() {
		
		/*
		 * PROPIEDADES DEL CHAT DE LA APP CLIENTE (CONFIGURACIONES)
		 */
		
		framePrincipalAppCliente.setLayout(null);
		framePrincipalAppCliente.setSize(555,400);
		framePrincipalAppCliente.setLocationRelativeTo(null);
		framePrincipalAppCliente.setTitle("Client App");
		framePrincipalAppCliente.setVisible(true);
		framePrincipalAppCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelPrincipalAppCliente.setLayout(null);
		panelPrincipalAppCliente.setBounds(0, 33, 250, 30);
		
		scrollPaneChat.setBounds(0, 0, 538, 300);
		panelPrincipalAppCliente.add(scrollPaneChat);
		
		textFieldBarraEscribir.setBounds(0, 323, 500, 30);
		panelPrincipalAppCliente.add(textFieldBarraEscribir);
		
		botonEnviar.setBounds(500, 323, 30, 30);
		panelPrincipalAppCliente.add(botonEnviar);
		
		framePrincipalAppCliente.setContentPane(panelPrincipalAppCliente);
		framePrincipalAppCliente.invalidate();
		framePrincipalAppCliente.validate();
		
		
		textAreaChat.setEditable(false);
		textAreaChat.setText("Bienvenido administrador...\n\nSi necesita ayuda escriba el siguiente comando:\t/ayuda\n____________________________________________________________________________");

		
		botonEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					Socket socket = new Socket("localhost",3005);
					DataOutputStream envioComando = new DataOutputStream(socket.getOutputStream());
					DataInputStream recepcionRespuesta = new DataInputStream(socket.getInputStream());
					String mensajeAEnviar = textFieldBarraEscribir.getText();
					envioComando.writeUTF(mensajeAEnviar);
					textAreaChat.append("\n" + mensajeAEnviar);
					textFieldBarraEscribir.setText("");
					
					if(mensajeAEnviar.equals("/clear")) {
						textAreaChat.setText("Bienvenido administrador...\n\nSi necesita ayuda escriba el siguiente comando:\t/ayuda\n____________________________________________________________________________");
					}
					
					if(mensajeAEnviar.equals("/fin")) {
						textAreaChat.append("Servidor:\n" + recepcionRespuesta.readUTF());
						botonEnviar.removeActionListener(this);
						socket.close();
						envioComando.close();
						recepcionRespuesta.close();
					}
					
					
					//LECTURA DE LAS RESPUESTAS DEL SERVER
					
					String filtro = recepcionRespuesta.readUTF();
					if(filtro.equals("")) {
						textAreaChat.append("\nSin informacion...");
					}else {
						String entrada=filtro;
						textAreaChat.append("\nServidor:\n" + entrada);
					}
					
				//CATCH EXCEPCIONES	
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
	}
}
	
