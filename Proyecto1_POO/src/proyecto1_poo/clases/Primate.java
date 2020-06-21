package proyecto1_poo.clases;

public class Primate extends Animal_viviparo{

	//CONSTRUCTOR PRIMATE
	public Primate(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		
	}
	
	//toString
	public String toString() {
		return "\nPrimate" + super.toString();
	}

}
