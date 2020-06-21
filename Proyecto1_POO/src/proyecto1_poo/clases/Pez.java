package proyecto1_poo.clases;

public class Pez extends Animal_oviparo{

	//CONSTRUCTORES PEZ
	public Pez(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
	}
	
	public Pez(int edad, double peso) {
		super(edad, peso);
	}
	
	public String toString() {
		return "\nPez " + super.toString();
	}

}
