package ArreglosC;



public class Pelicula {

	String genero;
	String titulo;
	int duracion;
   public Pelicula (String titulo, String genero, int duracion) {
	this.titulo= titulo;
	this.genero=genero;
	this.duracion=duracion;
}	
	
public static void main (String []args) {
	
	Pelicula[] cartelera = {
		    new Pelicula("Dune",         "ciencia ficción", 155),
		    new Pelicula("Alien",        "terror",          117),
		    new Pelicula("Hereditary",   "terror",          127),
		    new Pelicula("Get Out",      "terror",          104),
		    new Pelicula("Parasite",     "thriller",        132),
		    new Pelicula("Clue",         "thriller",         94),
		    new Pelicula("Interstellar", "ciencia ficción", 169)
		};
	
	System.out.println("Peliculas con mas de 100 min de duracion:");
	for(int i = 0; i < cartelera.length; i ++) {
		if(cartelera[i].duracion > 100) {
		
		System.out.println("Titulo: " + cartelera[i].titulo +". " +"Duracion:" +"("+ cartelera[i].duracion+ ")");	
	
		
}}
		//calcula el total del maraton, es decir sumar la duraciones
		
		int SumarDuraciones = 0;
		for(int i = 0; i < cartelera.length; i ++) {
			SumarDuraciones += cartelera[i].duracion;
		
			
		}
		System.out.println("Duracion Total: "+ SumarDuraciones);
	//calcula el titulo con la duracion mas corta
      for(int i = 0; i < cartelera.length; i ++) {
	  if(cartelera[i].duracion < 100) {
	  System.out.println("Mas Corta:" + cartelera[i].titulo);
	}
	}
	//racha mas larga de peliculas del mismo genero
	 //contar las pelis seguidas
      int contarRachaConsecutivas=1;
      int rachaMaxima = 1;
      String generoMasRepetido = cartelera[0].genero;
      for(int i = 1; i < cartelera.length; i ++) {
    	  if(cartelera[i].genero.equals(cartelera[i-1].genero)) {
    		  contarRachaConsecutivas++;
    	  }  else {
    		  
    		  if(contarRachaConsecutivas > rachaMaxima) {
    			   rachaMaxima = contarRachaConsecutivas;
    			  generoMasRepetido = cartelera[i-1].genero;
    		  }
    		  contarRachaConsecutivas=1;
    		  
    		  
    	  }
    }
    	// Verificación final por si la racha más larga coincidió con el final del arreglo
    	  if (contarRachaConsecutivas > rachaMaxima) {
    	      rachaMaxima = contarRachaConsecutivas;
    	      generoMasRepetido = cartelera[cartelera.length - 1].genero;  
    		  
    		}
    	  
    	  
    	  System.out.println("Racha mas larga: "+  generoMasRepetido + " con " + rachaMaxima + " peliculas consecutivas." );
}

}
      
 


