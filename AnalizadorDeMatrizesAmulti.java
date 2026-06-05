package ArreglosMulti;

import java.util.Arrays;

public class AnalizadorDeMatrices {
	  /**
     * post: devuelve la cantidad de elementos de 'matriz' que tengan valor 0.
     */
    public int contarCeros(double[][] matriz) {
    	
    	int contarCeros=0;
    	for(int i = 0; i < matriz.length; i++) {
    		for(int j = 0; j< matriz[i].length;j++) {
    			if(matriz[i][j]== 0) {
    				contarCeros++;
    			}
    		}
    	
    	
    	
    	
    	
    }
    	return contarCeros;
}
    /**
     * post: devuelve la cantidad de elementos de 'matriz' cuyo valor
     *       esté en el rango ['desde', 'hasta'].
     */
    public int contarElementosEnElRango(double[][] matriz, double desde, double hasta) {
    	
    	int cantidadDeELementos =0;
    
    	for(int i = 0; i < matriz.length; i++) {
    		for(int j = 0; j< matriz[i].length;j++) {
    			if(matriz[i][j] >= desde && matriz[i][j] <= hasta) {
    				cantidadDeELementos++;
    			}
    		}
    	
    	
    	}
    	return cantidadDeELementos;
    	
    }
	//Recorrido por filas y columnas
    
    /**
     * pre: 'matriz' es regular.
     * post: devuelve la cantidad de columnas de 'matriz' que tengan al menos un valor 0.
     */
    public int contarColumnasConCeros(double[][] matriz) {
    
    int contarColumnasConCeros = 0;
    for(int i = 0; i < matriz.length; i++) {
		for(int j = 0; j< matriz[i].length;j++) {
			if(matriz[i][j] == 0) {
				contarColumnasConCeros++;
				
			}
		}
    	
    }

    return contarColumnasConCeros;
    
    }
    
    /**
     * post: devuelve la cantidad de filas de 'matriz' que tengan al menos un valor 0.
     */
    public int contarFilasConCeros(double[][] matriz) {
    	boolean encontrecero = false;
    	int filasConCeros = 0;
    	for(int i = 0; i < matriz.length && !encontrecero; i++) {
    		for(int j = 0; j< matriz[i].length;j++) {
    			if(matriz[i][j]==0) {
    				filasConCeros++;
    				encontrecero = true;
    			}
    		}
    	
    	
    }
    
    return filasConCeros;
    }
    
    /**
     * post: devuelve un arreglo con tantos elementos como filas tiene 'matriz',
     *       donde cada posición contiene el promedio de esa fila.
     */
    public double[] promediarFilas(double[][] matriz) {
    	
    	double [] primedio = new double [matriz.length];
    	
    	for(int i = 0; i <matriz.length; i++) {
    		double suma = 0;
    		for(int j = 0 ; j < matriz[i].length;j ++) {
    			suma +=  matriz[i][j];
    		}
    	
    	
    	primedio[i] = suma / matriz[i].length;
    	
    	}
    	return primedio;
 }
    
  
    
    

	public static void main(String[] args) {
	 
		AnalizadorDeMatrices  ana = new AnalizadorDeMatrices ();
		// Caso 1: ningún cero
		double[][] m1 = {
		    { 5.0, 3.5, 2.4 },
		    { 2.1, -9.2, 5.1 },
		    { 2.3, 7.9, -2.3 },
		    { 1.0, 6.1, -8.5 }
		};
	  System.out.println("-------Caso 1-------");
      System.out.println("Cantidad de ceros en la matriz es: " + ana.contarCeros(m1));
      System.out.println("Cantidad de elemento desde"  + ana.contarElementosEnElRango(m1, 0, 3)); // 4 osea que numeros entran en ese rango
      System.out.println("Cantidad de columnas con ceros: " + ana.contarColumnasConCeros(m1)); // 0
      System.out.println("Cantidad de filas con ceros: " + ana.contarFilasConCeros(m1) ); // da 0
      
      double [] primedio = ana.promediarFilas(m1);
      System.out.println("Promediar filas : " + Arrays.toString(primedio));
  
      
      // Caso 2: tres ceros
      double[][] m2 = {
          { 2.0, 0.0, 3.4, 0.0 },
          { 0.0, 5.7, -2.3, 9.8 }
      };
      System.out.println("-------Caso 2-------");
      System.out.println("Cantidad de ceros en la matriz es: " + ana.contarCeros(m2));
      System.out.println("Cantidad de elemento desde"  + ana.contarElementosEnElRango(m2, 0, 5)); //5
      System.out.println("La cantidad de columnas con ceros es: " + ana.contarColumnasConCeros(m2));
      System.out.println("Cantidad de filas con ceros: " + ana.contarFilasConCeros(m2) ); // da 2
      double [] primedios = ana.promediarFilas(m2);
      System.out.println("Promediar filas : " + Arrays.toString(primedios));
      
   // Caso 3: matriz 1x1 sin ceros
      double[][] m3 = { { 1.6 } };
      // Esperado: 0
      
      System.out.println("Cantidad de ceros en la matriz es: " + ana.contarCeros(m3)); 
      System.out.println("La cantidad de columnas con ceros es: " + ana.contarColumnasConCeros(m3));
      System.out.println("Cantidad de filas con ceros: " + ana.contarFilasConCeros(m3) ); // da 0
      
      
      double[][] matriz = {
    		    { 6.0, 5.0, 4.0, 3.0 },
    		    { 8.0, 7.0, 7.0, 8.0 }
    		};
    		// Esperado: { 4.5, 7.5 }
      System.out.println("----caso 4-----");
      double [] primedioss = ana.promediarFilas(matriz);
      System.out.println("Promediar filas : " + Arrays.toString(primedioss));
  
	}

}
