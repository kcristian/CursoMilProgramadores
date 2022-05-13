package model.herencia;

public class ProductoLacteo extends Producto{
	
	private double cant_leche;
	private int temperatura;
	
	public ProductoLacteo(String n,double p,String r,int a,int m,int d,double cl, int t) {
		
		super(n,p,r,a,m,d);
		this.cant_leche=cl;
		this.temperatura=t;
		
	}

	public double getCant_leche() {
		return cant_leche;
	}

	public void setCant_leche(double cant_leche) {
		this.cant_leche = cant_leche;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("CANTIDAD DE LECHE: "+getCant_leche()+"º");
		System.out.println("TEMPERATURA DE REFRIGERACION: "+getTemperatura());
	}
}
