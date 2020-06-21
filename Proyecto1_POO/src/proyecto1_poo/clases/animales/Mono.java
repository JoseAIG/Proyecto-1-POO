package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_trepar;
import proyecto1_poo.clases.Primate;

public class Mono extends Primate implements Interface_caminar, Interface_trepar{

	//CONSTRUCTOR MONO
	public Mono(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Mono");
		this.setCrias_en_parto("Los monos tienen aproximadamente de 3 a 4 crias.");
		this.setSkin("Pelaje marron corto.");
		this.setHabitat("Pueden vivir en zonas semi-aridas y junglas.");
		
	}

	//OVERRIDE INTERFACES
	@Override
	public String caminar() {
		return "Caminan apoyados en sus pies y nudillos o solo en sus pies.";
	}
	
	@Override
	public String trepar() {
		return "Trepa facilmente los arboles y se pueden guindar de su cola.";
	}
	
	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Son muy intranquilos capaces de curosear cualquier rincon.";
	}
			
	@Override
	public String funFact() {
		return "El mono capuccino es el mas inteligente de todos a pesar de su tamaño.";
	}

}
