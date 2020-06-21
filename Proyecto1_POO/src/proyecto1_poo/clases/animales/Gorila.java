package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_trepar;
import proyecto1_poo.clases.Primate;

public class Gorila extends Primate implements Interface_caminar, Interface_trepar{

	//CONSTRUCTOR GORILA
	public Gorila(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Gorila");
		this.setCrias_en_parto("Los monos tienen aproximadamente de 2 a 3 crias.");
		this.setSkin("Pelaje negro corto.");
		this.setHabitat("Comunmente se encuentran en junglas.");
	}

	//OVERRIDE INTERFACES
	@Override
	public String caminar() {
		return "El gorila camina apoyado en sus pies y nudillos.";
	}
	
	@Override
	public String trepar() {
		return "Trepan los arboles y se refugian al anochecer.";
	}

	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Son animales inteligentes y tienen comportamientos parecidos al humano.";
	}
			
	@Override
	public String funFact() {
		return "Cuidan mucho a sus familias.";
	}
}
