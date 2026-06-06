package ArreglosMulti;

public class CuadradoMagico {

	/**
	 * post: devuelve true si 'matriz' es un cuadrado mágico válido.
	 */
	public boolean verificar(int[][] matriz) {

		int sumaReferencia = 0;
		for (int j = 0; j < matriz[0].length; j++) {
			sumaReferencia += matriz[0][j];
		}
		// int sumarFilas=0;
		for (int i = 0; i < matriz.length; i++) {
			int sumarFilas = 0;

			for (int j = 0; j < matriz[i].length; j++) {
				sumarFilas += matriz[i][j];
			}
			if (sumarFilas != sumaReferencia) {
				return false;
			}
		}

		// sumarColumnas
		for (int j = 0; j < matriz[0].length; j++) {
			int sumarColumna = 0;
			for (int i = 0; i < matriz.length; i++) {

				sumarColumna += matriz[i][j];
			}
			if (sumarColumna != sumaReferencia) {
				return false;
			}
		}

		// sumarDiagonales
		int sumardiagonalizq = 0;
		for (int i = 0; i < matriz.length; i++) {
			sumardiagonalizq += matriz[i][i];
		}
		if (sumardiagonalizq != sumaReferencia) {
			return false;

		}

		// sumarDiagonalDerecha
		int sumardiagonalder = 0;
		for (int i = 0; i < matriz.length; i++) {
			sumardiagonalder += matriz[i][matriz.length - 1 - i];
		}
		if (sumardiagonalder != sumaReferencia) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		CuadradoMagico cuadra = new CuadradoMagico();
		int[][] magico = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		// Esperado: true
		System.out.println("Es cuadrado magico? " + cuadra.verificar(magico));

       //No es mágico
		int[][] noMagico = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
       //Esperado: false

		System.out.println("Es cuadrado magico? " + cuadra.verificar(noMagico));

         //Matriz no cuadrada
		int[][] rectangular = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        //Esperado: false

		System.out.println("Es cuadrado magico? " + cuadra.verificar(rectangular));
	}

}
