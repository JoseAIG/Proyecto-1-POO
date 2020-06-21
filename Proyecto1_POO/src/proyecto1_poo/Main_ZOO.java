/*
UNIVERSIDAD RAFAEL URDANETA, FACULTAD DE INGENIERIA, ESCUELA DE COMPUTACION
PROGRAMACION ORIENTADA A OBJETOS 2020B

PROFESOR CARLOS HERNANDEZ

JOSE INCIARTE C.I. 27.696.083
*/

package proyecto1_poo;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto1_poo.clases.Animal;
import proyecto1_poo.clases.*;
import proyecto1_poo.clases.animales.*;

public class Main_ZOO {

	
	public static void main(String[] args) {
		
		//VARIABLES
		int continuar, iteracion=0;
		int ed=0;
		double pe=0;
		String apodo=null;
		
		//INSTANCIAS
		//Objeto tipo Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Se ha declarado el array "misAnimales" con una capacidad de 100, suponiendo que esta es la capacidad maxima de animales a ingresar del zoologico.
		Animal[] misAnimales = new Animal[100];
		
		//ArrayList's
		ArrayList <Animal> oviparos = new ArrayList<Animal>();
		ArrayList <Animal> viviparos = new ArrayList<>();
		ArrayList <Animal> felinos = new ArrayList<>();
		ArrayList <Animal> primates = new ArrayList<>();
		ArrayList <Animal> bovinos = new ArrayList<>();
		ArrayList <Animal> aves = new ArrayList<>();
		ArrayList <Animal> reptiles = new ArrayList<>();
		ArrayList <Animal> peces = new ArrayList<>();

		//Arrays para brindar las caracteristicas de cada animal ingresado... 
		Aguila[] Aguila = new Aguila[1];
		Pinguino[] Pinguino = new Pinguino[1];
		Serpiente[] Serpiente = new Serpiente[1];
		Cocodrilo[] Cocodrilo = new Cocodrilo[1];
		Koi[] Koi = new Koi[1];
		Pez_globo[] Pez_globo = new Pez_globo[1];
		Guepardo[] Guepardo = new Guepardo[1];
		Puma[] Puma = new Puma[1];
		Mono[] Mono = new Mono[1];
		Gorila[] Gorila = new Gorila[1];
		Vaca[] Vaca = new Vaca[1];
		Toro[] Toro = new Toro[1];
		
		
		//Instancia de animales que ya estaban en el zoo...
		//Estos mismos son agregados a sus ArrayList's respectivos (tipo animal y animal respectivo)
		Koi Milotic = new Koi("Milotic",2,162.0);
		oviparos.add(Milotic);
		peces.add(Milotic);
		
		Animal_oviparo Pidgeot = new Aguila("Pidgeot",3,39.5);
		oviparos.add(Pidgeot);
		aves.add(Pidgeot);
		
		Animal Primeape = new Mono("Primeape",1,32.0);
		viviparos.add(Primeape);
		primates.add(Primeape);
		
		Animal Serperior = new Serpiente("Serperior",4,63.0,"Grande");
		oviparos.add(Serperior);
		reptiles.add(Serperior);
		
		Animal Persian = new Guepardo("Persian",3,32.0);
		viviparos.add(Persian);
		felinos.add(Persian);
		
		Animal Miltank = new Vaca("Miltank",5,75.5,15);
		viviparos.add(Miltank);
		bovinos.add(Miltank);
		
		Animal Harambe = new Gorila("Harambe",17,180);
		viviparos.add(Harambe);
		primates.add(Harambe);
		
		Animal Tauros = new Toro("Tauros",6,88.4);
		viviparos.add(Tauros);
		bovinos.add(Tauros);
		
		Animal Krookodile = new Cocodrilo("Krookodrile", 4, 96.3);
		oviparos.add(Krookodile);
		reptiles.add(Krookodile);
		
		Animal_viviparo AlolanPersian = new Puma("AlolanPersian",5,33.0);
		viviparos.add(AlolanPersian);
		felinos.add(AlolanPersian);
		
		Pez_globo Qwilfish = new Pez_globo("Qwilfish",1,3.9,true);
		oviparos.add(Qwilfish);
		peces.add(Qwilfish);
		
		Animal_oviparo Empoleon = new Pinguino("Empoleon",6,84.5);
		oviparos.add(Empoleon);
		aves.add(Empoleon);
		
		//MENU PRINCIPAL
		do {
			
			System.out.print("\tQue desea hacer?\n\n1.Ingresar un animal.\n2.Ver animales ingresados por usted.\n3.Ver caracteristicas de los animales ingresados.\n4.Ver lista de todos los animales del zoo.\n\nSu eleccion:");
			int ingresar=entrada.nextInt();
			
			//INGRESAR ANIMALES
			if (ingresar==1) {
			
				System.out.print(
						"\n\tQue animal deseara ingresar?\n"
						+ "\n\tAVES\n1.Aguila.\n2.Pinguino.\n"
						+ "\n\tREPTILES\n3.Serpiente.\n4.Cocodrilo.\n"
						+ "\n\tPECES\n5.Koi.\n6.Pez globo.\n"
						+ "\n\tFELINOS\n7.Guepardo.\n8.Puma.\n"
						+ "\n\tPRIMATES\n9.Mono.\n10.Gorila.\n"
						+ "\n\tBovinos\n11.Vaca.\n12.Toro.\n"
						+ "\n\nSu eleccion:");
				int selec = entrada.nextInt();
				switch(selec) {
				
				//AVES
				case 1: System.out.print("ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Aguila(apodo,ed,pe);
						Aguila[0] = new Aguila(apodo,ed,pe);
						oviparos.add(misAnimales[iteracion]);
						aves.add(misAnimales[iteracion]);
				break;
				case 2:System.out.print("Ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Pinguino(apodo,ed,pe);
						Pinguino[0] = new Pinguino(apodo,ed,pe);
						oviparos.add(misAnimales[iteracion]);
						aves.add(misAnimales[iteracion]);
				break;
				
				//REPTILES
				case 3: System.out.println("ingrese apodo: ");
						apodo=entrada.next();
						System.out.println("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.println("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						System.out.println("Ingrese el tamaño de la serpiente (P, M, G):");
						String tamano_serpiente = entrada.next();
						misAnimales[iteracion] = new Serpiente(apodo,ed,pe,tamano_serpiente);
						Serpiente[0] = new Serpiente(apodo,ed,pe,tamano_serpiente);
						oviparos.add(misAnimales[iteracion]);
						reptiles.add(misAnimales[iteracion]);
				break;
				case 4: System.out.print("ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Cocodrilo(apodo,ed,pe);
						Cocodrilo[0] = new Cocodrilo(apodo,ed,pe);
						oviparos.add(misAnimales[iteracion]);
						reptiles.add(misAnimales[iteracion]);
				break;
				
				//PECES
				case 5: System.out.print("ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Koi(apodo,ed,pe);
						Koi[0] = new Koi(apodo,ed,pe);
						oviparos.add(misAnimales[iteracion]);
						peces.add(misAnimales[iteracion]);
				break;
				case 6: System.out.print("ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						System.out.println("Tiene veneno? true or false");
						boolean veneno = entrada.nextBoolean();
						misAnimales[iteracion] = new Pez_globo(apodo,ed,pe,veneno);
						Pez_globo[0] = new Pez_globo(apodo,ed,pe,veneno);
						oviparos.add(misAnimales[iteracion]);
						peces.add(misAnimales[iteracion]);
				break;
				
				//FELINOS
				case 7: System.out.println("Ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Guepardo(apodo,ed,pe);
						Guepardo[0] = new Guepardo(apodo,ed,pe);
						viviparos.add(misAnimales[iteracion]);
						felinos.add(misAnimales[iteracion]);
				break;
				case 8: System.out.println("Ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Puma(apodo,ed,pe);
						Puma[0] = new Puma(apodo,ed,pe);
						viviparos.add(misAnimales[iteracion]);
						felinos.add(misAnimales[iteracion]);
				break;
				
				//PRIMATES
				case 9: System.out.println("Ingrese apodo: ");
						apodo=entrada.next();
						System.out.print("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.print("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Mono(apodo,ed,pe);
						Mono[0] = new Mono(apodo,ed,pe);
						viviparos.add(misAnimales[iteracion]);
						primates.add(misAnimales[iteracion]);
				break;
				case 10: System.out.println("ingrese apodo: ");
						apodo=entrada.next();
						System.out.println("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.println("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Gorila(apodo,ed,pe);
						Gorila[0] = new Gorila(apodo,ed,pe);
						viviparos.add(misAnimales[iteracion]);
						primates.add(misAnimales[iteracion]);
				break;
				
				//BOVINOS
				case 11: System.out.println("ingrese apodo: ");
						apodo=entrada.next();
						System.out.println("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.println("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						System.out.println("Litros diarios de leche:");
						int litros_leche = entrada.nextInt();
						misAnimales[iteracion] = new Vaca(apodo,ed,pe,litros_leche);
						Vaca[0] = new Vaca(apodo,ed,pe,litros_leche);
						viviparos.add(misAnimales[iteracion]);
						bovinos.add(misAnimales[iteracion]);
				break;
				case 12: System.out.println("ingrese apodo: ");
						apodo=entrada.next();
						System.out.println("Ingrese edad del animal: ");
						ed=entrada.nextInt();
						System.out.println("Ingrese peso del animal: ");
						pe=entrada.nextDouble();
						misAnimales[iteracion] = new Toro(apodo,ed,pe);
						Toro[0] = new Toro(apodo,ed,pe);
						viviparos.add(misAnimales[iteracion]);
						bovinos.add(misAnimales[iteracion]);
				break;
				default: System.out.println("Opcion incorrecta.");
				break;
				} //CIERRE SWITCH
				iteracion++;
			} //CIERRE IF
			
			//IMPRESION DE ANIMALES AGREGADOS / INGRESADOS
			else if(ingresar==2) {
				if(misAnimales[0]==null) {
					System.out.println("No ha ingresado ningun animal...");
				}
				else {
					System.out.println("Animales ingresados por usted:\n");
					for(Animal i: misAnimales) {
						if(i!=null) {	
							System.out.println("\n" + i);
						}
					}		
				}
			}
			
			//IMPRESION DE CARACTERISTICAS DE LOS ANIMALES INGRESADOS
			else if(ingresar==3) {
				if(misAnimales[0]==null) {
					System.out.println("No ha ingresado ningun animal...");
				}
				else {
					
					if(Aguila[0]!=null) {
						System.out.println("Caracteristicas del aguila: " + Aguila[0].comportamientoAnimal() + " " + Aguila[0].getSkin() + " " + Aguila[0].getHabitat() + " " + Aguila[0].getCantidad_de_huevos() + " " + Aguila[0].caminar() + " " + Aguila[0].volar() + " " + Aguila[0].funFact());
					}
					if(Pinguino[0]!=null) {
						System.out.println("Caracteristicas del pinguino: " + Pinguino[0].comportamientoAnimal() + " " + Pinguino[0].getSkin() + " " + Pinguino[0].getHabitat() + " " + Pinguino[0].getCantidad_de_huevos() + " " + Pinguino[0].caminar() + " " + Pinguino[0].nadar() + " " + Pinguino[0].funFact());
					}
					if(Serpiente[0]!=null) {
						System.out.println("Caracteristicas de la serpiente: " + Serpiente[0].comportamientoAnimal() + " " + Serpiente[0].getSkin() + " " + Serpiente[0].getHabitat() + " " + Serpiente[0].getCantidad_de_huevos() + " " + Serpiente[0].arrastrar() + " " + Serpiente[0].funFact());
					}
					if(Cocodrilo[0]!=null) {
						System.out.println("Caracteristicas del cocodrilo: " + Cocodrilo[0].comportamientoAnimal() + " " + Cocodrilo[0].getSkin()  + " " + Cocodrilo[0].getHabitat() + " " + Cocodrilo[0].getCantidad_de_huevos() + " " + Cocodrilo[0].caminar() + " " + Cocodrilo[0].nadar() + " " + Cocodrilo[0].funFact());
					}
					if(Koi[0]!=null) {
						System.out.println("Caracteristicas del koi: " + Koi[0].comportamientoAnimal() + " " + Koi[0].getSkin() + " " + Koi[0].getHabitat() + " " + Koi[0].getCantidad_de_huevos() + " " + Koi[0].nadar() + " " + Koi[0].funFact());
					}
					if(Pez_globo[0]!=null) {
						System.out.println("Caracteristicas del pez globo: " + Pez_globo[0].comportamientoAnimal() + " " + Pez_globo[0].getSkin() + " " + Pez_globo[0].getHabitat() + " " + Pez_globo[0].getCantidad_de_huevos() + " " + Pez_globo[0].nadar() + " " + Pez_globo[0].funFact());
					}
					if(Guepardo[0]!=null) {
						System.out.println("Caracteristicas del guepardo: " + Guepardo[0].comportamientoAnimal() + " " + Guepardo[0].getSkin() + " " + Guepardo[0].getHabitat() + " " + Guepardo[0].getCrias_en_parto() + " " + Guepardo[0].caminar() + " " + Guepardo[0].trepar() + " " + Guepardo[0].funFact());
					}
					if(Puma[0]!=null) {
						System.out.println("Caracteristicas del puma: " + Puma[0].comportamientoAnimal() + " " + Puma[0].getSkin() + " " + Puma[0].getHabitat() + " " + Puma[0].getCrias_en_parto() + " " + Puma[0].caminar() + " " + Puma[0].trepar() + " " + Puma[0].funFact());
					}
					if(Mono[0]!=null) {
						System.out.println("Caracteristicas del mono: " + Mono[0].comportamientoAnimal() + " " + Mono[0].getSkin() + " " + Mono[0].getHabitat() + " " + Mono[0].getCrias_en_parto() + " " + Mono[0].caminar() + " " + Mono[0].trepar() + " " + Mono[0].funFact());
					}
					if(Gorila[0]!=null) {
						System.out.println("Caracteristicas del gorila: " + Gorila[0].comportamientoAnimal() + " " + Gorila[0].getSkin() + " " + Gorila[0].getHabitat() + " " + Gorila[0].getCrias_en_parto() + " " + Gorila[0].caminar() + " " + Gorila[0].trepar()  + " " + Gorila[0].funFact());
					}
					if(Vaca[0]!=null) {
						System.out.println("Caracteristicas de la vaca: " + Vaca[0].comportamientoAnimal() + Vaca[0].getSkin() + Vaca[0].getHabitat() + Vaca[0].getCrias_en_parto() + Vaca[0].caminar() + Vaca[0].funFact());
					}
					if(Toro[0]!=null) {
						System.out.println("Caracteristicas del toro: " + Toro[0].comportamientoAnimal()  + Toro[0].getSkin() + Toro[0].getHabitat() + Toro[0].getCrias_en_parto() + Toro[0].caminar() + Toro[0].funFact());
					}
					
				}
			}
		
			//LISTA COMPLETA DE LOS ANIMALES (VIEJOS + INGRESADOS) POR CATEGORIA
			else if (ingresar==4) {
				System.out.println("Que lista de animales desea ver?"
									+ "\n\n1.Lista de animales viviparos"
									+ "\n2.Lista de animales oviparos."
									+ "\n\n3.Lista de aves."
									+ "\n4.Lista de reptiles."
									+ "\n5.Lista de peces."
									+ "\n6.Lista de felinos."
									+ "\n7.Lista de primates."
									+ "\n8.Lista de bovinos."
									+ "\n\n9.Lista de todos los animales."
									+ "\n\nSu eleccion:");
				ingresar=entrada.nextInt();
				if(ingresar==1) {
					System.out.println(Animal_viviparo.Caracteristicas_viviparos());
					System.out.println("\nArrayList viviparos imprime:\n\n" + viviparos);
				}
				else if (ingresar==2) {
					System.out.println(Animal_oviparo.Caracteristicas_oviparos());
					System.out.println("\nArrayList oviparos imprime:\n\n" + oviparos);
				}
				else if (ingresar==3) {
					System.out.println("ArrayList aves imprime:\n\n" + aves);
				}
				else if (ingresar==4) {
					System.out.println("ArrayList reptiles imprime:\n\n" + reptiles);
				}
				else if (ingresar==5) {
					System.out.println("ArrayList peces imprime:\n\n" + peces);
				}
				else if (ingresar==6) {
					System.out.println("ArrayList felinos imprime:\n\n" + felinos);
				}
				else if (ingresar==7) {
					System.out.println("ArrayList primates imprime:\n\n" + primates);
				}
				else if (ingresar==8) {
					System.out.println("ArrayList bovinos imprime:\n\n" + bovinos);
				}
				else if (ingresar==9){
					System.out.println("Lista de todos los animales:\n\n" + viviparos + oviparos);
				}
				
			}
			
			System.out.println("Desea continuar? (Si=1)");
			continuar = entrada.nextInt();
		}while(continuar==1);
		
		System.out.println("Programa finalizado...");

	}

}
