package proyecto1_poo.clases;

public class Ave extends Animal_oviparo {

	//CONSTRUCTORES AVE
	public Ave(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
	}
	
	public Ave(int edad, double peso) {
		super(edad, peso);
	}

	public String toString() {
		return "\nAve " + super.toString();
	}
}
