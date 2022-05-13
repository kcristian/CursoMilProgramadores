package model.herencia;

public class ProductoEnvasado extends Producto{
	
	private String tipo_envase;
	
	public ProductoEnvasado(String n,double p, String r,int a, int m, int d,String te) {
		
		super(n,p,r,a,m,d);
		this.tipo_envase=te;
		
	}

	public String getTipo_envase() {
		return tipo_envase;
	}

	public void setTipo_envase(String tipo_envase) {
		this.tipo_envase = tipo_envase;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("TIPO DE ENVASE: "+getTipo_envase());
	}
}
