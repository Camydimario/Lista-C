//incomplet


package PracticasArreglos;

public class Golosineria {

	public Golosineria () {}
	
	
	
double [] precios ={24.50, 13.40, 25, 12.40, 58, 85,23.50 };	
	


//acumular suma
public double sumartotalprecio	(double []precios) {
	double suma= 0;
	for(int i =0; i< precios.length; i++) {
		suma += precios[i];
	}
return suma;
}
	
//promedio

public double promedio (double [] precios) {
	double suma=0;
	for(int i =0; i< precios.length; i++) {
		suma += precios[i];
		}
	return (double) suma/precios.length;
}


//precio max

public double maximo (double [] precios) {
	double maximo= precios[0];
	for(int i =0; i< precios.length; i++) {
		if(precios[i]> maximo) {
			maximo = precios[i];
		}
	}
	return maximo;
}

// precio minimo

public double minimo (double [] precios) {
	double minimo = precios[0];
	for(int i =0; i< precios.length; i++) {
		if(precios[i]< minimo) {
			minimo = precios[i];
		}
	}
	return minimo;
	
}


// conta la cantidad de precios mayores a 50 

public int contarpreciosmayores(double [] precios) {
	int contar=0;
	
	for(int i =0; i< precios.length; i++) {
		if(precios[i]>50) {
			contar++;
		}
	}
	return contar;

}

//colocar solo los mayores o igual a 25

public double [] mayoressolos( double [] precios) {
	
//contar solo los mayores o iguales a 25
	
int contarMaximos = 0;

for(int i =0; i< precios.length; i++) {
	if(precios[i] >= 25) {
		contarMaximos++;
	}
}
int temporal =0;
double [] premayores= new double[contarMaximos];

for(int i =0; i< precios.length; i++) {
	if(precios[i]>= 25) {
		premayores[temporal]= precios[i];
		temporal++;
	}
}
return premayores;

}











}
