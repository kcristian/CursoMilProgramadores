package TP_2;

public class Taxi {
	
	private String id;
	private int num_taxi;
	private int tipo_tarifa;
	private double precio_bandera;
	private static int num_taxi_siguiente=150;
	
	public Taxi(String id, int tt) {
		if(tt==1) {
			
			this.tipo_tarifa=tt;
			this.precio_bandera=58;
			
		}else if(tt==2) {
			
			this.tipo_tarifa=tt;
			this.precio_bandera=70;
			
		}else {
			
			this.tipo_tarifa=tt;
			this.precio_bandera=58;
		}
		this.id=id;
		this.num_taxi=num_taxi_siguiente;
		num_taxi_siguiente++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTipo_tarifa() {
		return tipo_tarifa;
	}

	public void setTipo_tarifa(int tipo_tarifa) {
		this.tipo_tarifa = tipo_tarifa;
	}

	public double getPrecio_bandera() {
		return precio_bandera;
	}

	public void setPrecio_bandera(double precio_bandera) {
		this.precio_bandera = precio_bandera;
	}

	public int getNum_taxi() {
		return num_taxi;
	}
	
	public void cambiarTarifa(){
		
		if(getTipo_tarifa()==1) {
			
			setTipo_tarifa(2);
			setPrecio_bandera(70);
			System.out.println("cambio de tarifa exitoso");
			
		}else if(getTipo_tarifa()==2){
			
			setTipo_tarifa(1);
			setPrecio_bandera(58);
			System.out.println("cambio de tarifa exitoso");
		}
	}
	
	public String calcularTotalAPagar(int metros) {
		double resultado;
		
		if(getTipo_tarifa()==1) {
			
			resultado=getPrecio_bandera()+(metros*5);
			
		}else if(getTipo_tarifa()==2) {
			
			resultado=getPrecio_bandera()+(metros*8);
			
		}else {
			resultado=0;
		}
		
		return "El total a pagar es: "+resultado;
	}
	
	public void mostrarDatos() {
		
		System.out.println("### Datos del Taxi ###");
		System.out.println("ID: "+getId());
		System.out.println("NUMERO: "+getNum_taxi());
		System.out.println("TIPO DE TARIFA: "+getTipo_tarifa());
		System.out.println("PRECIO DE BAJADA DE BANDERA: "+getPrecio_bandera());

	}
}
