package MicroPatrones;
import java.util.Arrays;

public class Notas {
	//double[] notas = { 7.5, 4.0, 9.0, 6.5, 3.0, 8.5, 5.0, 9.5, 6.0, 4.5 };
	/**
	 * post: devuelve el promedio de todas las notas.
	 */
	public double promedio(double[] notas) {
		//acumulador
		
		double suma= 0;
		for(int i=0; i < notas.length; i++) {
			suma+= notas[i];
		}
		double promedio = (double) suma/notas.length;
		
	return promedio;
	
	}

	/**
	 * post: devuelve la nota más alta.
	 */
	public double notaMaxima(double[] notas){
		double maximo = notas[0];
		
		for(int i = 0; i< notas.length; i++) {
			if(notas[i]> maximo) {
				maximo= notas[i];
			}
		}
		return maximo;
		
	}
	/**
	 * post: devuelve la nota más baja.
	 */
	public double notaMinima(double[] notas){
	
	double minimo =  notas[0];
	for(int i =1; i < notas.length; i++) {
		if(notas[i] < minimo) {
			minimo = notas[i];
		}
	}
		
	return minimo;	
		}
	
	
	
	/**
	 * post: devuelve la cantidad de alumnos que aprobaron (nota >= 6.0).
	 */
	public int aprobados(double[] notas) {
		
		int cantidadAprobados =0;
		for(int i =0; i < notas.length; i++) {
			if(notas[i] > 6.0) {
				cantidadAprobados++;
			}
		}
		return cantidadAprobados;
		
	}

	/**
	 * post: devuelve un arreglo con las notas de los alumnos que desaprobaron (nota < 6.0).
	 *       El tamaño útil del arreglo resultado se indica por el valor de retorno de un
	 *       segundo método auxiliar, o puede inferirse del contenido.
	 */
	public double[] notasDesaprobados(double[] notas) {
		
	   int contarDesaprobados=0;
	   
		for(int i= 0; i < notas.length; i ++) {
			if(notas[i] < 6.0) {
				contarDesaprobados++;
			}
		}
			
		//int  temporal =0;
		double [] desaprobados = new double [contarDesaprobados];
		int desa = 0;
		for(int i= 0; i < notas.length; i ++) {
			if(notas[i] < 6.0) {
			desaprobados[desa] = notas[i];
			desa++;
		}
		}	
		return desaprobados;
		
	}

	/**
	 * post: devuelve el promedio de los alumnos que aprobaron.
	 */
	public double promedioAprobados(double[] notas) {
		int contarAprobados=0;
		double suma =0; 
		for(int i=0; i < notas.length; i++) {
			if(notas[i] >= 6) {
				suma += notas[i];
				contarAprobados++;
			}

		}
		return  (double) suma / contarAprobados;
	}
	


public static void main (String[]args) {
	
	double[] notas = { 7.5, 4.0, 9.0, 6.5, 3.0, 8.5, 5.0, 9.5, 6.0, 4.5 };

	Notas notitas = new Notas();
	
	
	
	System.out.println("el promedio es de:" + notitas.promedio(notas));
	
	System.out.println("Nota maxima es:" + notitas.notaMaxima(notas));
	System.out.println("Nota minima es:" + notitas.notaMinima(notas));
	
	System.out.println("aprobados son :" + notitas.aprobados(notas));
	

	
	System.out.println("Promedio de aprobados es de:" + notitas.promedioAprobados(notas));
	
	double[] desaprobados =notitas.notasDesaprobados(notas);
	System.out.println("Notas desaprobadas: " + Arrays.toString(desaprobados));
	

	
	
}













}

