package proyecto1_poo.clases;

public class Reptil extends Animal_oviparo {

	//CONSTRUCTORES REPTIL
	public Reptil(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
	}
	
	public Reptil(int edad, double peso) {
		super(edad, peso);
	}

	public String toString() {
		return "\nReptil " + super.toString();
	}
}
