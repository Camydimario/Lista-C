package MicroPatrones;

public class PatronesDeVentas {

	public static void main(String[] args) {
		int[] ventas = { 42,17, 85, 23, 85, 61, 4, 99, 38, 55 };
		
		
		//Encontrá la posición de la primera ocurrencia del valor 85.
		//¿Qué se devuelve si el valor no existe?
	
	int posicion = -1;
	for(int i = 0; i < ventas.length&& posicion == -1; i++) {
		if(ventas[i]==42){
			posicion = i;
			
		}
	}
	System.out.println("La posicion es:" + posicion);
	
	
	//Verifique si el valor 100existe en el arreglo.
	boolean existe = false;
	
  for(int i =0; i < ventas.length && !existe; i++) {
	if(ventas[i]==100) {
      existe = true;		
	}
}
  
  System.out.println("Existe el valor en el arreglo?"+" "+  existe);
	
  //Contá cuantas veces aparece el valor 85
  int Contarveces=0;
  for(int i =0; i < ventas.length; i++) {
	  if(ventas[i]==85) {
		  Contarveces++;
	  }
  }
  System.out.println("El valor 85 se repite:" + Contarveces);
  
  
  
  //Contá cuántos elementos son mayores a 50.
  int ContarMayores=0;
  for(int i = 0; i < ventas.length; i++) {
	  if(ventas[i]> 50) {
		  ContarMayores++;
	  }
  }
  System.out.println("Hay en total"+" "+ ContarMayores +" "+ "elementos mayores a 50");
  
  
  //Verifique si el arreglo está ordenado de menor a mayor.
  boolean estaOrdenado=true;
 
  for(int i=0; i< ventas.length && estaOrdenado;i++) {
	  if(ventas[i]> ventas[i+1]) {
		  estaOrdenado=false;
	  }
	  if(estaOrdenado) {
		  System.out.println("esta ordenado de menor a mayor:" +  estaOrdenado);
	  }else {
		  System.out.println("no esta ordenado de menor a mayor:" +  estaOrdenado);
	  }
  }
  
 
	}
}
