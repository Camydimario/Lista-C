package guiaProblemas;
//hecho en clases, dps lo hago yo a mi manera mas sencilla 
public class SecuenciasMaximas {

	/**
	 * Se tiene una secuencia de números naturales, que representan valores
	 * proporcionados por un instrumento de medición. La naturaleza del fenómeno
	 * medido es tal que dichos valores, para ser válidos, no deben ser múltiplos de
	 * 2, de 3 ni de 5. Los valores que sean múltiplos de uno o más de esos tres
	 * números deben ser considerados inválidos.
	 * 
	 * @param args
	 */
	private int[] valores;

	public SecuenciasMaximas(int[] valores) {
		this.valores = valores;

	}

	private boolean esValido(int numero) {
		return (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0);
		// los que no son multiplos
	}

	/**
	 * @return cuántos valores válidos se han recibido
	 */
	public int cuantosValoresValidos() { // 5
		int validos = 0;
		for (int i = 0; i < valores.length; i++) {
			if (esValido(valores[i])) {
				validos++;
			}
		}
		return validos; // deberia aver 5
    //lo haria filtrando yo ,luego lo hago con el filtro qe yo se 
	}

	/**
	 * @return la longitud de la o las secuencias más largas de valores válidos
	 *         consecutivos. 
	 */
	//lo haria con maximo de patron, dps lo hago a mi manera
	public int longitudSecuenciaMaxima() {
	    int consecutivos = 0;
		int cantidadmaxima=0;
		for (int i = 0; i < valores.length; i++) {
			if (esValido(valores[i])){
				consecutivos++;
			}else {
				cantidadmaxima = Math.max(consecutivos,cantidadmaxima); //maximo entre dos valores
				consecutivos = 0; //reinicia el contador, si es invalido regresa
				
			}
			
		}

		return cantidadmaxima;
	}

	public static void main(String[] args) {
		int v[] = { 9, 7, 11, 6, 14, 19, 5, 11, 17, 18 };
		//pruebas:
		//int v[] = {}; // vacio
		//int v[] = {7}; //solo uno
		//int v[] = {7,7,7,7,7}; // todos iguales
		//int v [] = {7,7,7,7,10,7,7,7}; 
		//int v [] = {7,7,2,4,7};
		SecuenciasMaximas sm = new SecuenciasMaximas(v);
        int validos = sm.cuantosValoresValidos();
        System.out.println("validos: " + validos);
        int cantidadmaxima = sm.longitudSecuenciaMaxima();
        System.out.println("Maximo: " + cantidadmaxima);
	}

}
