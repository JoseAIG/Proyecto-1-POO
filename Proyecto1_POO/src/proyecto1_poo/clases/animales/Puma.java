package proyecto1_poo.clases.animales;

import proyecto1_poo.Interfaces.Interface_caminar;
import proyecto1_poo.Interfaces.Interface_trepar;
import proyecto1_poo.clases.Felino;

public class Puma extends Felino implements Interface_caminar, Interface_trepar{

	//CONSTRUCTORES PUMA
		public Puma(String nombre_animal, int edad, double peso) {
			super(nombre_animal, edad, peso);
			this.setNombre("Puma");
			this.setCrias_en_parto("Los pumas tienen aproximadamente de 3 a 4 crias.");
			this.setSkin("Pelaje negro.");
			this.setHabitat("Se encuentran comunmente en zonas aridas de Africa.");
		}
		
		public Puma(int edad, double peso) {
			super(edad,peso);
			this.setNombre("Puma");
			this.setCrias_en_parto("Los pumas tienen aproximadamente de 3 a 4 crias.");
			this.setSkin("Pelaje negro.");
			this.setHabitat("Se encuentran comunmente en zonas aridas de Africa.");
		}

		//OVERRIDE INTERFACES
		@Override
		public String caminar() {
			return "El puma tiene un alto nivel de sigilo para atacar a sus presas.";
		}
		
		@Override
		public String trepar() {
			return "Pueden impulsarse para trepar arboles y alcanzar zonas eveladas.";
		}

		//OVERRIDE CLASE ANIMAL
		@Override
		public String comportamientoAnimal() {
			return "Felino muy territorial.";
		}
			
		@Override
		public String funFact() {
			return "Los pumas tienen buena vision nocturna.";
		}
		
}
