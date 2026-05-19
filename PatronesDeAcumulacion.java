package MicroPatrones;

public class PatronesDeAcumulacion {

	public static void main(String[] args) {
		
		double[] temperaturas = { 18.5, 22.0, 31.0, 27.3, 15.0, 29.0, 24.1, 20.8 };
		
		//Calcula la suma de todos los elementos.
		int suma=0;
		for(int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];
		}
		System.out.println("La suma de todos los elementos es:" + suma);
		
		//Calculá el producto acumulado de todos los elementos. 
		//¿Qué pasa si inicializás el acumulador en 0lugar de 1?
		double multiplicar = 1;
		for(int i=0; i < temperaturas.length; i++) {
		multiplicar = multiplicar * temperaturas[i];
		}
		System.out.println("El producto acumulado de los elementos es :" + multiplicar);
		
		//Calcula el promedio. ¿Qué tipo de dato debe tener 
		//el acumulador para no perder la parte decimal?
		double sumas =0;
		for(int i=0; i < temperaturas.length; i++) {
			 sumas  += temperaturas[i];
		}
		double promedio = (double) sumas/ temperaturas.length;
		
		System.out.println("El promedio es de :" +  promedio);
		
		
		//Encontrá el máximo usando una comparación específica con if.
		double maximo = temperaturas[0];
		
		for(int i=0; i < temperaturas.length; i++) {
			if(temperaturas[i]> maximo) {
				maximo = temperaturas[i];
			}}
		System.out.println("El maximo es de :" + maximo);
		
		
		//Repita el artículo anterior usando Math.max. ¿Cuál te parece más legible?
		double max = temperaturas[0];
		for(int i =0; i < temperaturas.length; i++) {
			max = Math.max(max, temperaturas[i]);
		}
		System.out.println("El max es:" + max);
		
		//Encontrá el mínimo y el máximo en un solo recorrido.
		double minimo= temperaturas[0];
		double mamaximo= temperaturas[0];
		for(int i =0; i < temperaturas.length; i++) {
			minimo=Math.min(minimo, temperaturas[i]);
			mamaximo = Math.max(mamaximo, temperaturas[i]);
		}
		System.out.println("el minimo es :" + minimo + "el maximo es :" + mamaximo);
	}
	}
