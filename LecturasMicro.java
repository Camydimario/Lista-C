package MicroPatrones;
import java.util.Arrays;
public class Lecturas {

	
	
	//double[] lecturas = { 45.0, -3.0, 72.0, 110.5, 38.0, 91.0, -1.0, 52.0 };
	
		
	/**
	 * 
	 * pre: . Los valores válidos están entre 0.0y 100.0; cualquier valor
	 *  fuera de ese rango se considera un error de medición.
	 *
	 * post: devuelve la cantidad de lecturas validas	
	 */
	
		public double lecturasValidas(double [] lecturas) {
			
			int Contarvalidas = 0;
			for(int i =0; i < lecturas.length; i++) {
			 if(lecturas[i] > 0 && lecturas [i]< 100) {
				 Contarvalidas++;
			}
			
			
			}
			return Contarvalidas;
			
		}
		/*
		 * post: devuelve la cantidad de lecturas invalidas
		 * 
		 */
		public double lecturasInvalidas (double [] lecturas) {
			
			int Contarinvalidas=0;
			for(int i =0; i < lecturas.length; i++) {
				if(lecturas[i]<0 || lecturas[i]> 100) {
					Contarinvalidas++;
				}
			}
			return Contarinvalidas;
			
			
		}
		
	/**
	 *
	 * post: se Verifica si el arreglo contiene al menos una lectura válida. 
	 */
			
	public boolean valido(double [] lecturas) {
		boolean esvalida = false;
		
		for(int i = 0; i < lecturas.length && !esvalida; i++) {
			if(lecturas[i] >0 && lecturas [i] <100) {
				esvalida= true;
			}
		}
		return esvalida;
	}
			
	
	/*
	 * 
	 * pre: Calculá el promedio considerando solo las lecturas válidas.
	 *  Si no hay ninguna válida, devolvé 0.0.
	 * 
	 * post: devuelve el promedio
	 */
	
	public double promediovalido(double [] lecturas) {
		
		int cantidadLecturasvalidas =0;
		for(int i =0; i < lecturas.length; i++) {
			if(lecturas[i] > 0 && lecturas [i] < 100) {
				cantidadLecturasvalidas++;
			}
		}
		
		
		double [] validas = new double[cantidadLecturasvalidas];
		int temporal =0;
		for(int i =0; i < lecturas.length; i++) {
			if(lecturas[i] > 0 && lecturas[i] <100) {
				validas[temporal] = lecturas[i];
				   temporal++;
			}
		}
	
		// Recorremos el NUEVO arreglo para sumar sus valores
	    double suma = 0;
	    for (int i = 0; i < validas.length; i++) {
	        suma += validas[i]; // Sumamos cada lectura válida
	    }

	    // 4. Devolvemos el promedio real
	    return suma / validas.length;
	}	
	
	
	public void reemplazos (double [] lecturas) {
	// validas
		
      int validas= 0;
      double suma = 0;
      for(int i =0; i < lecturas.length; i++) {
    	  if(lecturas[i] > 0 && lecturas[i]< 100) {
    		  suma += lecturas[i];
    		  validas++;
    		  
    		  
    	  }
      }
      double promedio = (double) suma/validas;

	//remplazamos
      
      for(int i = 0; i < lecturas.length; i++) {
    	  if(lecturas[i] <0 || lecturas[i] >100) {
    		  lecturas[i] = promedio;
    	  }
      }
	}
	
	
      
      public static void main (String []args) {
    	  
      Lecturas lecturitas = new Lecturas();	  
      double[] lecturas = { 45.0, -3.0, 72.0, 110.5, 38.0, 91.0, -1.0, 52.0 };
    	  
      System.out.println("Las lecturas validas son :" + lecturitas.lecturasValidas(lecturas));  
    	  
      System.out.println("Las lecturas invalidas son :" + lecturitas.lecturasInvalidas(lecturas));	  
       	  
      System.out.println("Existe una lectura valida? : " + lecturitas.valido(lecturas) );	  
    	  
      System.out.println("El promedio de las lecturas validas es:" +  lecturitas.promediovalido(lecturas));
      
      System.out.println("Se reemplaza las lecturas invalidas por el promedio de las validas");
      
    
      
      System.out.println("Arreglo original antes del reemplazo:");
      System.out.println(Arrays.toString(lecturas));
      System.out.println("Reemplazado:");
      lecturitas.reemplazos(lecturas);
      System.out.println(Arrays.toString(lecturas));
      
      }
      
      
      
      
		
		
	
	
	}
