package proyecto1_poo.clases;

public class Animal_viviparo extends Animal{
	
	//ATRIBUTOS DE LOS ANIMALES MAMIFEROS
	private String Crias_en_parto;
	
	//CONSTRUCTORES ANIMALES VIVIPAROS
	public Animal_viviparo(String nombre_animal, int edad, double peso) {
		super(nombre_animal, edad, peso);
	}
	
	public Animal_viviparo(int edad, double peso) {
		super(edad, peso);
	}

	//OVERRIDE DE METODOS ABSTRACTOS
	@Override
	public String comportamientoAnimal() {
		return "Mantienen una relacion perdurable con sus crias.";
	}

	@Override
	public String funFact() {
		return "Pueden caminar sobre las palmas de sus manos y pies como los humanos y osos sobre sus dedos como los perros y gatos o sobre sus uñas como los caballos";
	}

	//METODOS
	public static String Caracteristicas_viviparos() {
		return "Los animales viviparos pueden vivir en la tierra, volar o en el agua...\nSon de sangre caliente";
	}
	
	//SETTER CRIAS EN PARTO
	public void setCrias_en_parto(String Crias_en_parto) {
		this.Crias_en_parto = Crias_en_parto;
	}
	
	//GETTER CRIAS EN PARTO
	public String getCrias_en_parto() {
		return Crias_en_parto;
	}
	
	//toString
	public String toString() {
		return " Animal: " + this.getNombre() + ". Apodo del animal: " + this.getApodo_animal() + ". Animal viviparo." + " Edad: " + this.getEdad() + " anio(s). Peso: " + this.getPeso() + "Kg.";
	}
}
