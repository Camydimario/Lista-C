package ArreglosMulti;

import java.util.Arrays;

public class Temperaturas {

	public static void main(String[] args) {
		double[][] temps = {
			    { 22.0, 18.5, 31.0, 27.3 },
			    { 15.0, 29.0, 24.1, 20.8 },
			    { 30.2, 33.0, 28.7, 25.5 }
			};
    // fila (ciudad) con la temperatura mas baja
	
	double  minimo = temps [0][0];
	int CiudadMinimo = 0;

	for(int i = 0; i < temps.length;i++) {
		for (int j = 0; j < temps[i].length;j++) {
			if(temps[i][j] < minimo) {
				minimo = temps[i][j];
				CiudadMinimo = i;
			}
		}
 
	}
	System.out.println("La temperatura mas baja es" + minimo + " en la ciudad " + CiudadMinimo);	 

	//columna(dia) con temperaturas mas bajas
	
	double  minimos = temps [0][0];
	int diaMinimo = 0;

	for(int i = 0; i < temps.length;i++) {
		for (int j = 0; j < temps[i].length;j++) {
			if(temps[i][j] < minimos) {
				minimos = temps[i][j];
				diaMinimo = j;
			}
		}
 
	}
	System.out.println("La temperatura mas baja es" + minimos + " en el dia " + diaMinimo);
	
	
	//Devolver un array con las temperaturas promedio de cada ciudad.
	double suma = 0;
	int cadaciudad=0;
	for(int i = 0; i < temps.length;i++) {
		for (int j = 0; j < temps[i].length;j++) {
			suma += temps [i][j];
		    cadaciudad=i;			
			
		}
	
	double promedio= suma/temps.length; // me da el promedio
	System.out.println("El promedio de cada ciudad es " + promedio + cadaciudad);
	double[] promediosCiudades = new double[temps[0].length];
	promediosCiudades[i] = promedio;
		
	
	
	System.out.println("El promedio de cada ciudad es "  + promediosCiudades[i]);
		
	
	}
	// El tamaño del nuevo array será igual a la cantidad de filas (ciudades)
    double[] promedios = new double[temps.length];

    for (int i = 0; i < temps.length; i++) {
        double sumas = 0;
        
        // Sumamos todas las temperaturas de la ciudad actual
        for (int j = 0; j < temps[i].length; j++) {
            sumas += temps[i][j];
        }
        
        // Calculamos el promedio y lo guardamos
        promedios[i] = suma / temps[i].length;
    }

    System.out.println("El promedio de cada ciudad es "  + promedios);
    
    // promedio de cada fila
    
    //int promeporciudad = 0;
    double[] promedioss = new double[temps.length];
    for (int i = 0; i < temps.length; i++) {
    	 double sumass = 0;
    	for(int j = 0; j < temps[i].length; j ++) {
    		sumass += temps[i][j];
    		
    	} 
    
    	promedioss[i] = sumass / temps[i].length;
	}
    	
    	System.out.println("El promedio de cada ciudad es " + Arrays.toString(promedioss));
    
    
    
    
    
    
    
    
    
    
}
	
	}
	
