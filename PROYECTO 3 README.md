# Proyectos-POO
Proyectos Programacion Orientada a Objetos URU 2020B José Inciarte

BRANCH Proyecto-No.3

Proyecto1_POO: Dentro de esta carpeta se encuentra todo el contenido referente al proyecto #3: BASES DE DATOS. 
En ella esta la carpeta src y bin. En la carpeta src se encuentran tres (3) carpetas:

  ► proyecto1_poo: Aqui se encuentran las clases de JAVA con herencia, interfaces, clases abstractas, etc. Pertenecientes a los animales
  ► proyecto2_graficos: Aqui se encuentra el contenido de la UI, refinado para la implementacion de las bases de datos.
  ► proyecto3_database: Aqui se encuentra el contenido de la database y el metodo main (Main3) en la clase database.java es donde se lleva a cabo la conexion con la base de datos y se encuentran los metodos para todas las funciones solicitadas.
 
 
*NOTA*

Para el optimo funcionamiento del programa, se debe añadir un JAR externo (jdbc) en la classpath, el cual es el siguiente:
  ► postgresql-42.2.14
  
Y a su vez, se debe crear una base de datos llamada Zoologico. 
Dicha base de datos (montada en PostgreSQL) debe tener las tablas descritas en el documento de texto TABLAS_PROYECTO3
En ese documento de texto se encuentran TODAS las sentencias SQL para la implementacion de las mismas.

Son 13 tablas en total, ingresadas en la base de datos llamada "Zoologico"
  ► 1 tabla para registrar TODOS los animales 
  ► 12 tablas para cada animal respectivo, dado que cada animal AMERITA su propia tabla desde mi punto de vista (Aguilas, Pinguinos, Serpientes, Cocodrilos, Kois, Peces_globo, Guepardos, Pumas, Monos, Gorilas, Vacas y Toros).
