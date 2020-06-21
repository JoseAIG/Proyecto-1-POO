package proyecto1_poo.clases;

public class Bovino extends Animal_viviparo{

	public Bovino(String nombre_animal, int edad, double peso) {
		super(nombre_animal, edad, peso);
	}

	//toString
		public String toString() {
			return "\nBovino " + super.toString();
		}
}
