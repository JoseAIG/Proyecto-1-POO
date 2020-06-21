package proyecto1_poo.clases;

public class Animal_oviparo extends Animal {

	//ATRIBUTOS ANIMALES OVIPAROS
	private String Cantidad_de_huevos;
	
	//CONSTRUCTOR ANIMALES OVIPAROS
	public Animal_oviparo(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
	}
	
	public Animal_oviparo(int edad, double peso) {
		super(edad, peso);
	}
	
	//OVERRIDE DE METODOS ABSTRACTOS
	
	//COMPORTAMIENTO GENERAL OVIPAROS
	@Override
	public String comportamientoAnimal() {
		return "Los animales oviparos pueden ser agresivos cuando te acercas a sus nidos y huevos.";
	}

	//FUNFACT OVIPAROS
	@Override
	public String funFact() {
		return "Comunmente otras especies comen los huevos de los animales oviparos para alimentarse.";
	}

	//METODOS
	//GETTER CARACTERISTICAS OVIPAROS
	public static String Caracteristicas_oviparos() {
		return "Los animales oviparos son aquellos que ponen huevos.\nPueden habitar mares, oceanos, praderas y volar en los cielos...";
	}
	
	//SETTER CANTIDAD DE HUEVOS
	public void setCantidad_de_huevos(String Cantidad_de_huevos) {
		this.Cantidad_de_huevos = Cantidad_de_huevos;
	}
	
	//GETTER CANTIDAD DE HUEVOS
	public String getCantidad_de_huevos() {
		return Cantidad_de_huevos;
	}
	
	//toString
	public String toString() {
		return "Animal: " + this.getNombre() + ". Apodo del animal: "+ this.getApodo_animal() +". Animal ovíparo" +". Edad: " + this.getEdad() + " año(s). Peso: " + this.getPeso() + "Kg.\n";
	}
}
