package guiaProblemas;


public class FilaDeEscolares{

private int[] alturas;
private int cantidadDeAlumnos;
private int alturaMasAlto;
private int alturaMasBajo;
private int Diferencia;
private double promedio;

	
public FilaDeEscolares(int [] alturas) {
 
     this.alturas = alturas;
 }

	//ccantidad
public int cantidadDeAlumnos() {
	int cantidad=0;
	for(int i=0; i< alturas.length; i++) {
		if(alturas[i]>= 60 && alturas[i] <= 200) {
			cantidad++;
		}
	}
	return cantidad;
}


//mas alto
public int alturaDelMasAlto() {
	int masAlto = alturas[0];
	for(int i=1; i< alturas.length; i++) {
		if(alturas[i]> masAlto) {
			masAlto= alturas[i];
		}
	}
	return masAlto;
}

//mas bajo

public int alturaDelMasBajo() {
	int masBajo = alturas[0];
	for(int i=1; i< alturas.length; i++) {
		if(alturas[i]<masBajo) {
			masBajo= alturas[i];
		}
	}
	return masBajo;
}

//filtramos los mas bajos , a posicion del mas bajo

public int ubicacionDeLosMasBajos () {
	int masbajos= alturas[0];
	
	for(int i=1; i< alturas.length; i++) {
		if(alturas[i]<masbajos) {
			masbajos= alturas[i];
}}

//filtro

	int posicion=-1;
	for(int i=0; i< alturas.length && posicion == -1; i++) {
		if(alturas[i]==masbajos) {
			posicion = i;
		}
	
	
	}
	return posicion;
}

	//diferecncia




//promedio

public int promedioDeLasAlturas() {
	int suma=0;
	for(int i=0; i< alturas.length; i++) {
		suma+= alturas[i];
	}
	return (int) suma/alturas.length;
}

public int mayorDiferenciaDeLasAlturas() {
	int mayorDiferencia =0 ;
	
	for(int i=1; i< alturas.length; i++) {
		int diferencia= Math.abs(alturas[i]- alturas[i-1]);
		if(diferencia > mayorDiferencia) {
			mayorDiferencia = diferencia;
		}
	}
	return mayorDiferencia;
}



public static void main (String [] args) {
FilaDeEscolares fila = new FilaDeEscolares(new int[] {72, 67, 103, 69, 79, 123, 141, 66, 79, 112, 174, 90});

//pruebas:

//FilaDeEscolares fila = new FilaDeEscolares(new int[] {61, 67, 103, 69, 79, 123, 141, 66, 79, 112, 198, 90,100,80,101});
//FilaDeEscolares fila = new FilaDeEscolares(new int[] {80, 67, 103, 69, 79, 123});
System.out.println("Cantidad De Alumnos: " + fila.cantidadDeAlumnos());
 
System.out.println("Altura del mas Alto: " + fila.alturaDelMasAlto());

System.out.println("Altura del mas bajo: " + fila.alturaDelMasBajo());

System.out.println("Posicion del mas bajo: " + fila.ubicacionDeLosMasBajos());

System.out.println("La mayor diferencia es de: " + fila.mayorDiferenciaDeLasAlturas());

System.out.println("Promdio de las alturas: " + fila.promedioDeLasAlturas());
}
}
