package ArreglosA;

public class Frutas {

public static void main(String[] args) {
			
String[] frutas = { "manzana", "banana", "naranja",
				    "uva", "pera", "mango"
				};
			
String buscar = "manzana";	
boolean fueEncontrado = true;
int posicion = -1;

   for(int i = 0; i < frutas.length ; i ++) {
	 if(frutas[i].equals(buscar)) {
		 fueEncontrado = true;
		 System.out.println("El elemento " + frutas[i] + " está en la posición: " + i);
		// entonces yo pregunto mi arreglo de fruta es igual al que quiero buscar? si es igual
		 // el encontrado es verdadero 
		 //entonces digo, bueno el elemento del array esta en la posicion i osea o 1, o 2, etc 
		  
	 }
}
