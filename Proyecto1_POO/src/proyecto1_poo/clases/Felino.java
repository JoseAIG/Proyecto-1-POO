package proyecto1_poo.clases;

public class Felino extends Animal_viviparo{

	//CONSTRUCTORES FELINO
	public Felino(String nombre_animal, int edad, double peso) {
		super(nombre_animal, edad, peso);
	}

	public Felino(int edad, double peso) {
		super(edad, peso);
	}
	
	//toString
	public String toString() {
		return "\nFelino " + super.toString();
	}
}
