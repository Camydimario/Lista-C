package ArreglosMulti;

public class MapaDeHumedad {

	private double[][] humedad;

	public MapaDeHumedad() {
		//this.humedad = humedad;
	}

	/*
	 * 
	 * post: devuelve el total del promedio de humedad
	 *
	 * 
	 */

	public double promedioTotal(double[][] humedad) {
		double suma = 0;
		for (int i = 0; i < humedad.length; i++) {
			for (int j = 0; j < humedad[i].length; j++) {
				suma += humedad[i][j];
			}
		}
		return (double) suma / humedad.length;
	}

	/*
	 * . post: devuelve el valor minimo de humedad
	 */

	public double minimo(double[][] humedad) {

		double minimo = humedad[0][0];
		for (int i = 1; i < humedad.length; i++) {
			for (int j = 1; j < humedad[i].length; j++) {
				if (humedad[i][j] < minimo) {
					minimo = humedad[i][j];
				}
			}

		}
		return minimo;
	}

	/*
	 * . post: devuelve el valor maximo de humedad
	 */

	public double maximo(double[][] humedad) {

		double maximo = humedad[0][0];
		for (int i = 1; i < humedad.length; i++) {
			for (int j = 1; j < humedad[i].length; j++) {
				if (humedad[i][j] > maximo) {
					maximo = humedad[i][j];
				}
			}

		}
		return maximo;
	}

	/*
	 * post: devuelve la cantidad de valores comprendida entre un rango de minimo y
	 * un maximo
	 */

	public int cantidadDeValorPorRango(double[][] humedad, double minimo, double maximo) {
		int cantidad = 0;
		for (int i = 0; i < humedad.length; i++) {
			for (int j = 0; j < humedad[i].length; j++) {
				if (humedad[i][j] >= minimo && humedad[i][j] <= maximo) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	/*
	 * 
	 * post: devuelve la humedad del contorno del mapa
	 */

public double promedioContorno ( double [][] humedad) {
	int contarContornos=0;
	for(int i = 0; i < humedad.length; i++) {
		 for (int j = 0; j < humedad[i].length; j ++) {
			 if (i == 0 || i == humedad.length - 1 || j == 0 || j == humedad[i].length - 1) {
				 contarContornos++;
			 }
		 }
	}
 double [] promediocontornos = new double [contarContornos];
 int marcador=0;

 for(int i = 0; i < humedad.length; i++) {
	 for (int j = 0; j < humedad[i].length; j ++) {
		 if (i == 0 || i == humedad.length - 1 || j == 0 || j == humedad[i].length - 1) {
             promediocontornos[marcador] = humedad[i][j];
             marcador++;
            
	 }
		 }
		 
	 }
	 double suma = 0;
	 for( int c = 0; c < promediocontornos.length; c++) {
		 suma += promediocontornos[c];
	 }


  return (double) suma/promediocontornos.length; 

 
}


//version facil 
public double promedioContornosfacil(double [] [] humedad) {
	int cantidad = 0;
	double suma =0;
	for(int i = 0; i < humedad.length; i++) {
		 for (int j = 0; j < humedad[i].length; j ++) {
			 if (i == 0 || i == humedad.length - 1 || j == 0 || j == humedad[i].length - 1) {
				 suma += humedad[i][j];
				 cantidad++;
			 }
		 }
		 
	}
	return (double) suma / cantidad;
}







	public static void main(String[] args) {
		MapaDeHumedad mapita =  new MapaDeHumedad();
		double[][] muestras = {
			    { 45.0, 60.0, 72.0, 55.0 },
			    { 38.0, 91.0, 83.0, 47.0 },
			    { 50.0, 66.0, 74.0, 52.0 }
			};

		System.out.println("Promedio total de humedad: " + mapita.promedioTotal(muestras));
		System.out.println("Valor minimo de humedad: " + mapita.minimo(muestras));
		System.out.println("Valor maximo de humedad: " + mapita.maximo(muestras));
		System.out.println("Cantidad de valores por rango: " + mapita.cantidadDeValorPorRango(muestras, 40, 50));
		System.out.println("El promedio del contorno es de: " + mapita.promedioContorno(muestras) );
		System.out.println("El promedio del contorno facil es de: " + mapita.promedioContornosfacil(muestras));
		
		
	}

}
