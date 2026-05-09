package Cubo;


class Cubo {

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
	private double longitudLado=5;
	double areaCara=0;
 double volumen=0;
	
    public Cubo (double longitudLado) {
    	if(longitudLado>0)
    	this.longitudLado= longitudLado;
    	 
    	    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	return longitudLado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	if(longitudLado >0) {
    		this.longitudLado = longitudLado;
    		  System.out.println("Se cambia el valor del lado a: "+ longitudLado);
    	}
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	return Math.pow(this.longitudLado, 2);
    	
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
        	if(areaCara >0) {
    		this.areaCara =  Math.sqrt(areaCara);
        	
    		 System.out.println("Se cambia el valor del areaCara a: "+ areaCara);
    	}
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() { 
    	return Math.pow(this.longitudLado, 3);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) { 
    	if(volumen >0) {
    		this.volumen =Math.cbrt(volumen);
    		 System.out.println("Se cambia el valor del volumen a: "+ volumen);
    	}
    	
    }
    
    public static void main (String []args) {
    	Cubo cubito= new Cubo(4);
    	  System.out.println("El valor del lado es "+ cubito.obtenerLado());	
    	  
    	
    	  System.out.println("El valor del areaCara es "+ cubito.obtenerAreaCara());
    	  
    	  
          System.out.println("El valor del volumen es "+ cubito.obtenerVolumen());
          
    	  
          System.out.println("-----Se modifican los valores----- ");	
      	
    
    		
    	  cubito.cambiarLado(5);
    	  cubito.cambiarAreaCara(3);
          cubito.cambiarVolumen(4);
          System.out.println("----------------------------------- ");
          
          System.out.println("El valor del lado es "+ cubito.obtenerLado());	
      	
    	  System.out.println("El valor del areaCara es "+ cubito.obtenerAreaCara());
    	  
    	  System.out.println("El valor del volumen es "+ cubito.obtenerVolumen());
          
    }
    
    
    
    
    
}
