package Nota;



public class Nota {
	/**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
	int valorInicial= 0;
    public Nota(int valorInicial) { 
 
    	if(valorInicial > 0 ||  valorInicial < 10) {
    		System.out.println("nota valida");
    		this.valorInicial= valorInicial;
    	}	else {
    			System.out.println("nota invalida");
    		}
    		
    
    	}
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() { 
    	return this.valorInicial;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	if (valorInicial >= 4) {
    		System.out.println("esta aprobado");
    		
    }
    	return valorInicial >= 4 ;
    }
    /**
     * post: indica si la Nota implica desaprobación.
     */
  public boolean desaprobado() {
    	if (valorInicial < 4) {
    		System.out.println("esta desaprobado");
    }
    
    	return valorInicial < 4;
    }
  
  /**
   * pre : nuevoValor está comprendido entre 0 y 10.
   * post: modifica el valor numérico de la Nota, cambiándolo
   *       por nuevoValor, siempre y cuando nuevoValor sea superior al
   *       valor numérico actual de la Nota.
   */
  public void recuperar(int nuevoValor) { 
	  
      if(nuevoValor > 0 ||  nuevoValor < 10) {
    	  if (nuevoValor > valorInicial) {
    		  this.valorInicial = nuevoValor;
    		  System.out.println("Recupero la nota " );
    	  } else { 
    		  System.out.println("No Recupero la nota,  es menor a la inicial " );
    	  }
      }
               }
      
      
      
  public static void main(String[] args) {
	  
 Nota notita = new Nota(4);
 
//Mostrar el valor de la nota
 System.out.println("Valor de la nota: " + notita.obtenerValor());

 notita.obtenerValor();
 System.out.println("aprobado: " + notita.aprobado());
 
 notita.obtenerValor();
 System.out.println("desaprobado: " + notita.desaprobado());
 
notita.recuperar(10);

System.out.println("Valor de la nota Final: " + notita.obtenerValor());
  
 }
  
  }
