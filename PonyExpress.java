package guiaProblemas;

public class PonyExpress {

//private int[] distancias;

//public PonyExpress(int[]distancias) {
	// this.distancias=distancias;
//}

	/**
	 * @param distancias es la distancia en millas de una estación hasta la otra
	 * @returns la cantidad de caballos necesarios para enviar el correo desde un
	 *          extremo hasta el otro del recorrido
	 */
	public int caballos(int[] distancias) {

		int contarCaballosPorEstacion = 1;
		int sumarMillas = 0;
		int sumartotal=0; //sirve para hacer el sumador, no es parte el problema, opcional para el syso.
		for (int i = 0; i < distancias.length; i++) {
			sumarMillas += distancias[i];
			sumartotal += distancias [i]; //sirve para hacer el sumador, no es parte el problema,opcional para el syso.
			if (sumarMillas > 100) {
				contarCaballosPorEstacion++;
				sumarMillas = distancias[i];

			}

		}
		System.out.println("la suma de millas es de: " + 	sumartotal); // da la suma escrita de la cantidad, opcional noc pide

		return contarCaballosPorEstacion;
	}

	public static void main(String[] args) {
		int[] distancias = { 18, 15 };

		// Puebas:
		 //int [] distancias = { 43, 23, 40, 13 };
		// int [] distancias= { 33, 8, 16, 47, 30, 30, 46 };
		// int [] distancias = { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49};
		// int [] distancias = {51,51,51};
		 //int [] distancias = {100,100,100,100,100};
		PonyExpress poni = new PonyExpress();

		System.out.println("La distancia la realizo " + poni.caballos(distancias) + " caballos");
		

	}


}
