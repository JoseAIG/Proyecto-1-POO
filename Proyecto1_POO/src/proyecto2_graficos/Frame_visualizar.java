package proyecto2_graficos;

//IMPORTS
import proyecto3_database.database;
import javax.swing.*;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Frame_visualizar... EN ESTA CLASE ESTA TODO EL CONTENIDO PARA: 
 * 
 * -VISUALIZAR TODAS LAS TABLAS DE LOS ANIMALES (GLOBAL, ES DECIR TODOS LOS ANIMALES DEL ZOO Y LAS TABLAS PROPIAS DE CADA TIPO DE ANIMAL)
 * -MODIFICAR PARAMETROS DE LOS ANIMALES EN LAS DIVERSAS TABLAS DE LA BBDD (APODO, EDAD, PESO)
 * -ELIMINAR ANIMALES DE LA BBDD (LA ELIMINACION ES POR ID, SE INGRESA EL ID DEL ANIMAL A ELIMINAR)
 */

public class Frame_visualizar{
	
	database dbVer = database.getInstances();
	
	//FRAME
	private JFrame marcoVisualizar = new JFrame();
	private JFrame marcoEditar = new JFrame();
	
	//JPANELS
	private JPanel panelMenuVer = new JPanel();
	private JPanel panelEliminar = new JPanel();
	private JPanel panelInicioModificar = new JPanel();
	private JPanel panelMenuModificar = new JPanel();
	private JPanel panelModificarApodo = new JPanel();
	private JPanel panelModificarEdad = new JPanel();
	private JPanel panelModificarPeso = new JPanel();	
	
	//JBUTTONS
	private JButton botonTablaTodos = new JButton("TODOS");
	private JButton botonTablaAguilas = new JButton("AGUILAS");
	private JButton botonTablaPinguinos = new JButton("PINGUINOS");
	private JButton botonTablaSerpientes = new JButton("SERPIENTES");
	private JButton botonTablaCocodrilos = new JButton("COCODRILOS");
	private JButton botonTablaKois = new JButton("KOIS");
	private JButton botonTablaPeces_globo = new JButton ("P.GLOBO");
	private JButton botonTablaGuepardos = new JButton("GUEPARDOS");
	private JButton botonTablaPumas = new JButton("PUMAS");
	private JButton botonTablaMonos = new JButton("MONOS");
	private JButton botonTablaGorilas = new JButton("GORILAS");
	private JButton botonTablaVacas = new JButton("VACAS");
	private JButton botonTablaToros = new JButton("TOROS");
	
	private JButton botonModificarAnimal = new JButton("MODIFICAR");
	private JButton botonEliminarAnimal = new JButton("ELIMINAR");
	private JButton botonConfirmarEliminacion = new JButton("CONFIRMAR");
		
	private JButton botonConfirmarIDModificar = new JButton("AVANZAR");
	
	private JButton botonModificarNombre = new JButton("NOMBRE");
	private JButton botonModificarEdad = new JButton("EDAD");
	private JButton botonModificarPeso = new JButton ("PESO");

	private JButton botonAceptarModificarNombre = new JButton("ACEPTAR");
	private JButton botonAceptarModificarEdad = new JButton("ACEPTAR");
	private JButton botonAceptarModificarPeso = new JButton("ACEPTAR");
	
	private JButton botonVolverInicioModificar = new JButton("regresar");
	private JButton botonVolverMenuDeModificarNombre = new JButton("regresar");
	private JButton botonVolverMenuDeModificarEdad = new JButton("regresar");
	private JButton botonVolverMenuDeModificarPeso = new JButton("regresar");

	//JTEXTAREA
	private JTextArea textAreaTodos = new JTextArea();
	private JTextArea textAreaAguilas = new JTextArea();
	private JTextArea textAreaPinguinos = new JTextArea();
	private JTextArea textAreaSerpientes = new JTextArea();
	private JTextArea textAreaCocodrilos = new JTextArea();
	private JTextArea textAreaKois = new JTextArea();
	private JTextArea textAreaPeces_globo = new JTextArea();
	private JTextArea textAreaGuepardos = new JTextArea();
	private JTextArea textAreaPumas = new JTextArea();
	private JTextArea textAreaMonos = new JTextArea();
	private JTextArea textAreaGorilas = new JTextArea();
	private JTextArea textAreaVacas = new JTextArea();
	private JTextArea textAreaToros = new JTextArea();

	//JSCROLLPANE QUE SIRVE COMO CONTAINER PARA EL TEXT AREA TODOS 
	private JScrollPane scrollPaneTablaTodos;

	//JTEXTFIELDS
	private JTextField textFieldEliminar = new JTextField();
	private JTextField textFieldIDModificar = new JTextField();
	private JTextField textFieldModificarApodo = new JTextField();
	private JTextField textFieldModificarEdad = new JTextField();
	private JTextField textFieldModificarPeso = new JTextField();
	
	//JLABELS
	private JLabel labelEliminarAnimal = new JLabel("Ingrese No. ID del animal a eliminar");
	private JLabel labelInicioModificarAnimal = new JLabel("Ingrese No. ID del animal a modificar");
	private JLabel labelMenuModificarAnimal = new JLabel("Seleccione caracteristica a modificar...");
	private JLabel labelModificarApodo = new JLabel ("Ingrese nuevo apodo para el animal");
	private JLabel labelModificarEdad = new JLabel ("Ingrese nueva edad para el animal");
	private JLabel labelModificarPeso = new JLabel ("Ingrese nuevo peso para el animal");
	
	//OTROS ATRIBUTOS
	private String entradaModificar=null;
	private String entradaEliminar=null;
		
	//CONSTRUCTOR DEL FRAME VISUALIZAR
	public Frame_visualizar(){
		
		//Frame_principal framePrincipal = new Frame_principal();
		
		//CARACTERISTICAS DE LOS FRAMES
		marcoVisualizar.setLayout(null);
		marcoVisualizar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marcoVisualizar.setSize(735,400);
		marcoVisualizar.setResizable(false);
		marcoVisualizar.setLocationRelativeTo(null);
		marcoVisualizar.setVisible(true);
		
		marcoEditar.setLayout(null);
		marcoEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marcoEditar.setSize(450,250);
		marcoEditar.setLocationRelativeTo(null);
		marcoEditar.setVisible(false);
		
		//JPANELS
		panelEliminar.setLayout(null);
		
		//JBUTTONS DE TABLAS
		botonTablaTodos.setBounds(5, 5, 75, 20);
		botonTablaAguilas.setBounds(5, 30, 75, 20);
		botonTablaPinguinos.setBounds(5, 55, 75, 20);
		botonTablaSerpientes.setBounds(5, 80, 75, 20);
		botonTablaCocodrilos.setBounds(5, 105, 75, 20);
		botonTablaKois.setBounds(5, 130, 75, 20);
		botonTablaPeces_globo.setBounds(5, 155, 75, 20);
		botonTablaGuepardos.setBounds(5, 180, 75, 20);
		botonTablaPumas.setBounds(5,205,75,20);
		botonTablaMonos.setBounds(5, 230, 75, 20);
		botonTablaGorilas.setBounds(5,255,75,20);
		botonTablaVacas.setBounds(5, 280, 75, 20);
		botonTablaToros.setBounds(5, 305, 75, 20);
		
		botonModificarAnimal.setBounds(650, 290, 75, 20);
		botonEliminarAnimal.setBounds(650, 315, 75, 20);
		
		//JTEXTAREAS
		textAreaTodos.setText("LISTA DE TODOS LOS ANIMALES\n" + dbVer.dbStatementTablaCompletaString("SELECT *FROM animales ORDER BY identificacion ASC"));
		textAreaTodos.setBounds(85, 0, 535, 800);
		textAreaTodos.setBackground(SystemColor.menu);
		
		//JSCROLLPANE TABLA TODOS LOS ANIMALES
		scrollPaneTablaTodos = new JScrollPane(textAreaTodos);
		scrollPaneTablaTodos.setBounds(85,0,560,365);
		scrollPaneTablaTodos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		//JTEXTAREAS DE TODAS LAS TABLAS DE LOS ANIMALES
		textAreaAguilas.setText("LISTA DE TODAS LAS AGUILAS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM aguilas ORDER BY identificacion ASC"));
		textAreaAguilas.setBounds(85, 0, 500, 400);
		textAreaAguilas.setBackground(SystemColor.menu);
		
		textAreaPinguinos.setText("LISTA DE TODOS LOS PINGUINOS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM pinguinos ORDER BY identificacion ASC"));
		textAreaPinguinos.setBounds(85, 0, 500, 400);
		textAreaPinguinos.setBackground(SystemColor.menu);
		
		textAreaSerpientes.setText("LISTA DE TODAS LAS SERPIENTES\n" + dbVer.dbStmtTablaEspecialesString("SELECT *FROM serpientes ORDER BY identificacion ASC"));
		textAreaSerpientes.setBounds(85, 0, 500, 400);
		textAreaSerpientes.setBackground(SystemColor.menu);
		
		textAreaCocodrilos.setText("LISTA DE TODOS LOS COCODRILOS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM cocodrilos ORDER BY identificacion ASC"));
		textAreaCocodrilos.setBounds(85, 0, 500, 400);
		textAreaCocodrilos.setBackground(SystemColor.menu);
		
		textAreaKois.setText("LISTA DE TODOS LOS KOIS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM kois ORDER BY identificacion ASC"));
		textAreaKois.setBounds(85, 0, 500, 400);
		textAreaKois.setBackground(SystemColor.menu);
		
		textAreaPeces_globo.setText("LISTA DE TODOS LOS PECES GLOBO\n" + dbVer.dbStmtTablaEspecialesString("SELECT *FROM peces_globo ORDER BY identificacion ASC"));
		textAreaPeces_globo.setBounds(85, 0, 500, 400);
		textAreaPeces_globo.setBackground(SystemColor.menu);
		
		textAreaGuepardos.setText("LISTA DE TODOS LOS GUEPARDOS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM guepardos ORDER BY identificacion ASC"));
		textAreaGuepardos.setBounds(85, 0, 500, 400);
		textAreaGuepardos.setBackground(SystemColor.menu);
		
		textAreaPumas.setText("LISTA DE TODOS LOS PUMAS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM pumas ORDER BY identificacion ASC"));
		textAreaPumas.setBounds(85, 0, 500, 400);
		textAreaPumas.setBackground(SystemColor.menu);
		
		textAreaMonos.setText("LISTA DE TODOS LOS MONOS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM monos ORDER BY identificacion ASC"));
		textAreaMonos.setBounds(85, 0, 500, 400);
		textAreaMonos.setBackground(SystemColor.menu);
		
		textAreaGorilas.setText("LISTA DE TODOS LOS GORILAS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM gorilas ORDER BY identificacion ASC"));
		textAreaGorilas.setBounds(85, 0, 500, 400);
		textAreaGorilas.setBackground(SystemColor.menu);
		
		textAreaVacas.setText("LISTA DE TODOS LAS VACAS\n" + dbVer.dbStmtTablaEspecialesString("SELECT *FROM vacas ORDER BY identificacion ASC"));
		textAreaVacas.setBounds(85, 0, 500, 400);
		textAreaVacas.setBackground(SystemColor.menu);
		
		textAreaToros.setText("LISTA DE TODOS LOS TOROS\n" + dbVer.dbStmtTablaPropiaString("SELECT *FROM toros ORDER BY identificacion ASC"));
		textAreaToros.setBounds(85, 0, 500, 400);
		textAreaToros.setBackground(SystemColor.menu);
		
		//PANEL MENU VER
		
		panelMenuVer.setLayout(null);
		
		panelMenuVer.add(botonTablaTodos);
		panelMenuVer.add(botonTablaAguilas);
		panelMenuVer.add(botonTablaPinguinos);
		panelMenuVer.add(botonTablaSerpientes);
		panelMenuVer.add(botonTablaCocodrilos);
		panelMenuVer.add(botonTablaKois);
		panelMenuVer.add(botonTablaPeces_globo);
		panelMenuVer.add(botonTablaGuepardos);
		panelMenuVer.add(botonTablaPumas);
		panelMenuVer.add(botonTablaMonos);
		panelMenuVer.add(botonTablaGorilas);
		panelMenuVer.add(botonTablaVacas);
		panelMenuVer.add(botonTablaToros);

		panelMenuVer.add(botonModificarAnimal);
		panelMenuVer.add(botonEliminarAnimal);
		botonEliminarAnimal.repaint();
		
		
		/*
		 * TODO LO REFERENTE A MODIFICAR ANIMALES
		 */
		
		//JBUTTONS
		botonConfirmarEliminacion.setBounds(170, 170, 120, 25);
		botonConfirmarIDModificar.setBounds(170, 170, 120, 25);
		botonAceptarModificarNombre.setBounds(170, 170, 120, 25);
		botonAceptarModificarEdad.setBounds(170, 170, 120, 25);
		botonAceptarModificarPeso.setBounds(170, 170, 120, 25);
		
		//JTEXTFIELDS
		textFieldEliminar.setBounds(200, 90, 60, 20);
		panelEliminar.add(textFieldEliminar);
		
		textFieldModificarApodo.setBounds(200, 90, 60, 20);
		panelModificarApodo.add(textFieldModificarApodo);
		
		textFieldModificarEdad.setBounds(200, 90, 60, 20);
		panelModificarEdad.add(textFieldModificarEdad);
		
		textFieldModificarPeso.setBounds(200, 90, 60, 20);
		panelModificarPeso.add(textFieldModificarPeso);
		
		//JLABELS
		labelEliminarAnimal.setBounds(135, 40, 200, 25);
		panelEliminar.add(labelEliminarAnimal);
		
		labelInicioModificarAnimal.setBounds(135, 40, 200, 25);
		panelInicioModificar.add(labelInicioModificarAnimal);
		
		labelMenuModificarAnimal.setBounds(120, 20, 225, 25);
		panelMenuModificar.add(labelMenuModificarAnimal);
		
		labelModificarApodo.setBounds(120, 40, 225, 25);
		panelModificarApodo.add(labelModificarApodo);
		
		labelModificarEdad.setBounds(120, 40, 225, 25);
		panelModificarEdad.add(labelModificarEdad);
		
		labelModificarPeso.setBounds(120, 40, 225, 25);
		panelModificarPeso.add(labelModificarPeso);
		

		marcoVisualizar.setContentPane(panelMenuVer);
		marcoVisualizar.getContentPane().add(scrollPaneTablaTodos);
		marcoVisualizar.invalidate();
		marcoVisualizar.validate();

		
		//CONFIGURACIONES DEL PANEL INICIO MODIFICAR (DONDE PIDE EL ID DEL ANIMAL Y COMPARA)
		panelInicioModificar.setLayout(null);
		panelInicioModificar.add(botonConfirmarIDModificar);
		textFieldIDModificar.setBounds(200, 90, 60, 20);
		panelInicioModificar.add(textFieldIDModificar);
		
		//CONFIGURACIONES DEL PANEL MENU MODIFICAR (DONDE SE SELECCIONA QUE ATRIBUTO DEL ANIMAL CON ID=n CAMBIAR)
		panelMenuModificar.setLayout(null);
		panelMenuModificar.add(botonVolverInicioModificar);
		
		//CONFIGURACIONES DEL PANEL PARA MODIFICAR EL NOMBRE
		panelModificarApodo.setLayout(null);
		botonModificarNombre.setBounds(70,65,85,60);
		panelMenuModificar.add(botonModificarNombre);
		panelModificarApodo.add(botonAceptarModificarNombre);
		panelModificarApodo.add(botonVolverMenuDeModificarNombre);
		
		//CONFIGURACIONES DEL PANEL PARA MODIFICAR LA EDAD
		panelModificarEdad.setLayout(null);
		botonModificarEdad.setBounds(180, 65, 85, 60);
		panelMenuModificar.add(botonModificarEdad);
		panelModificarEdad.add(botonAceptarModificarEdad);
		panelModificarEdad.add(botonVolverMenuDeModificarEdad);
				
		//CONFIGURACIONES DEL PANEL PARA MODIFICAR EL PESO
		panelModificarPeso.setLayout(null);
		botonModificarPeso.setBounds(290, 65, 85, 60);
		panelMenuModificar.add(botonModificarPeso);
		panelModificarPeso.add(botonAceptarModificarPeso);
		panelModificarPeso.add(botonVolverMenuDeModificarPeso);
		
		//ACCION AL PULSAR BOTON MODIFICAR EN FRAME VER
		botonModificarAnimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoEditar.setTitle("MODIFICAR ANIMAL");
				marcoEditar.setVisible(true);
				marcoEditar.setContentPane(panelInicioModificar);
				marcoEditar.invalidate();
				marcoEditar.validate();
			}
		});
		
		//ACTION LISTENER DEL BOTON CONFIRMAR ID PARA PROSEGUIR A MODIFICAR ANIMAL
		botonConfirmarIDModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				entradaModificar = textFieldIDModificar.getText();
				if((dbVer.dbStmtExisteID("SELECT *FROM animales where identificacion="+entradaModificar)==1)) {
					marcoEditar.setContentPane(panelMenuModificar);
					marcoEditar.invalidate();
					marcoEditar.validate();
					textFieldIDModificar.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "No existe animal con No. ID: " + entradaModificar);
				}
			}
		});
		
		//ACTION LISTENER DEL BOTON MODIFICAR NOMBRE
		botonModificarNombre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoEditar.setContentPane(panelModificarApodo);
				marcoEditar.invalidate();
				marcoEditar.validate();
				
				//System.out.println(dbVer.dbStatementExisteID("select *from animales where identificacion=3"));
				botonAceptarModificarNombre.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dbVer.dbModificarAnimal("update animales set apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "where identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("update aguilas set apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "where identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE pinguinos SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE serpientes SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE cocodrilos SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE kois SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE peces_globo SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE guepardos SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE pumas SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE monos SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE gorilas SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE vacas SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);
						dbVer.dbModificarAnimal("UPDATE toros SET apodo=" + "'" + textFieldModificarApodo.getText() + "'" + "WHERE identificacion="+entradaModificar);

						marcoEditar.dispose();
						marcoVisualizar.dispose();

					}
				});
			}
		});
		
		//ACTION LISTENER DEL BOTON MODIFICAR EDAD
		botonModificarEdad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoEditar.setContentPane(panelModificarEdad);
				marcoEditar.invalidate();
				marcoEditar.validate();				
				botonAceptarModificarEdad.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dbVer.dbModificarAnimal("update animales set edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "where identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("update aguilas set edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "where identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE pinguinos SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE serpientes SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE cocodrilos SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE kois SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE peces_globo SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE guepardos SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE pumas SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE monos SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE gorilas SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE vacas SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE toros SET edad=" + Integer.parseInt(textFieldModificarEdad.getText()) + "WHERE identificacion="+Integer.parseInt(entradaModificar));

						marcoEditar.dispose();
						marcoVisualizar.dispose();

					}
				});
			}
		});
		
		botonModificarPeso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoEditar.setContentPane(panelModificarPeso);
				marcoEditar.invalidate();
				marcoEditar.validate();
				botonAceptarModificarPeso.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent k) {
						dbVer.dbModificarAnimal("UPDATE animales SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE aguilas SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE pinguinos SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE serpientes SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE cocodrilos SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE kois SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE peces_globo SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE guepardos SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE pumas SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE monos SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE gorilas SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE vacas SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));
						dbVer.dbModificarAnimal("UPDATE toros SET peso="+Double.parseDouble(textFieldModificarPeso.getText())+"WHERE identificacion="+Integer.parseInt(entradaModificar));

						marcoEditar.dispose();
						marcoVisualizar.dispose();

					}
				});
			}
		});
		
		/*
		 * BOTONES QUE PERMITEN VOLVER DESDE EL APARTADO DE MODIFICAR NOMBRE, EDAD Y PESO AL MENU DE MODIFICAR
		 * TODOS TIENEN EL MISMO CODIGO PERO SON DIFERENTES BOTONES, ESTO ES DEBIDO A QUE UN COMPONENTE SOLO PUEDE ESTAR EN UN SOLO CONTAINER
		 */
		
		
		//BOTON VOLVER AL INICIO MODIFICAR ANIMAL
		botonVolverInicioModificar.setBounds(5, 5, 85, 25);
		botonVolverInicioModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoEditar.setContentPane(panelInicioModificar);
				marcoEditar.invalidate();
				marcoEditar.validate();
			}
		});
		
		
		//BOTON VOLVER AL MENU MODIFICAR DE MODIFICAR NOMBRE
		botonVolverMenuDeModificarNombre.setBounds(5, 5, 85, 25);
		botonVolverMenuDeModificarNombre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoEditar.setContentPane(panelMenuModificar);
				marcoEditar.invalidate();
				marcoEditar.validate();
			}
		});
		
		//BOTON VOLVER AL MENU MODIFICAR DE MODIFICAR EDAD
		botonVolverMenuDeModificarEdad.setBounds(5, 5, 85, 25);
		botonVolverMenuDeModificarEdad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoEditar.setContentPane(panelMenuModificar);
				marcoEditar.invalidate();
				marcoEditar.validate();
			}
		});
		
		//BOTON VOLVER AL MENU MODIFICAR DE MODIFICAR PESO
		botonVolverMenuDeModificarPeso.setBounds(5, 5, 85, 25);
		botonVolverMenuDeModificarPeso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoEditar.setContentPane(panelMenuModificar);
				marcoEditar.invalidate();
				marcoEditar.validate();
			}
		});
		
		/*
		 * TODO LO REFERENTE A ELIMINAR ANIMALES
		 */
		
		//ACCION AL PULSAR BOTON DE ELIMINAR ANIMAL EN FRAME VER
		botonEliminarAnimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoEditar.setTitle("ELIMINAR ANIMAL");
				marcoEditar.setVisible(true);
				marcoEditar.setContentPane(panelEliminar);
				marcoEditar.invalidate();
				marcoEditar.validate();
				panelEliminar.add(botonConfirmarEliminacion);
				botonConfirmarEliminacion.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						marcoEditar.setTitle("ELIMINAR ANIMAL");
						entradaEliminar = textFieldEliminar.getText();
						if((dbVer.dbStmtExisteID("SELECT *FROM animales WHERE identificacion="+entradaEliminar)==1)) {
							
							dbVer.dbModificarAnimal("DELETE FROM aguilas where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM pinguinos where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM serpientes where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM cocodrilos where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM kois where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM peces_globo where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM guepardos where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM pumas where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM monos where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM gorilas where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM vacas where identificacion="+entradaEliminar);
							dbVer.dbModificarAnimal("DELETE FROM toros where identificacion="+entradaEliminar);

							dbVer.dbModificarAnimal("DELETE FROM animales where identificacion="+entradaEliminar);
							
							JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
							marcoVisualizar.dispose();
							marcoEditar.dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "No existe animal con No. id: " + entradaEliminar);
							System.out.println("no existe animal con ese id");
						}

					}
				});
			}
		});
		
		
		/*
		 * A PARTIR DE AQUI HASTA EL FINAL, TODO EL CONTENIDO ES REFERENTE A MOSTRAR LAS TABLAS EN EL MENU DEL FRAME VER
		 */
		
		botonTablaTodos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//panelMenuVer.add(textAreaTodos);
				marcoVisualizar.getContentPane().add(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaAguilas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				//panelMenuVer.remove(textAreaTodos);
				panelMenuVer.add(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaPinguinos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				//panelMenuVer.remove(textAreaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.add(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaSerpientes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				//panelMenuVer.remove(textAreaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.add(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
	
		botonTablaCocodrilos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				//panelMenuVer.remove(textAreaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.add(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaKois.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.add(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaPeces_globo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.add(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaGuepardos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.add(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaPumas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.add(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaMonos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.add(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaGorilas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.add(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaVacas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.add(textAreaVacas);
				panelMenuVer.remove(textAreaToros);
				panelMenuVer.repaint();
			}
		});
		
		botonTablaToros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				marcoVisualizar.getContentPane().remove(scrollPaneTablaTodos);
				panelMenuVer.remove(textAreaAguilas);
				panelMenuVer.remove(textAreaPinguinos);
				panelMenuVer.remove(textAreaSerpientes);
				panelMenuVer.remove(textAreaCocodrilos);
				panelMenuVer.remove(textAreaKois);
				panelMenuVer.remove(textAreaPeces_globo);
				panelMenuVer.remove(textAreaGuepardos);
				panelMenuVer.remove(textAreaPumas);
				panelMenuVer.remove(textAreaMonos);
				panelMenuVer.remove(textAreaGorilas);
				panelMenuVer.remove(textAreaVacas);
				panelMenuVer.add(textAreaToros);
				panelMenuVer.repaint();
			}
		});
	
}
	
	//METODO getFrame_visualizar
	public JFrame getFrame_visualizar() {
		return this.marcoVisualizar;
	}

}
