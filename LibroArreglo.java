package ArreglosC;

public class Libro {

	
	private String titulo;
	private String autor;
	private int cantEjemplares;
	public Libro ( String titulo, String autor, int cantEjemplares) {
	this.titulo= titulo;
	this.autor=autor;
	this.cantEjemplares= cantEjemplares;
	}
	
public static void main (String []args) {
		
		Libro[] inventario = {
			    new Libro("Ficciones",              "Borges",         5),
			    new Libro("El Aleph",               "Borges",         2),
			    new Libro("Rayuela",                "Cortázar",       4),
			    new Libro("Bestiario",              "Cortázar",       1),
			    new Libro("Final del juego",        "Cortázar",       3),
			    new Libro("Cien años de soledad",   "García Márquez", 7),
			    new Libro("El amor en los tiempos", "García Márquez", 2)
			};
		

//Listá los títulos de los libros con stock crítico: menos de 3 ejemplares.
		String stock= "Stock Critico: ";
		
		for(int i = 0; i < inventario.length; i ++) {
         if(inventario[i].cantEjemplares < 3) {
        	 stock += inventario[i].titulo;
  }
      }
       System.out.println(stock);  


//total de ejemplares
int totalEjemplares = 0;
for(int i = 0; i < inventario.length; i ++) {
	totalEjemplares += inventario[i].cantEjemplares;
}
System.out.println("Total de ejemplares : " + totalEjemplares);



//Identificará el autor con más títulos distintos en el inventario. Si hay empate
//, mostrará el primero encontrado.

int tituloMax = 0;
String autorMasTitulos = "";

for(int i = 0; i < inventario.length; i ++) {
	String autorActual = inventario[i].autor;
	int contadorActual = 0;
	
	if(inventario[i].autor.equals(autorActual )) {
		contadorActual ++;
		
	
	}
	
	if(contadorActual > tituloMax) {
		tituloMax = contadorActual;
		tituloMax ++;
	}
}

System.out.println("Autor con mas titulo" + autorMasTitulos + "con" + tituloMax);

//Mostrá el título del libro con más ejemplares disponibles.

Libro libroMasDisponible = inventario[0];

for(int i = 0; i < inventario.length; i ++) {
	
	if(inventario[i].cantEjemplares > libroMasDisponible.cantEjemplares) {
		 libroMasDisponible = inventario[i];
		}


		
}
System.out.println("Libro con más ejemplares disponibles: " + libroMasDisponible.titulo + 
        " (" + libroMasDisponible.cantEjemplares );


}}
