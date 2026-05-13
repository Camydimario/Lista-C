package ExpendedorDePasajes;

public class ExpendedorDePasajes {
	//pre: el exprendedor De pasajes, tiene un precio por kilomentros
	//post se registra el precio por kilometro y se inicializa
     private double precioPorKm;
    private double distanciaEnKm;
    private int ventaPasaje;
    private double distanciaEnKmMaxima;
    double promedio;
    private double distanciaTotalAcumulada;
    double costoDeVenta;
    double recaudacion;
   // private int ventaTotal;
	   public ExpendedorDePasajes(double precioPorKm) {
		   this.precioPorKm= precioPorKm;
	   }
	   
//pre : se venden un passajes con un valor segun la distancia .
	   //post : DEVULEVE el precio segun la distancia para vender.
 public double venderPasaje(double distanciaEnKm) {
	 
	 return venderPasajes(1, distanciaEnKm);
      
    
 }
//pre : se venden los passajes con un valor segun la distancia y la cantidad
 //post : DEVULEVE el precio segun la distancia y la cantidad.
 
 
public double venderPasajes(int cantidad, double distanciaEnKm) {
   this.costoDeVenta = cantidad * (this.precioPorKm * distanciaEnKm);
     ventaPasaje += cantidad;
     distanciaTotalAcumulada += cantidad * distanciaEnKm;
     recaudacion += costoDeVenta;
     if( distanciaEnKm > distanciaEnKmMaxima ) {
    	 distanciaEnKmMaxima = distanciaEnKm;
     }
	return costoDeVenta ;	
}

//post: se devuelve la cantidad de pasajes que se vendio
public int contarPasajesVendidos() {
	return ventaPasaje;
}
//post: se devuelve la distancia Maxima realizada
public double obtenerDistanciaMaxima() {
	return distanciaEnKmMaxima;
	    	
	    }
//post: se devuelve la distancia promedio  realizada
public double calcularDistanciaPromedio() {
  return  distanciaTotalAcumulada / ventaPasaje ;
	    }
//post: se devuelve la venta total realizada
public double calcularVentaTotal() {
	return this.recaudacion;
}

public static void main (String []args) {
	System.out.println("-----caso N°1-----");
	 ExpendedorDePasajes pasajito = new ExpendedorDePasajes(20);   	// 20 pesos
	 System.out.println("se vende un pasaje por $ " + pasajito.venderPasaje(300)); // vender pasaje con una distancia de 300
	 System.out.println("se venden tales pasajes por $ " + pasajito.venderPasajes(3, 300));
	 System.out.println("Cantidad de pasajes vendido :" + pasajito.contarPasajesVendidos());
	  System.out.println("Ditancia maxima realizada :." + pasajito.obtenerDistanciaMaxima());
     System.out.println("Distancia promedio realizada :" + pasajito.calcularDistanciaPromedio());
     System.out.println("Venta total realizadas : $" + pasajito.calcularVentaTotal());


     System.out.println("-----caso N°2-----");
	 ExpendedorDePasajes pasajito2 = new ExpendedorDePasajes(50);   	// 20 pesos
	 System.out.println("se vende un pasaje por $ " + pasajito2.venderPasaje(800)); // vender pasaje con una distancia de 300
	 System.out.println("se venden tales pasajes por $ " + pasajito2.venderPasajes(5, 400));
	 System.out.println("Cantidad de pasajes vendido :" + pasajito2.contarPasajesVendidos());
	  System.out.println("Ditancia maxima realizada :." + pasajito2.obtenerDistanciaMaxima());
     System.out.println("Distancia promedio realizada :" + pasajito2.calcularDistanciaPromedio());
     System.out.println("Venta total realizadas : $" + pasajito2.calcularVentaTotal());


}
	    
	
	
	
	
	
	
	
	
	
	
}
