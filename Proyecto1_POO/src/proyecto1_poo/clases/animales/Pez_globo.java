package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_nadar;
import proyecto1_poo.clases.Pez;

public class Pez_globo extends Pez implements Interface_nadar{

	private String veneno;
	
	public Pez_globo(String apodo_animal, int edad, double peso, String veneno) {
		super(apodo_animal, edad, peso);
		this.setNombre("Pez Globo");
		this.setCantidad_de_huevos("Los pez globo pueden poner hasta 300 huevos.");
		this.setSkin("Piel expandible puyosa.");
		this.setHabitat("Viven en oceanos y mares de agua salada.");
		this.veneno=veneno;
	}
	
	public Pez_globo(int edad, double peso, String veneno) {
		super(edad,peso);
		this.setNombre("Pez Globo");
		this.setCantidad_de_huevos("Los pez globo pueden poner hasta 300 huevos.");
		this.setSkin("Piel expandible puyosa.");
		this.setHabitat("Viven en oceanos y mares de agua salada.");
		this.veneno=veneno;
	}

	//OVERRIDE INTERFACE NADAR
	@Override
	public String nadar() {
		return "El pez globo mientras este tranquilo nada como cualquier otro.";
	}

	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Al sentirse amenazado se hincha expulsando veneno.";
	}
			
	@Override
	public String funFact() {
		return "Puede ser muy llamativo pero es muy peligroso.";
	}
			
	//POLIMORFISMO toString
	public String toString() {
		return super.toString() + " Descripcion veneno: " + veneno;
	}
	
}
