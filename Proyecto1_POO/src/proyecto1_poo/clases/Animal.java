package proyecto1_poo.clases;

public abstract class Animal {

	//ATRIBUTOS
	private String nombre_animal;
	private String apodo_animal;
	private String tipo_skin;
	private String habitat;
	private double peso;
	private int edad;
	
	//CONSTRUCTORES
	public Animal(String apodo_animal,int edad, double peso) {
		this.apodo_animal=apodo_animal;
		this.edad=edad;
		this.peso=peso;
	}
	
	public Animal(int edad, double peso) {
		this.edad=edad;
		this.peso=peso;
	}
	
	//METODOS
	
											//METODOS ABSTRACTOS	
	
			//METODO ABSTRACTO COMPORTAMIENTO
	public abstract String comportamientoAnimal();
	
			//METODO ABSTRACTO FUNFACT
	public abstract String funFact();
	
											//METODOS GETTER'S & SETTER'S
	
			//METODO GETTER NOMBRE ANIMAL
	public String getNombre() {
		return nombre_animal;
	}
			//METODO SETTER NOMBRE ANIMAL
	public void setNombre(String nombre_animal) {
		this.nombre_animal=nombre_animal;
	}
			//METODO GETTER EDAD
	public int getEdad() {
		return edad;
	}
			//METODO GETTER PESO
	public double getPeso() {
		return peso;
	}
			//METODO SETTER TIPO SKIN
	public void setSkin(String tipo_skin) {
		this.tipo_skin=tipo_skin;
	}
			//METODO GETTER TIPO SKIN
	public String getSkin() {
		return tipo_skin;
	}
			//METODO SETTER HABITAT
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
			//METODO GETTER HABITAT
	public String getHabitat() {
		return habitat;
	}
	//SETTER APODO ANIMAL
	public void setApodo_animal(String apodo_animal) {
		this.apodo_animal=apodo_animal;
	}
	//GETTER APODO ANIMAL
	public String getApodo_animal() {
		return apodo_animal;
	}
	
}
