package PracticasArreglos;

import java.util.Arrays;

public class Numeros {

	public Numeros() {
		
	}
	
	//comun
//sumar todos los numeros	
	public int sumarPositivos(int [] numeritos) {
		int suma = 0; 
      for(int i =0; i < numeritos.length; i ++	) {
    	  suma += numeritos[i];
      }
      return suma; //deberia dar 24
	}
//sacar el promedio total
	
	public double promedio(int [] numeritos) {
		int suma = 0;
		for(int i =0; i < numeritos.length; i ++	) {
			suma += numeritos[i];
		
        
}
	return (double) suma / numeritos.length;
}
	
	//numero maxixo
	
	public double obtenerMaximo(int []numeritos) {
		double maximo = numeritos[0];
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] > maximo) {
				maximo = numeritos[i];
			}
		}
		return maximo; // tendria que dar 11
	}
	
	//numero minino
	public double obtenerMinimo(int [] numeritos) {
		double minimo = numeritos[0];
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] < minimo) {
				minimo = numeritos[i];
			}
		}
		return minimo; // tendria que ser -2
	}
	
	// cuantas veces se repite el 2
	public int ContarDos(int []numeritos) {
		int contar=0;
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] == 2) {
				contar++;
			}
		}
		return contar; // deberia dar dos
	}
	
	
	//trasformacion
	//existe el 6?
	public boolean existencia (int [] numeritos) {
		boolean existe = false;
		for(int i = 0; i < numeritos.length && !existe; i ++) {
			if(numeritos[i] == 6) {
				existe = true;
			}
		}
		return existe;
	}
	
	// mostrame solo los positivos
	
	public int [] solosPositivos(int [] numeritos) {
		int contarpositivismo = 0;
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] > 0 ) {
				contarpositivismo++;
			}}
	 
	int [] positivos = new int [contarpositivismo];
	int marcador= 0;
	for(int i = 0; i < numeritos.length; i ++) {
		if(numeritos[i] > 0) {
			positivos[marcador] = numeritos[i];
			marcador++;
		}
	}
	
	return positivos;
	
	
	}
	
	
	// calcula el promedio de los positivos
	
	public double promedioPositivos (int [] numeritos) {
		
		int contarpositivismo = 0;
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] > 0 ) {
				contarpositivismo++;
			}}
	 
	int [] positivos = new int [contarpositivismo];
	int marcador= 0;
	int suma=0;
	for(int i = 0; i < numeritos.length; i ++) {
		if(numeritos[i] > 0) {
			positivos[marcador] = numeritos[i];
			suma += numeritos[i];
			marcador++;
		}
		} 
	
	return (double) suma/ positivos.length;
	}
	
	//suma todos los postivos menos el maximo
	
	
	public int todosMenosMaximo (int [] numeritos) {
		
	double maximo = numeritos[0]; //señalar	
	for(int i = 0; i < numeritos.length; i ++) {
		if(numeritos[i] > maximo) {
			maximo = numeritos[i];
			//tengo mi maximo ahora sumar
		}
	}
		
	  int [] todosmenosmax = new int [numeritos.length -1];
	  int marcador=0;
	  boolean yaSeSalteoElMaximo = false;
	  for(int i = 0; i < numeritos.length; i ++) {
		  if(numeritos[i] == maximo) {
			  yaSeSalteoElMaximo = true; 
	            continue;
			  
		  }if (marcador < todosmenosmax.length) {
	            todosmenosmax[marcador] = numeritos[i];
	            marcador++;
	        }
		  
	  }
	  int suma = 0;
	  for(int i = 0; i < todosmenosmax.length; i ++) {
		  suma += todosmenosmax[i];
	  }
		
		return suma;
		
	
	}
	
	//mostrar solo los negativos
	public int [] soloNegativos ( int [] numeritos) {
		int contarNega=0;
		for(int i = 0; i < numeritos.length; i ++) {
			if(numeritos[i] < 0) {
				contarNega++;
			}
		}
		
		int [] soloNegas = new int [contarNega];
		int marcador=0;
		for(int i = 0; i < numeritos.length; i++) {
			if(numeritos[i] <0) {
				soloNegas[marcador] = numeritos[i];
				marcador++;
			}
		
		
		
		}	
		
		return soloNegas;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int [] numeritos = {2,4,5,10,6,-2,-6,11,-8,2};
		
		Numeros nu = new Numeros();
		
		
		System.out.println("Suma total: " + nu.sumarPositivos(numeritos));
		
		System.out.println("Promedio: " + nu.promedio(numeritos));
		
		System.out.println("Maximo: " + nu.obtenerMaximo(numeritos));
		
		System.out.println("minimo: " + nu.obtenerMinimo(numeritos));
		
		System.out.println("veces que aparece el dos: " + nu.ContarDos(numeritos));
		
		System.out.println("existe el 6? " + nu.existencia(numeritos));
		
		int[] positivos = nu.solosPositivos(numeritos);
        System.out.println("Mostrar un array solo positivos: " + Arrays.toString(positivos));
		
		
		
		System.out.println("Promedio de los solos positivos: " + nu.promedioPositivos(numeritos));
		
		System.out.println("sumar todos menos el max: " + nu.todosMenosMaximo(numeritos));

		
		int [] soloNegas = nu.soloNegativos(numeritos);
		System.out.println("Mostrar un array de negativos: " + Arrays.toString(soloNegas));
		
	}

}
