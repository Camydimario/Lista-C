package Cerradura;


 public class Cerradura {
	/** pre: se crea la Cerradura
	 *  post: tiene una clave de apertura para abrir, y por otro lado
	 *  se bloquea si supera la cantidad de fallos al intentar abrirla. Se inicializa
	 *  la cerradura.
	 */	
	/**
	 * @return
	 */
	int claveDeApertura;
	 int cantidadDeFallosConsecutivosQueLaBloquean;
    
     boolean estaAbierta= true;
    boolean bloqueada =  false;
    int aperturasExitosas=0;
    int aperturasFallidas=0;
	 
	 public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean) {
	 this.claveDeApertura = claveDeApertura;
	 this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean; 
	 System.out.println("La clave De apertura es :  " +  claveDeApertura);	
	 System.out.println("Cantidad de fallos que la bloquean :  " +  cantidadDeFallosConsecutivosQueLaBloquean);
 }
 /**
	 * pre: se ingresa la clave para abrir la cerradura, si es correcta se abre
	 post: la cerradura se abre.
	 **/
public boolean abrir(int clave) {
	if(clave == this.claveDeApertura) {
		estaAbierta = true;
	    aperturasExitosas++;
	    System.out.println("La clave ingresada " +  clave +" es correcta");	
	}
	else if (clave != this.claveDeApertura) {
		 estaAbierta = false;
		 aperturasFallidas++;
		 System.out.println("La clave ingresada " +  clave + " es incorrecta");
	}
	return estaAbierta;
} 




	

// post : la cerradura se cierra si la clave es incorrecta
public void cerrar() {
		if( aperturasFallidas > cantidadDeFallosConsecutivosQueLaBloquean ) {
			 bloqueada = true;
			 System.out.println("Cerradura bloqueada, supero la cantidad de fallos consecutivos. ");
			 
		} else { 
			bloqueada = false;
		}
	
	}


// post: se verifica si la puerta esta abierta
public boolean estaAbierta() {
 return estaAbierta;
	
}

//post: se verifica si la puerta esta cerrada
public boolean estaCerrada() {
	 return !estaAbierta;
	
}

//post: se verifica si la puerta fue bloqueada
public boolean fueBloqueada() {
	return bloqueada;
	
}

//post: devuelve la cantidad de aperturas exitosas que se abrio la cerradura
public int contarAperturasExitosas() {
	return aperturasExitosas;
}


//post:devuelve la cantidad de aperturas fallidas que se tuvo al abrir la cerradura
public int contarAperturasFallidas() {
	return aperturasFallidas;
}





	
	
	
	

	public static void main(String[] args) {
		System.out.println("-----Caso N° 1 -----");
		Cerradura cerra = new Cerradura(4567,3);
		
		System.out.println("--------------------");
		
		cerra.abrir(4569);
		cerra.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra.contarAperturasFallidas());
		System.out.println(" ");
		
		cerra.abrir(4568);
		cerra.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra.contarAperturasFallidas());
		System.out.println(" ");
		
		cerra.abrir(4567);
		cerra.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra.contarAperturasFallidas());
		System.out.println(" ");
		System.out.println("Cerradura abierta");
		System.out.println(" ");
		System.out.println(" ");
	   
		
		System.out.println("-----Caso N° 2 -----");
		Cerradura cerra2 = new Cerradura(4567,3);
		
		System.out.println("--------------------");
		
		cerra2.abrir(4569);
		cerra2.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra2.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra2.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra2.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra2.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra2.contarAperturasFallidas());
		System.out.println(" ");
		
		cerra2.abrir(4568);
		cerra2.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra2.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra2.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra2.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra2.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra2.contarAperturasFallidas());
		System.out.println(" ");
		
		cerra2.abrir(4590);
		cerra2.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra2.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra2.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra2.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra2.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra2.contarAperturasFallidas());
		System.out.println(" ");
		
		cerra2.abrir(4599);
		cerra2.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra2.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra2.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra2.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra2.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra2.contarAperturasFallidas());
		System.out.println(" ");
		System.out.println("Cerradura bloqueda, intentelo mas tarde.");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("-----Caso N° 3 -----");
		Cerradura cerra3 = new Cerradura(4567,3);
		
		System.out.println("--------------------");
		
		cerra3.abrir(4567);
		cerra3.cerrar();
		System.out.println("La cerradura esta abierta? " +cerra3.estaAbierta());	
		System.out.println("La cerradura esta cerrada? " + cerra3.estaCerrada());
		System.out.println("La cerradura esta bloqueada? " + cerra3.fueBloqueada());
		System.out.println("Total de aperturas exitosas : " + cerra3.contarAperturasExitosas());
		System.out.println("Total de aperturas fallidas : " + cerra3.contarAperturasFallidas());
		System.out.println(" ");
		System.out.println("Cerradura abierta.");
		
		
		
	}

}
