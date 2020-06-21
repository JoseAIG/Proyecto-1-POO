package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.clases.Bovino;

public class Toro extends Bovino implements Interface_caminar{

	public Toro(String nombre_animal, int edad, double peso) {
		super(nombre_animal, edad, peso);
		this.setNombre("Toro");
		this.setCrias_en_parto("Los toros no dan a luz.");
		this.setSkin("Tienen piel negra");
		this.setHabitat("Se encuentran en haciendas, fincas y granjas.");
	}

	//OVERRIDE INTERFACE CAMINAR
	@Override
	public String caminar() {
		return "El toro camina de forma imponente.";
	}

	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Busca la manera de atraer a las vacas para su reproduccion.";
	}
				
	@Override
	public String funFact() {
		return "Ven en blanco y negro, es decir, no ven el color rojo.";
	}
}
