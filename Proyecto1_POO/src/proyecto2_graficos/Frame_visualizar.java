package proyecto2_graficos;

//IMPORTS
import proyecto1_poo.clases.*;

import java.util.ArrayList;
import javax.swing.*;

//En esta clase esta todo el contenido referente a la impresion de los animales ingresados.

public class Frame_visualizar{

	//FRAME
	private JFrame marcoVisualizar = new JFrame();
	
	//JPANELS
	private JScrollPane scrollPaneVer;
	
	//JTEXTAREA
	private JTextArea textAreaIngresados = new JTextArea();
		
	//CONSTRUCTOR VACIO
	public Frame_visualizar(){	
	}
	
	//CONSTRUCTOR PARA VER ANIMALES EN EL ZOOLOGICO
	public Frame_visualizar(ArrayList<Animal> traslado){
		
		//CARACTERISTICAS DEL FRAME
		marcoVisualizar.setLayout(null);
		marcoVisualizar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marcoVisualizar.setSize(700,400);
		marcoVisualizar.setResizable(false);
		marcoVisualizar.setLocationRelativeTo(null);
		marcoVisualizar.setVisible(true);
		
		//PANEL INGRESADOS
		scrollPaneVer = new JScrollPane(textAreaIngresados);
		
		textAreaIngresados.setText("LISTA DE ANIMALES EN EL ZOOLOGICO\n" + deArrayListAString(traslado));
		textAreaIngresados.repaint();
			
		marcoVisualizar.setContentPane(scrollPaneVer);
	
	}

	//METODO PARA CONVERTIR DE ARRAYLIST A STRING PARA LA IMPRESION...
	private static String deArrayListAString(ArrayList<Animal> arraylist) {
	    StringBuilder constructorString = new StringBuilder();
	    for (Animal a : arraylist) {
	        constructorString.append("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
	        		+ a + "\n");
	        }
		return constructorString.toString();
	}
	
	//METODO getFrame_visualizar
	public JFrame getFrame_visualizar() {
		return this.marcoVisualizar;
	}

}
