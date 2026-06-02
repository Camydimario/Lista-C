package guiaProblemas;
import Numismatico.monedas;
import java.util.Arrays;
//todo viene de la clase moneda tambien puesta en gitgub

public class Numismatico {

	private monedas [] monedillas; //tipo moneda no int
	private String[] nombremonedas;

	public Numismatico(monedas [] monedillas) {
		this.monedillas = monedillas;
	}

//Obtener el valor total de la colección, sumando los valores nominales de todas las monedas que posee.

	public int sumarMonedas() {
		int suma = 0;
		for (int i = 0; i < monedillas.length; i++) {
			suma += monedillas[i].getValor();
	
		}
		return suma;
	}

//Buscar monedas de un país específico, devolviendo todas las monedas de ese país ordenadas por año de forma creciente.
	/**
     * Devuelve un arreglo con todas las monedas del país indicado,
     * ordenadas por año de forma creciente.
     * 
     * @param pais el nombre del país.
     * @return un arreglo de monedas del país solicitado.
     */

	public String[] buscarMonedilla(String pais) {
		String Paisbuscado = pais;
		int contadorDeMismoPais =0;
		for (int i = 0; i < monedillas.length; i++) {
			if(monedillas[i].getPais().equals( pais)) {
				contadorDeMismoPais++; // aca ejemplomme cuenta que hay 3 de argentina 
			}
		}
		
		
		String [] monedasNombres = new String [contadorDeMismoPais];
		int marcador=0;
		for (int i = 0; i < monedillas.length; i++) {
			if(monedillas[i].getPais()== pais) {
				monedasNombres[marcador] = nombremonedas[i];
				marcador++;
				
			}
		}
return monedasNombres;
	}

// * Devuelve un arreglo con las monedas más antiguas de la colección,
// es decir, aquellas con el año más bajo.

	// buscamor mas bajo y hago un aarray con eso
	// vamos a caseros ahora
	public monedas[] masAntigua() {
		int masAntigua = monedillas[0].getAnio();

		for (int i = 1; i < monedillas.length; i++) {
			if (monedillas[i].getAnio() < masAntigua) {
				masAntigua = monedillas[i].getAnio();
			}
		}
		
		
		int contarAntiguas = 0;
		for (int i = 1; i < monedillas.length; i++) {
			if(monedillas[i].getAnio()== masAntigua) {
				contarAntiguas++;
			}
		}
		monedas[] antiguedad = new monedas[contarAntiguas];
		int marcador = 0;
		for (int i = 0; i < monedillas.length; i++) {
			if (monedillas[i].getAnio() == masAntigua) {
				antiguedad[marcador] = monedillas[i];
				marcador++;
			}
		}
		
		return antiguedad;
	}


	
	
	public static void main (String []args) {
		monedas[] mone = new monedas[7];
		mone[0] = new monedas("España", 1950,10);
		mone[1] = new monedas("Argentina", 1900,25);
		mone[2] = new monedas("Brasil", 1850,15);
		mone[3] = new monedas("Francia", 1910,30);
		mone[4] = new monedas("Argentina", 1810,12);
		mone[5] = new monedas("Argentina", 1890,24);
		mone[6] = new monedas("España", 1990,15);
	
		
		Numismatico nume = new Numismatico(mone);
		System.out.println("Suma de los valores es :" + nume.sumarMonedas());
	   
		String [] buscarMonedilla = nume.buscarMonedilla("argentina");
		System.out.println("El array con la moneda solicitada:" +Arrays.toString(buscarMonedilla) );
	
		monedas [] masAntigua = nume.masAntigua();
		System.out.println("La moneda con el año mas bajo es:" + Arrays.toString(masAntigua));
		
		
		
	}
	
