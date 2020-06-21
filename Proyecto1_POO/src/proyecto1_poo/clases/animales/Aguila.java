package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_volar;
import proyecto1_poo.clases.Ave;

public class Aguila extends Ave implements Interface_volar, Interface_caminar{
	
	//CONSTRUCTOR AGUILA
	public Aguila(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Aguila");
		this.setCantidad_de_huevos("De uno a cinco huevos.");
		this.setSkin("Cuerpo cubierto de plumas...");
		this.setHabitat("Generalmente se encuentran en climas con bajas temperaturas y montañosos");
		
	}

	//OVERRIDES DE LA CLASE ABSTRACTA ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Son aves de caza.";
	}
	
	@Override
	public String funFact() {
		return "Las aguilas tienen la mejor vision de todos los animales.";
	}
	
	//OVERRIDES DE LAS INTERFACES
	@Override
	public String caminar() {
		return "Forma de caminar del aguila.";
	}

	@Override
	public String volar() {
		return "Las aguilas vuelan alto y caen en picada hacia su presa.";
	}

	//POLIMORFISMO toString
	/*
	public String toString() {
		return super.toString() + "\n" +this.volar() + "\n" + this.caminar();
	}
	*/

}
