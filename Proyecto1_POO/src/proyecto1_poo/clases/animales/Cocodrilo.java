package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_nadar;
import proyecto1_poo.clases.Reptil;

public class Cocodrilo extends Reptil implements Interface_caminar, Interface_nadar{

	//CONSTRUCTORES COCODRILO
	public Cocodrilo(String apodo_animal, int edad, double peso) {
		super(apodo_animal, edad, peso);
		this.setNombre("Cocodrilo");
		this.setCantidad_de_huevos("Los cocodrilos hembra pueden poner de 30 a 70 huevos.");
		this.setSkin("Piel escamosa de color marron entre verde");
		this.setHabitat("Pueden vivir en cienagas, lagunas y pantanos.");
	}

	public Cocodrilo(int edad, double peso) {
		super(edad, peso);
		this.setNombre("Cocodrilo");
		this.setCantidad_de_huevos("Los cocodrilos hembra pueden poner de 30 a 70 huevos.");
		this.setSkin("Piel escamosa de color marron entre verde.");
		this.setHabitat("Pueden vivir en cienagas, lagunas y pantanos.");
	}
	
	//OVERRIDE INTERFACES
	@Override
	public String caminar() {
		return "El cocodrilo generalmente es cauteloso y camina lentamentes.";
	}
	
	@Override
	public String nadar() {
		return "El cocodrilo tiene la capacidad de moverse debajo del agua y aguantar por mucho tiempo la respiracion.";
	}
	
	//OVERRIDE CLASE ANIMAL
	@Override
	public String comportamientoAnimal() {
		return "Se torna agresivo cuando se ve amenazado el o sus crias.";
	}
			
	@Override
	public String funFact() {
		return "Hay quienes domestican cocodrilos y los mantienen en sus casas.";
	}

}
