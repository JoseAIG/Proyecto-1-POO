package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_nadar;
import proyecto1_poo.clases.Ave;

public class Pinguino extends Ave implements Interface_caminar, Interface_nadar{

	//CONSTRUCTOR PINGUINO
	public Pinguino(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Pinguino");
		this.setCantidad_de_huevos("Los pinguinos ponen de uno a tres huevos.");
		this.setSkin("Pelaje muy corto, de color negro y blanco.");
		this.setHabitat("Los pinguinos habitan climas templados.");
	}

	//OVERRIDE INTERFACES
	@Override
	public String nadar() {
		return "Nada en aguas heladas y al salir su pelaje se mantiene como si nada.";
	}

	@Override
	public String caminar() {
		return "Camina de una manera curiosa dado sus pequeñas patas.";
	}
	
	//OVERRIDES DE LA CLASE ABSTRACTA ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Son aves tranquilas que viven en comunidad y son tranquilas.";
	}
	
	@Override
	public String funFact() {
		return "Es un ave que no puede volar.";
	}
}
