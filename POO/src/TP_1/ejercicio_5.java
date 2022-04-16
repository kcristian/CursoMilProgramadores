package TP_1;

public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta micuenta=new Cuenta("cristian","BG9",10.5,10000);
		Cuenta miotracuenta=new Cuenta("k9","9GB",10.5,10000);
		micuenta.mostrarDatos();
		micuenta.transferencia(miotracuenta, 2000);
		miotracuenta.mostrarDatos();
		micuenta.mostrarDatos();
		
	}

}
class Cuenta{
	
	private String nombre_cliente;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo_cuenta;
	
	public Cuenta() {
		
	}
	public Cuenta(String nombre, String cuenta,double interes, double saldo) {
		
		this.nombre_cliente=nombre;
		this.numero_cuenta=cuenta;
		this.tipo_interes=interes;
		this.saldo_cuenta=saldo;
		
	}
	public Cuenta(Cuenta c) {
		this.nombre_cliente=c.getNombre_cliente();
		this.numero_cuenta=c.getNumero_cuenta();
		this.tipo_interes=c.getTipo_interes();
		this.saldo_cuenta=c.getSaldo_cuenta();
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public double getTipo_interes() {
		return tipo_interes;
	}
	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}
	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}
	public void setSaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	
	public void mostrarDatos() {
		
		System.out.println("");	
		System.out.println("Datos de la cuenta numero: "+this.numero_cuenta);
		System.out.println("Nombre del cliente: "+this.nombre_cliente);
		System.out.println("tipo de interes: "+this.tipo_interes);
		System.out.println("saldo: "+this.saldo_cuenta);
					
	}
	public boolean ingreso(int cantidad) {
		boolean respuesta=false;
		
		if(cantidad>=0) {
			respuesta=true;
			this.saldo_cuenta+=cantidad;
			System.out.println("ingreso realizado");
		}else {
			System.out.println("saldo negativo");
		}
		
		return respuesta;
	}
	public boolean reintegro(int cantidad) {
		boolean respuesta=false;
		
		if(cantidad>0) {
			if(this.saldo_cuenta>=cantidad) {
				respuesta=true;
				this.saldo_cuenta-=cantidad;
			}else {
				System.out.println("saldo insuficiente para el reintegro");
			}
			
		}else {
			System.out.println("el reintegro debe indicar un valor no negativo ");
		}
		
		return respuesta;
	}
	
	public boolean transferencia(Cuenta destino, int importe) {
		boolean respuesta=false;
		if(importe>0) {
			if(this.reintegro(importe)) {
				System.out.println("se reintegro de tu cuenta");
				if(destino.ingreso(importe)) {
					respuesta=true;
					System.out.println("se ingreso dinero a la cuenta destino");
				}else {
					System.out.println("ha ocurrido un error");
				}
			}else {
				System.out.println("no se pudo reintegrar de tu cuenta");
			}
			
		}else {
			System.out.println("el importe no puede ser negativo");
		}
		
		
		return respuesta;
	}
	
}