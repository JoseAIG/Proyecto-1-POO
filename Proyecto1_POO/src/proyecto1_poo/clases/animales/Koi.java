package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_nadar;
import proyecto1_poo.clases.Pez;

public class Koi extends Pez implements Interface_nadar{

	//CONSTRUCTORES KOI
	public Koi(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Koi");
		this.setCantidad_de_huevos("Los Koi hembra pueden poner hasta 100mil huevos!.");
		this.setSkin("Piel escamosa variocolor");
		this.setHabitat("Pueden vivir en estanques de agua dulce, mares y lagos...");
	}
	
	public Koi(int edad, double peso) {
		super(edad, peso);
		this.setNombre("Koi");
		this.setCantidad_de_huevos("Los Koi hembra pueden poner hasta 100mil huevos!.");
		this.setSkin("Piel escamosa variocolor");
		this.setHabitat("Pueden vivir en estanques de agua dulce, mares y lagos...");
	}

	//OVERRIDE INTERFAZ
	@Override
	public String nadar() {
		return "Los koi nadan acompañados de su grupo.";
	}
	
	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "El koi es un pez tranquilo domesticable.";
	}
		
	@Override
	public String funFact() {
		return "Son muy comunes en el continente asiatico.";
	}

}
