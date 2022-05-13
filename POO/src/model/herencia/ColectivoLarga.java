package model.herencia;

public class ColectivoLarga extends Colectivo{
	
	private double capacidad_peso;
	private boolean servicios;
	
	public ColectivoLarga(String marca,String estado,int capacidad,double peso,double capacidad_peso) {
		super(marca,estado,capacidad,peso);
		this.capacidad_peso=capacidad_peso;
		this.servicios=true;
	}

	public double getCapacidad_peso() {
		return capacidad_peso;
	}

	public void setCapacidad_peso(double capacidad_peso) {
		this.capacidad_peso = capacidad_peso;
	}
	
	public boolean isServicios() {
		return servicios;
	}

	public void setServicios(boolean servicios) {
		this.servicios = servicios;
	}

	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("CAPACIDAD DE EQUIPAJE: "+getCapacidad_peso()+" kg");
		if(isServicios()) {
			System.out.println("SERVICIO?: SI");
		}else {
			System.out.println("SERVICIO?: NO");
		}
	}
}
