package proyecto2_graficos;

//IMPORTS
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Esta clase permite mostrar las caracteristicas de los animales por categorias, seleccionadas por el usuario. 

public class Frame_caracteristicas implements ActionListener{

	//ATRIBUTOS
	//JFRAME
	private JFrame marcoCaracteristicas = new JFrame();
	//JPANEL
	private JPanel panelCaracteristicas = new JPanel();
	
	//JBUTTON
	JButton botonCaracteristicasOviparos = new JButton("OVIPAROS");
	JButton botonCaracteristicasViviparos = new JButton("VIVIPAROS");
	JButton botonCaracteristicasAguilas = new JButton("AGUILAS");
	JButton botonCaracteristicasPinguinos = new JButton("PINGUINOS");
	JButton botonCaracteristicasKoi = new JButton("KOIS");
	JButton botonCaracteristicasPez_globo = new JButton("PECES GLOBO");
	JButton botonCaracteristicasGuepardo = new JButton("GUEPARDOS");
	JButton botonCaracteristicasPuma = new JButton("PUMAS");
	JButton botonCaracteristicasMono = new JButton("MONOS");
	JButton botonCaracteristicasGorila = new JButton("GORILAS");
	JButton botonCaracteristicasVaca = new JButton("VACAS");
	JButton botonCaracteristicasToro = new JButton("TOROS");

	@Override
	public void actionPerformed(ActionEvent arg0) {

		//PARAMETROS DEL FRAME
		marcoCaracteristicas.setLayout(null);
		marcoCaracteristicas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marcoCaracteristicas.setSize(600,550);
		marcoCaracteristicas.setResizable(false);
		marcoCaracteristicas.setLocationRelativeTo(null);
		marcoCaracteristicas.setVisible(true);
		marcoCaracteristicas.setContentPane(panelCaracteristicas);
		marcoCaracteristicas.invalidate();
		marcoCaracteristicas.validate();
		panelCaracteristicas.setLayout(null);
		
		//FUENTE PARA LA IMPRESION DE LAS CARACTERISTICAS
		Font miFuente = new Font("Times New Roman", Font.PLAIN,20);
		Font fontTitulos = new Font ("Times New Roman",Font.BOLD,26);
		
						//JLABELS CARACTERISTICAS 
		
		JLabel caracOvip = new JLabel("<html>Los animales Oviparos son aquellos que ponen huevos. Los animales oviparos pueden ser agresivos cuando te acercas a sus nidos y huevos.<br><br>Comunmente otras especies comen los huevos de los animales oviparos para alimentarse.</html>");
		caracOvip.setFont(miFuente);
		caracOvip.setBounds(160, 150, 420, 210);
		caracOvip.setVisible(false);
		panelCaracteristicas.add(caracOvip);
		JLabel tituloOvip = new JLabel("OVIPAROS");
		tituloOvip.setBounds(160, 20, 400, 30);
		tituloOvip.setHorizontalAlignment(JLabel.CENTER);
		tituloOvip.setFont(fontTitulos);
		tituloOvip.setVisible(false);
		panelCaracteristicas.add(tituloOvip);

		JLabel caracVivip = new JLabel("<html>Los animales viviparos son aquellos que dan a luz. Pueden caminar sobre las palmas de sus manos y pies como los humanos y osos sobre sus dedos como los perros y gatos o sobre sus uñas como los caballos.<br><br>Los animales viviparos pueden vivir en la tierra, volar o en el agua. Son de sangre caliente.<html>");
		caracVivip.setFont(miFuente);
		caracVivip.setBounds(160, 150, 420, 210);
		caracVivip.setVisible(false);
		panelCaracteristicas.add(caracVivip);
		JLabel tituloVivip = new JLabel("VIVIPAROS");
		tituloVivip.setBounds(160, 20, 400, 30);
		tituloVivip.setHorizontalAlignment(JLabel.CENTER);
		tituloVivip.setFont(fontTitulos);
		tituloVivip.setVisible(false);
		panelCaracteristicas.add(tituloVivip);
				
		JLabel caracAguila = new JLabel("<html>Las aguilas ponen de uno a cinco huevos. Generalmente se encuentran en climas con bajas temperaturas y montañosos. Cuerpo cubierto de plumas... Las aguilas tienen la mejor vision de todos los animales.<br><br>Son aves de caza. Las aguilas vuelan alto y caen en picada hacia su presa.<html>");
		caracAguila.setFont(miFuente);
		caracAguila.setBounds(160, 150, 420, 210);
		caracAguila.setVisible(false);
		panelCaracteristicas.add(caracAguila);
		JLabel tituloAguila = new JLabel("AGUILA");
		tituloAguila.setBounds(160, 20, 400, 30);
		tituloAguila.setHorizontalAlignment(JLabel.CENTER);
		tituloAguila.setFont(fontTitulos);
		tituloAguila.setVisible(false);
		panelCaracteristicas.add(tituloAguila);
			
		JLabel caracPinguino = new JLabel("<html>Nada en aguas heladas y al salir su pelaje se mantiene como si nada. Son aves tranquilas que viven en comunidad y son tranquilas.<br><br>Camina de una manera curiosa dado sus pequeñas patas. Es un ave que no puede volar.<html>");
		caracPinguino.setFont(miFuente);
		caracPinguino.setBounds(160, 150, 420, 210);
		caracPinguino.setVisible(false);
		panelCaracteristicas.add(caracPinguino);
		JLabel tituloPinguino = new JLabel("PINGUINO");
		tituloPinguino.setBounds(160, 20, 400, 30);
		tituloPinguino.setHorizontalAlignment(JLabel.CENTER);
		tituloPinguino.setFont(fontTitulos);
		tituloPinguino.setVisible(false);
		panelCaracteristicas.add(tituloPinguino);
		
		JLabel caracKoi = new JLabel("<html>El koi es un pez tranquilo domesticable. Son muy comunes en el continente asiatico. Los koi nadan acompañados de su grupo.<br><br>Los Koi hembra pueden poner hasta 100mil huevos!. Pueden vivir en estanques de agua dulce, mares y lagos...<html>");
		caracKoi.setFont(miFuente);
		caracKoi.setBounds(160, 150, 420, 210);
		caracKoi.setVisible(false);
		panelCaracteristicas.add(caracKoi);
		JLabel tituloKoi = new JLabel("KOI");
		tituloKoi.setBounds(160, 20, 400, 30);
		tituloKoi.setHorizontalAlignment(JLabel.CENTER);
		tituloKoi.setFont(fontTitulos);
		tituloKoi.setVisible(false);
		panelCaracteristicas.add(tituloKoi);
		
		JLabel caracPez_globo = new JLabel("<html>El pez globo puede ser muy llamativo pero es muy peligroso. Al sentirse amenazado se hincha expulsando veneno. El pez globo mientras este tranquilo nada como cualquier otro.<br><br>Los pez globo pueden poner hasta 300 huevos.");
		caracPez_globo.setFont(miFuente);
		caracPez_globo.setBounds(160, 150, 420, 210);
		caracPez_globo.setVisible(false);
		panelCaracteristicas.add(caracPez_globo);
		JLabel tituloPez_globo = new JLabel("PEZ GLOBO");
		tituloPez_globo.setBounds(160, 20, 400, 30);
		tituloPez_globo.setHorizontalAlignment(JLabel.CENTER);
		tituloPez_globo.setFont(fontTitulos);
		tituloPez_globo.setVisible(false);
		panelCaracteristicas.add(tituloPez_globo);
		
		JLabel caracGuepardo = new JLabel("<html>Los guepardos tienen aproximadamente de 3 a 4 crias. Tienen pelaje amarillo con puntos de color oscuro. Se encuentran comunmente en zonas aridas de Africa.<br><br>Son muy sigilosos y pueden correr muy rapido. Gracias a sus garras y sus musculos pueden trepar arboles. Si se sienten amenazados haran daño. Es el animal terrestre mas veloz.");
		caracGuepardo.setFont(miFuente);
		caracGuepardo.setBounds(160, 150, 420, 210);
		caracGuepardo.setVisible(false);
		panelCaracteristicas.add(caracGuepardo);
		JLabel tituloGuepardo = new JLabel("GUEPARDO");
		tituloGuepardo.setBounds(160, 20, 400, 30);
		tituloGuepardo.setHorizontalAlignment(JLabel.CENTER);
		tituloGuepardo.setFont(fontTitulos);
		tituloGuepardo.setVisible(false);
		panelCaracteristicas.add(tituloGuepardo);
		
		JLabel caracPuma = new JLabel("<html>Los pumas tienen aproximadamente de 3 a 4 crias. Tienen pelaje negro. Se encuentran comunmente en zonas aridas de Africa.<br><br>El puma tiene un alto nivel de sigilo para atacar a sus presas. Pueden impulsarse para trepar arboles y alcanzar zonas eveladas. Felino muy territorial. Los pumas tienen buena vision nocturna.<html>");
		caracPuma.setFont(miFuente);
		caracPuma.setBounds(160, 150, 420, 210);
		caracPuma.setVisible(false);
		panelCaracteristicas.add(caracPuma);
		JLabel tituloPuma = new JLabel("PUMA");
		tituloPuma.setBounds(160, 20, 400, 30);
		tituloPuma.setHorizontalAlignment(JLabel.CENTER);
		tituloPuma.setFont(fontTitulos);
		tituloPuma.setVisible(false);
		panelCaracteristicas.add(tituloPuma);
		
		JLabel caracMono = new JLabel("<html>Los monos tienen aproximadamente de 3 a 4 crias. Tienen pelaje marron corto. Pueden vivir en zonas semi-aridas y junglas.<br><br>Caminan apoyados en sus pies y nudillos o solo en sus pies. Trepa facilmente los arboles y se pueden guindar de su cola.<br><br>Son muy intranquilos capaces de curosear cualquier rincon. El mono capuccino es el mas inteligente de todos a pesar de su tamaño.");
		caracMono.setFont(miFuente);
		caracMono.setBounds(160, 150, 420, 260);
		caracMono.setVisible(false);
		panelCaracteristicas.add(caracMono);
		JLabel tituloMono = new JLabel("MONO");
		tituloMono.setBounds(160, 20, 400, 30);
		tituloMono.setHorizontalAlignment(JLabel.CENTER);
		tituloMono.setFont(fontTitulos);
		tituloMono.setVisible(false);
		panelCaracteristicas.add(tituloMono);
		
		JLabel caracGorila = new JLabel("<html>Los gorilas tienen aproximadamente de 2 a 3 crias. Pelaje negro corto. Comunmente se encuentran en junglas. El gorila camina apoyado en sus pies y nudillos.<br><br>Trepan los arboles y se refugian al anochecer. Son animales inteligentes y tienen comportamientos parecidos al humano.<html>");
		caracGorila.setFont(miFuente);
		caracGorila.setBounds(160, 150, 420, 210);
		caracGorila.setVisible(false);
		panelCaracteristicas.add(caracGorila);
		JLabel tituloGorila = new JLabel("GORILA");
		tituloGorila.setBounds(160, 20, 400, 30);
		tituloGorila.setHorizontalAlignment(JLabel.CENTER);
		tituloGorila.setFont(fontTitulos);
		tituloGorila.setVisible(false);
		panelCaracteristicas.add(tituloGorila);
		
		JLabel caracVaca = new JLabel("<html>Usualmente las vacas tienen de 1 a 3 becerros. Tienen piel blanco con negro. Se encuentran en haciendas, fincas y granjas.<br><br>Las vacas son lentas y tranquilas. Procuran cuidar a sus becerros. Hay razas que son lecheras y otras que no.<html>");
		caracVaca.setFont(miFuente);
		caracVaca.setBounds(160, 150, 420, 210);
		caracVaca.setVisible(false);
		panelCaracteristicas.add(caracVaca);
		JLabel tituloVaca = new JLabel("VACA");
		tituloVaca.setBounds(160, 20, 400, 30);
		tituloVaca.setHorizontalAlignment(JLabel.CENTER);
		tituloVaca.setFont(fontTitulos);
		tituloVaca.setVisible(false);
		panelCaracteristicas.add(tituloVaca);
		
		JLabel caracToro = new JLabel("<html>Los toros no dan a luz. Tienen piel negra. El toro camina de forma imponente.<br><br>Busca la manera de atraer a las vacas para su reproduccion. Ven en blanco y negro, es decir, no ven el color rojo.<html>");
		caracToro.setFont(miFuente);
		caracToro.setBounds(160, 150, 420, 210);
		caracToro.setVisible(false);
		panelCaracteristicas.add(caracToro);
		JLabel tituloToro = new JLabel("TORO");
		tituloToro.setBounds(160, 20, 400, 30);
		tituloToro.setHorizontalAlignment(JLabel.CENTER);
		tituloToro.setFont(fontTitulos);
		tituloToro.setVisible(false);
		panelCaracteristicas.add(tituloToro);
		
		//BOTON CARACTERISTICAS DE LOS OVIPAROS
		botonCaracteristicasOviparos.setBounds(20, 20, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasOviparos);
		botonCaracteristicasOviparos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(true);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);
				
				tituloOvip.setVisible(true);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);


			}
		});
	
		//BOTON CARACTERISTICAS DE LOS VIVIPAROS
		botonCaracteristicasViviparos.setBounds(20, 60, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasViviparos);
		botonCaracteristicasViviparos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(true);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);
				
				tituloOvip.setVisible(false);
				tituloVivip.setVisible(true);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);

			}
		});
		
		//BOTON CARACTERISTICAS DE LAS AGUILAS
		botonCaracteristicasAguilas.setBounds(20, 100, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasAguilas);
		botonCaracteristicasAguilas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(true);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(true);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LOS PINGUINOS
		botonCaracteristicasPinguinos.setBounds(20, 140, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasPinguinos);
		botonCaracteristicasPinguinos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(true);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(true);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LOS KOI
		botonCaracteristicasKoi.setBounds(20, 180, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasKoi);
		botonCaracteristicasKoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(true);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(true);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LOS PECES GLOBO
		botonCaracteristicasPez_globo.setBounds(20, 220, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasPez_globo);
		botonCaracteristicasPez_globo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(true);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(true);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LOS GUEPARDOS
		botonCaracteristicasGuepardo.setBounds(20, 260, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasGuepardo);
		botonCaracteristicasGuepardo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(true);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);
				
				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(true);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);

			}
		});
		
		//BOTON CARACTERISTICAS DE LOS PUMA
		botonCaracteristicasPuma.setBounds(20, 300, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasPuma);
		botonCaracteristicasPuma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(true);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);
				
				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(true);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);

			}
		});
		
		//BOTON CARACTERISTICAS DE LOS MONO
		botonCaracteristicasMono.setBounds(20, 340, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasMono);
		botonCaracteristicasMono.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(true);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);
				
				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(true);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);

			}
		});
		
		//BOTON CARACTERISTICAS DE LOS GORILAS
		botonCaracteristicasGorila.setBounds(20, 380, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasGorila);
		botonCaracteristicasGorila.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(true);
				caracVaca.setVisible(false);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(true);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LAS VACAS
		botonCaracteristicasVaca.setBounds(20, 420, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasVaca);
		botonCaracteristicasVaca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(true);
				caracToro.setVisible(false);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(true);
				tituloToro.setVisible(false);
			}
		});
		
		//BOTON CARACTERISTICAS DE LOS TOROS
		botonCaracteristicasToro.setBounds(20, 460, 120, 30);
		panelCaracteristicas.add(botonCaracteristicasToro);
		botonCaracteristicasToro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caracOvip.setVisible(false);
				caracVivip.setVisible(false);
				caracAguila.setVisible(false);
				caracPinguino.setVisible(false);
				caracKoi.setVisible(false);
				caracPez_globo.setVisible(false);
				caracGuepardo.setVisible(false);
				caracPuma.setVisible(false);
				caracMono.setVisible(false);
				caracGorila.setVisible(false);
				caracVaca.setVisible(false);
				caracToro.setVisible(true);

				tituloOvip.setVisible(false);
				tituloVivip.setVisible(false);
				tituloAguila.setVisible(false);
				tituloPinguino.setVisible(false);
				tituloKoi.setVisible(false);
				tituloPez_globo.setVisible(false);
				tituloGuepardo.setVisible(false);
				tituloPuma.setVisible(false);
				tituloMono.setVisible(false);
				tituloGorila.setVisible(false);
				tituloVaca.setVisible(false);
				tituloToro.setVisible(true);
			}
		});
		
	}

}
