package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_trepar;
import proyecto1_poo.clases.Felino;

public class Guepardo extends Felino implements Interface_caminar, Interface_trepar{

	//CONSTRUCTORES GUEPARDO
	public Guepardo(String nombre_animal, int edad, double peso) {
		super(nombre_animal, edad, peso);
		this.setNombre("Guepardo");
		this.setCrias_en_parto("Los guepardos tienen aproximadamente de 3 a 4 crias.");
		this.setSkin("Pelaje amarillo con puntos de color oscuro.");
		this.setHabitat("Se encuentran comunmente en zonas aridas de Africa.");
	}
	
	public Guepardo(int edad, double peso) {
		super(edad,peso);
		this.setNombre("Guepardo");
		this.setCrias_en_parto("Los guepardos tienen aproximadamente de 3 a 4 crias.");
		this.setSkin("Pelaje amarillo con puntos de color oscuro.");
		this.setHabitat("Se encuentran comunmente en zonas aridas de Africa.");
	}

	//OVERRIDE INTERFACES
	@Override
	public String caminar() {
		return "Son muy sigilosos y pueden correr muy rapido.";
	}
	
	@Override
	public String trepar() {
		return "Gracias a sus garras y sus musculos pueden trepar arboles.";
	}

	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Si se sienten amenazados haran daño.";
	}
		
	@Override
	public String funFact() {
		return "Es el animal terrestre mas veloz.";
	}
}
