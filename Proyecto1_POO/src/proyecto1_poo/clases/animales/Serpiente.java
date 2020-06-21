package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_arrastrar;
import proyecto1_poo.clases.Reptil;


public class Serpiente extends Reptil implements Interface_arrastrar{

	//ATRIBUTOS CLASE SERPIENTE
	
	private String tamano_serpiente;
	
	//CONSTRUCTORES CLASE SERPIENTE

	public Serpiente(String apodo_animal, int edad, double peso) {
		super(edad, peso);
		this.setNombre("Serpiente");
		this.setApodo_animal(apodo_animal);
		this.setCantidad_de_huevos("Las serpientes ponen entre 4 y 25 huevos.");
		this.setSkin("Piel escamosa la cual mudan en intervalos de tiempo.");
		this.setHabitat("Pueden habitar desde junglas hasta desiertos.");
	}
	
	public Serpiente(String apodo_animal, int edad, double peso, String tamano_serpiente) {
		super(apodo_animal, edad, peso);
		this.setNombre("Serpiente");
		this.tamano_serpiente=tamano_serpiente;
		this.setCantidad_de_huevos("Las serpientes ponen entre 4 y 25 huevos.");
		this.setSkin("Piel escamosa la cual mudan en intervalos de tiempo.");
		this.setHabitat("Pueden habitar desde junglas hasta desiertos.");
	}

	//OVERRIDE INTERFAZ
	@Override
	public String arrastrar() {
		return "Las serpientes se arrastran por el suelo y pueden acceder a lugares dificiles.";
	}
	
	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Pueden ser o muy tranquilas o muy agresivas.";
	}
	
	@Override
	public String funFact() {
		return "Mudan su piel eventualmente y dejan su rastro.";
	}
	
	//POLIMORFISMO toString
	public String toString() {
		return super.toString() + " Tamaño de la serpiente: " + tamano_serpiente;
	}
}
