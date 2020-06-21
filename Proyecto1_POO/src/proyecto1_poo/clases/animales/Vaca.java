package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.clases.Bovino;

public class Vaca extends Bovino implements Interface_caminar{

	private  int litros_leche;
	
	public Vaca(String nombre_animal, int edad, double peso, int litros_leche) {
		super(nombre_animal, edad, peso);
		this.setNombre("Vaca");
		this.setCrias_en_parto("Usualmente las vacas tienen de 1 a 3 becerros.");
		this.setSkin("Tienen piel blanco con negro");
		this.setHabitat("Se encuentran en haciendas, fincas y granjas.");
		this.litros_leche=litros_leche;
	}

	//OVERRIDE INTERFAZ CAMINAR
	@Override
	public String caminar() {
		return "Las vacas son lentas y tranquilas.";
	}

	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Procuran cuidar a sus becerros.";
	}
			
	@Override
	public String funFact() {
		return "Hay razas que son lecheras y otras que no.";
	}
			
	//POLIMORFISMO toString
	public String toString() {
		return super.toString() + " Litros de leche diarios: " + litros_leche;

	}
}
