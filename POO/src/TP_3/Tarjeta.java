package TP_3;

public class Tarjeta {

	public static void main(String[] args) {
		
		//                           ### Ejercicio 3 ###
		
		//A) JPTarjeta y DMTarjeta son instancias de TCredito
		//B) JPTarjeta.muestraDatos() muestra en pantalla los datos nombre y numero de tarjeta
		//C) se agrego los geters de los demas atributos.
		//D) se aumento el limite.
		//E) Si hay un metodo pagar con tarjeta seria necesario. pero solo no. 
		//F) 
		
			 TCredito JPTarjeta=new
			 TCredito("666","JPerez","BcoPatagonia",2000,20000);
			 TCredito DMTarjeta=new
			 TCredito("777","DMartin","BcoGalicia",5000,10000);
			 JPTarjeta.muestraDatos();
			 System.out.println(JPTarjeta.puedoComprar(16000));
			 DMTarjeta.pagarTarjeta(1500);
			 DMTarjeta.muestraDatos();

	}

}
