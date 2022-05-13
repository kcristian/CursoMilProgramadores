package model.herencia;

public class ColectivoMedia extends Colectivo{
	
	private boolean servicios;
	
	public ColectivoMedia(String marca,String estado,int capacidad,double peso) {
		super(marca,estado,capacidad,peso);
		this.servicios=false;
	}

	public boolean isServicios() {
		return servicios;
	}

	public void setServicios(boolean servicios) {
		this.servicios = servicios;
	}
	public void mostrarDatos() {
		super.mostrarDatos();
		if(isServicios()) {
			System.out.println("SERVICIO?: SI");
		}else {
			System.out.println("SERVICIO?: NO");
		}
	}
}
