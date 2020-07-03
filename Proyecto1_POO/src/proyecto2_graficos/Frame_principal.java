package proyecto2_graficos;

//IMPORTS
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import proyecto1_poo.clases.*;
import proyecto1_poo.clases.animales.*;

//CURSANTE: JOSE INCIARTE C.I. 27.696.083


									//CLASE FRAME PRINCIPAL
/*
 * En esta clase se encuentra todo el contenido principal de la app, paneles, un marco, botones, accion
 * de ingresados y almacenado en ArrayList.
 * 
 * Quizas haya redundancia de codigo pero fue llevado a cabo de esta manera por seguridad e integridad.
*/

public class Frame_principal {

	//ARRAYLIST PRINCIPAL ORIGINAL
	ArrayList<Animal> animalesZoo = new ArrayList<>();
		
	//FRAME
	private JFrame marcoPrincipal = new JFrame();
	
	//PANELS
	private JPanel panelInicio = new JPanel();
	private JPanel panelMenu = new JPanel();
	private JPanel panelIngresar = new JPanel();
	private JPanel panelIngresarStandard = new JPanel();
	private JPanel panelIngresarSerpiente = new JPanel();
	private JPanel panelIngresarPez_globo = new JPanel();
	private JPanel panelIngresarVaca = new JPanel();

	//JLABEL'S
	private JLabel labelInicio = new JLabel("<html>UNIVERSIDAD RAFAEL URDANETA<br>FACULTAD DE INGENIERIA<br>ESCUELA DE COMPUTACION<br>CATEDRA: PROGRAMACION ORIENTADA A OBJETOS<br>PROFESOR: CARLOS HERNANDEZ<br><br>CURSANTE: JOSE INCIARTE C.I. 27.696.083<html>");
	private JLabel labelTitulo = new JLabel("PROYECTO #2 INTERFACES GRAFICAS");
	private JLabel labelMenuPrincipal = new JLabel("MENU PRINCIPAL");
	private JLabel labelIngresoApodo = new JLabel("APODO:");
	private JLabel labelIngresoEdad = new JLabel("EDAD:");
	private JLabel labelIngresoPeso = new JLabel("PESO:");
	private JLabel labelTamanoSerpiente = new JLabel("TAMA�O:");
	private JLabel labelVeneno = new JLabel("DESC. DEL VENENO:");
	private JLabel labelDescLeche = new JLabel("DESC. DE LA LECHE:");
		//JLABEL'S GRUPOS ANIMALES
	private JLabel labelAves = new JLabel("AVES");
	private JLabel labelReptiles = new JLabel("REPTILES");
	private JLabel labelPeces = new JLabel("PECES");
	private JLabel labelFelinos = new JLabel("FELINOS");
	private JLabel labelPrimates = new JLabel("PRIMATES");
	private JLabel labelBovinos = new JLabel("BOVINOS");
		//JLABEL'S ANIMALES
	private JLabel labelAguila = new JLabel("AGUILA");
	private JLabel labelPinguino = new JLabel("PINGUINO");
	private JLabel labelSerpiente = new JLabel("SERPIENTE");
	private JLabel labelCocodrilo = new JLabel("COCODRILO");
	private JLabel labelKoi = new JLabel("KOI");
	private JLabel labelPez_globo = new JLabel("PEZ GLOBO");
	private JLabel labelGuepardo = new JLabel("GUEPARDO");
	private JLabel labelPuma = new JLabel("PUMA");
	private JLabel labelMono = new JLabel("MONO");
	private JLabel labelGorila = new JLabel("GORILA");
	private JLabel labelVaca = new JLabel("VACA");
	private JLabel labelToro = new JLabel("TORO");
	
	//JBUTTONS
	private JButton botonComenzar = new JButton("COMENZAR");
	private JButton botonVolverInicio = new JButton("regresar");
	private JButton botonVolverMenu = new JButton("regresar");
	private JButton botonIngresar = new JButton ("INGRESAR");
	private JButton botonVer = new JButton("VER INGRES.");
	private JButton botonVerCaracteristicas = new JButton("CARACTERISTICAS");
	private JButton botonAceptarIngreso = new JButton("Aceptar");
	private JButton botonVolverIngreso = new JButton ("regresar");
	//JBUTTONS ANIMALES
		//AVES
	private JButton botonIngresarAguila = new JButton("Aguila");
	private JButton botonIngresarPinguino = new JButton("Pinguino");
		//REPTILES
	private JButton botonIngresarSerpiente = new JButton("Serpiente");
	private JButton botonIngresarCocodrilo = new JButton("Cocodrilo");
		//PECES
	private JButton botonIngresarKoi = new JButton("Koi");
	private JButton botonIngresarPez_globo = new JButton("Pez globo");
		//FELINOS
	private JButton botonIngresarGuepardo = new JButton("Guepardo");
	private JButton botonIngresarPuma = new JButton("Puma");
		//PRIMATES
	private JButton botonIngresarMono = new JButton("Mono");
	private JButton botonIngresarGorila = new JButton("Gorila");
		//BOVINOS
	private JButton botonIngresarVaca = new JButton("Vaca");
	private JButton botonIngresarToro = new JButton("Toro");

	//JTEXTFIELD'S
	private JTextField textFieldApodo = new JTextField();
	private JTextField textFieldEdad = new JTextField();
	private JTextField textFieldPeso = new JTextField();
	private JTextField textFieldTamanoSerpiente = new JTextField();
	private JTextField textFieldVeneno = new JTextField();
	private JTextField textFieldDescLeche = new JTextField();
	
	//ATRIBUTOS MISC
	private int iteracion=1;
	
	//FUENTE
	Font fontResaltar = new Font("Times New Roman",Font.BOLD,18);
	
	//METODO SETEAR PARAMETROS STANDARD (INGRESO)
	public void setearElementosIngreso(JPanel animalAIngresar) {
		
		animalAIngresar.setLayout(null);
		
		labelIngresoApodo.setBounds(200, 30, 50, 20);
		labelIngresoEdad.setBounds(200, 60, 120, 20);
		labelIngresoPeso.setBounds(200, 90, 120, 20);
		animalAIngresar.add(labelIngresoApodo);
		animalAIngresar.add(labelIngresoEdad);
		animalAIngresar.add(labelIngresoPeso);
		
		textFieldApodo.setBounds(275, 30, 120, 20);
		textFieldEdad.setBounds(275, 60, 120, 20);
		textFieldPeso.setBounds(275, 90, 120, 20);
		animalAIngresar.add(textFieldApodo);
		animalAIngresar.add(textFieldEdad);
		animalAIngresar.add(textFieldPeso);
		textFieldApodo.setText("");
		textFieldEdad.setText("");
		textFieldPeso.setText("");
		
		botonAceptarIngreso.setBounds(270, 150, 80, 25);
		animalAIngresar.add(botonAceptarIngreso);
		
		animalAIngresar.add(botonVolverIngreso);
	}
	
	//CONSTRUCTOR CLASE FRAME PRINCIPAL
	public Frame_principal() {
		
		//PARAMETROS DEL MARCO PRINCIPAL
		marcoPrincipal.setLayout(null);
		marcoPrincipal.setSize(400, 600);
		marcoPrincipal.setLocationRelativeTo(null);
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoPrincipal.setVisible(true);
		marcoPrincipal.setTitle("ZOOLOGICO PROYECTO 2");
		
		//PANELES
		panelInicio.setLayout(null);
		panelMenu.setLayout(null);
		panelIngresar.setLayout(null);
		//panelIngresarStandard.setLayout(null);
		
		//LABELS
		labelInicio.setBounds(0, 0, 300, 125);
		panelInicio.add(labelInicio);
		
		labelTitulo.setBounds(0, 190, 400, 25);
		labelTitulo.setFont(fontResaltar);
		labelTitulo.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelInicio.add(labelTitulo);
		
		labelMenuPrincipal.setBounds(70, 65, 245, 20);
		labelMenuPrincipal.setFont(fontResaltar);
		labelMenuPrincipal.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelMenu.add(labelMenuPrincipal);
		
		labelAves.setBounds(5, 45, 90, 20);
		labelAves.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelAves);
		
		labelReptiles.setBounds(105, 45, 90, 20);
		labelReptiles.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelReptiles);
		
		labelPeces.setBounds(205, 45, 90, 20);
		labelPeces.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelPeces);
		
		labelFelinos.setBounds(305, 45, 90, 20);
		labelFelinos.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelFelinos);
		
		labelPrimates.setBounds(405, 45, 90, 20);
		labelPrimates.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelPrimates);
		
		labelBovinos.setBounds(505, 45, 90, 20);
		labelBovinos.setHorizontalAlignment(JLabel.HORIZONTAL);
		panelIngresar.add(labelBovinos);
		
		
		
		//BOTON COMENZAR
		botonComenzar.setBounds(90, 300, 200, 75);
		panelInicio.add(botonComenzar);
		marcoPrincipal.add(panelInicio);
		marcoPrincipal.setContentPane(panelInicio);
		botonComenzar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("MENU ZOOLOGICO");
				marcoPrincipal.setContentPane(panelMenu);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
			}
		});
		//BOTON VOLVER INICIO PROGRAMA
		botonVolverInicio.setBounds(5,5,85,25);
		panelMenu.add(botonVolverInicio);
		botonVolverInicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("ZOOLOGICO PROYECTO 2");
				marcoPrincipal.setContentPane(panelInicio);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
			}
		});
		//BOTON VOLVER MENU
		botonVolverMenu.setBounds(5,5,85,25);
		botonVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("MENU ZOOLOGICO");
				marcoPrincipal.setContentPane(panelMenu);
				marcoPrincipal.setSize(400, 600);
				marcoPrincipal.setLocationRelativeTo(null);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
			}
		});
		//BOTON VOLVER INGRESO 
		botonVolverIngreso.setBounds(5,5,85,25);
		botonVolverIngreso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("MENU INGRESAR ANIMAL");
				panelIngresarStandard.remove(labelAguila);
				panelIngresarStandard.remove(labelPinguino);
				panelIngresarStandard.remove(labelSerpiente);
				panelIngresarStandard.remove(labelCocodrilo);
				panelIngresarStandard.remove(labelKoi);
				panelIngresarStandard.remove(labelPez_globo);
				panelIngresarStandard.remove(labelGuepardo);
				panelIngresarStandard.remove(labelPuma);
				panelIngresarStandard.remove(labelMono);
				panelIngresarStandard.remove(labelGorila);
				panelIngresarStandard.remove(labelVaca);
				panelIngresarStandard.remove(labelToro);
				
				marcoPrincipal.setContentPane(panelIngresar);
				marcoPrincipal.setSize(620,240);
				marcoPrincipal.setLocationRelativeTo(null);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
				
				textFieldApodo.setText(null);
				textFieldEdad.setText(null);
				textFieldPeso.setText(null);
				textFieldTamanoSerpiente.setText(null);
				textFieldVeneno.setText(null);
				textFieldDescLeche.setText(null);
			}
		});
		//BOTON INGRESAR
		botonIngresar.setBounds(70, 120, 120, 215);
		panelMenu.add(botonIngresar);
		botonIngresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("MENU INGRESAR ANIMAL");
				JLabel labelIngresar = new JLabel ("MENU DE INGRESOS");
				labelIngresar.setBounds(220, 15, 200, 15);
				labelIngresar.setFont(fontResaltar);
				panelIngresar.add(labelIngresar);
				panelIngresar.add(botonVolverMenu);
				marcoPrincipal.setContentPane(panelIngresar);
				marcoPrincipal.setSize(620,240);
				marcoPrincipal.setLocationRelativeTo(null);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
			}
		});
		//BOTON VER INGRESADOS
		botonVer.setBounds(195, 120, 120, 215);
		panelMenu.add(botonVer);
		
		botonVer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame_visualizar frameVer = new Frame_visualizar(animalesZoo);
				//System.out.println(animalesZoo);
				frameVer.getFrame_visualizar();
			}
		});
		
		//BOTON VER CARACTERISTICAS DE LOS ANIMALES
		Frame_caracteristicas instanciaVerCaracteristicas = new Frame_caracteristicas();
		botonVerCaracteristicas.setBounds(70, 340, 245, 60);
		panelMenu.add(botonVerCaracteristicas);
		botonVerCaracteristicas.addActionListener(instanciaVerCaracteristicas);
		
		/*
		 * A PARTIR DE AQUI TODO ES REFERENTE A INGRESOS DE LOS ANIMALES, HAY REDUNDANCIA DE CODIGO...
		 * ESTO CON LA FINALIDAD DE EVITAR CUALQUIER INCONVENIENTE A LA HORA DE INSTANCIAR ANIMALES...
		*/
		
		//BOTON INGRESAR AGUILA
		botonIngresarAguila.setBounds(5, 70, 90, 30);
		panelIngresar.add(botonIngresarAguila);
		botonIngresarAguila.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoPrincipal.setTitle("Ingresar Aguila");
				setearElementosIngreso(panelIngresarStandard);
				labelAguila.setBounds(280, 0, 80, 25);
				panelIngresarStandard.add(labelAguila);
				marcoPrincipal.setContentPane(panelIngresarStandard);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
				botonAceptarIngreso.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent h) {
						try {
							animalesZoo.add(new Aguila(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
							System.out.println("Aguila ingresada...");
							JOptionPane.showMessageDialog(null, "Aguila Ingresada exitosamente...");
							textFieldApodo.setText(null);
							textFieldEdad.setText(null);
							textFieldPeso.setText(null);
							panelIngresarStandard.remove(labelAguila);
							iteracion++;
							System.out.println("it proxima: " + iteracion);
							marcoPrincipal.setSize(400,600);
							marcoPrincipal.setLocationRelativeTo(null);
							marcoPrincipal.setContentPane(panelMenu);
						}
						catch(NumberFormatException e) {
							
						}
					}
				});
			}
		});//FINALIZA BOTON INGRESO AGUILA
		
		//BOTON INGRESAR PINGUINO
		botonIngresarPinguino.setBounds(5, 110, 90, 30);
		panelIngresar.add(botonIngresarPinguino);
		botonIngresarPinguino.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//PANEL PARA EL INGRESO DE LOS DATOS DEL PINGUINO (STANDARD)
				marcoPrincipal.setTitle("Ingresar pinguino");
				labelPinguino.setBounds(280, 0, 80, 25);
				panelIngresarStandard.add(labelPinguino);
				setearElementosIngreso(panelIngresarStandard);
				marcoPrincipal.setContentPane(panelIngresarStandard);
				marcoPrincipal.invalidate();
				marcoPrincipal.validate();
				botonAceptarIngreso.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent h) {
						try {
							animalesZoo.add(new Pinguino(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
							JOptionPane.showMessageDialog(null, "Pinguino ingresado exitosamente...");
							textFieldApodo.setText(null);
							textFieldEdad.setText(null);
							textFieldPeso.setText(null);
							panelIngresarStandard.remove(labelPinguino);
							iteracion++;
							System.out.println("it proxima: " + iteracion);
							marcoPrincipal.setSize(400,600);
							marcoPrincipal.setLocationRelativeTo(null);
							marcoPrincipal.setContentPane(panelMenu);
						}
						catch(NumberFormatException e) {
							
						}
					}
				});
			}
		});//FINALIZA BOTON INGRESO PINGUINO
		
		//BOTON INGRESAR SERPIENTE
				botonIngresarSerpiente.setBounds(105, 70, 90, 30);
				panelIngresar.add(botonIngresarSerpiente);
				botonIngresarSerpiente.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL INGRESAR SERPIENTE (ESPECIAL "TAMANO SERPIENTE")
						marcoPrincipal.setTitle("Ingresar serpiente");
						labelSerpiente.setBounds(280, 0, 80, 25);
						panelIngresarSerpiente.add(labelSerpiente);
						setearElementosIngreso(panelIngresarSerpiente);
						labelTamanoSerpiente.setBounds(200, 120, 120, 20);
						panelIngresarSerpiente.add(labelTamanoSerpiente);
						textFieldTamanoSerpiente.setBounds(275, 120, 120, 20);
						panelIngresarSerpiente.add(textFieldTamanoSerpiente);
						marcoPrincipal.setContentPane(panelIngresarSerpiente);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Serpiente(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText()), textFieldTamanoSerpiente.getText()));
									JOptionPane.showMessageDialog(null, "Serpiente ingresada exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelPinguino);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO SERPIENTE
		
				//BOTON INGRESAR COCODRILO
				botonIngresarCocodrilo.setBounds(105, 110, 90, 30);
				panelIngresar.add(botonIngresarCocodrilo);
				botonIngresarCocodrilo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL COCODRILO (STANDARD)
						marcoPrincipal.setTitle("Ingresar cocodrilo");
						labelCocodrilo.setBounds(280, 0, 80, 25);
						panelIngresarStandard.add(labelCocodrilo);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Cocodrilo(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Cocodrilo ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelCocodrilo);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO COCODRILO
				
				//BOTON INGRESAR KOI
				botonIngresarKoi.setBounds(205, 70, 90, 30);
				panelIngresar.add(botonIngresarKoi);
				botonIngresarKoi.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL KOI (STANDARD)
						marcoPrincipal.setTitle("Ingresar koi");
						labelKoi.setBounds(280, 0, 80, 25);
						panelIngresarStandard.add(labelKoi);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Koi(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Koi ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelKoi);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO KOI
				
				//BOTON INGRESAR PEZ GLOBO
				botonIngresarPez_globo.setBounds(205, 110, 90, 30);
				panelIngresar.add(botonIngresarPez_globo);
				botonIngresarPez_globo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL INGRESAR PEZ GLOBO (ESPECIAL "DESCRIPCION VENENO")
						marcoPrincipal.setTitle("Ingresar pez globo");
						panelIngresarPez_globo.add(labelPez_globo);
						labelPez_globo.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarPez_globo);
						labelVeneno.setBounds(150, 120, 130, 20);
						panelIngresarPez_globo.add(labelVeneno);
						textFieldVeneno.setBounds(275, 120, 120, 20);
						panelIngresarPez_globo.add(textFieldVeneno);
						marcoPrincipal.setContentPane(panelIngresarPez_globo);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Pez_globo(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText()), textFieldVeneno.getText()));
									JOptionPane.showMessageDialog(null, "Pez globo ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									textFieldVeneno.setText(null);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO PEZ GLOBO
				
				//BOTON INGRESAR GUEPARDO
				botonIngresarGuepardo.setBounds(305, 70, 90, 30);
				panelIngresar.add(botonIngresarGuepardo);
				botonIngresarGuepardo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL GUEPARDO (STANDARD)
						marcoPrincipal.setTitle("Ingresar guepardo");
						panelIngresarStandard.add(labelGuepardo);
						labelGuepardo.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Guepardo(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Guepardo ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelGuepardo);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO GUEPARDO
				
				//BOTON INGRESAR PUMA
				botonIngresarPuma.setBounds(305, 110, 90, 30);
				panelIngresar.add(botonIngresarPuma);
				botonIngresarPuma.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL PUMA (STANDARD)
						marcoPrincipal.setTitle("Ingresar puma");
						panelIngresarStandard.add(labelPuma);
						labelPuma.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Puma(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Puma ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelPuma);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO PUMA
				
				//BOTON INGRESAR MONO
				botonIngresarMono.setBounds(405, 70, 90, 30);
				panelIngresar.add(botonIngresarMono);
				botonIngresarMono.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL MONO (STANDARD)
						marcoPrincipal.setTitle("Ingresar mono");
						panelIngresarStandard.add(labelMono);
						labelMono.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Mono(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Mono ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelMono);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO MONO
				
				//BOTON INGRESAR GORILA
				botonIngresarGorila.setBounds(405, 110, 90, 30);
				panelIngresar.add(botonIngresarGorila);
				botonIngresarGorila.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL GORILA (STANDARD)
						marcoPrincipal.setTitle("Ingresar gorila");
						panelIngresarStandard.add(labelGorila);
						labelGorila.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Gorila(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Gorila ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelGorila);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO GORILA
				
				//BOTON INGRESAR VACA
				botonIngresarVaca.setBounds(505, 70, 90, 30);
				panelIngresar.add(botonIngresarVaca);
				botonIngresarVaca.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL INGRESAR VACA (ESPECIAL "DESCRIPCION LECHE")
						marcoPrincipal.setTitle("Ingresar vaca");
						panelIngresarVaca.add(labelVaca);
						labelVaca.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarVaca);
						labelDescLeche.setBounds(115, 120, 150, 20);
						panelIngresarVaca.add(labelDescLeche);
						textFieldDescLeche.setBounds(275, 120, 120, 20);
						panelIngresarVaca.add(textFieldDescLeche);
						marcoPrincipal.setContentPane(panelIngresarVaca);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Vaca(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText()), textFieldDescLeche.getText()));
									JOptionPane.showMessageDialog(null, "Vaca ingresada exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									textFieldDescLeche.setText(null);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);	
									marcoPrincipal.setContentPane(panelMenu);

								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO VACA
				
				//BOTON INGRESAR TORO
				botonIngresarToro.setBounds(505, 110, 90, 30);
				panelIngresar.add(botonIngresarToro);
				botonIngresarToro.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//PANEL PARA EL INGRESO DE LOS DATOS DEL TORO (STANDARD)
						marcoPrincipal.setTitle("Ingresar toro");
						panelIngresarStandard.add(labelToro);
						labelToro.setBounds(280, 0, 80, 25);
						setearElementosIngreso(panelIngresarStandard);
						marcoPrincipal.setContentPane(panelIngresarStandard);
						marcoPrincipal.invalidate();
						marcoPrincipal.validate();
						botonAceptarIngreso.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent h) {
								try {
									animalesZoo.add(new Toro(textFieldApodo.getText(),Integer.parseInt(textFieldEdad.getText()), Double.parseDouble(textFieldPeso.getText())));
									JOptionPane.showMessageDialog(null, "Toro ingresado exitosamente...");
									textFieldApodo.setText(null);
									textFieldEdad.setText(null);
									textFieldPeso.setText(null);
									panelIngresarStandard.remove(labelToro);
									iteracion++;
									System.out.println("it proxima: " + iteracion);
									marcoPrincipal.setSize(400,600);
									marcoPrincipal.setLocationRelativeTo(null);
									marcoPrincipal.setContentPane(panelMenu);
								}
								catch(NumberFormatException e) {
									
								}
							}
						});
					}
				});//FINALIZA BOTON INGRESO TORO
	}
}