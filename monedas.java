package Numismatico;
//moneda es parte de la clase numismatico

public class monedas {
private String pais;
private int anio;
private int valor;
	
	public monedas (String pais, int anio , int valor) {
		this.pais = pais;
		this.anio=anio;
		this.valor=valor;
	}
	
	
	public String getPais() {
		return pais;
	}

	public int getValor() {
		return valor;
	}

	public int getAnio() {
		return anio;
	}
	
	@Override
	public String toString() {
	    return "Moneda: " + pais + " (" + anio + ") - Valor: $" + valor;
	}
	
	
	}
