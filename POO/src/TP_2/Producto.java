package TP_2;

public class Producto {
	
	private int id;
	public static int id_siguiente=1;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	Producto(String n,String c,double p,int s){
		
		this.nombre=n;
		this.categoria=c;
		this.precio=p;
		this.stock=s;
		this.id=id_siguiente;
		id_siguiente++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getId() {
		return id;
	}
	
	public boolean validarStock(int cantidad) {
		
		boolean respuesta=false;
		
		if(getStock()>=cantidad) {
			
			respuesta=true;
			
		}
		
		return respuesta;
		
	}
	
	public boolean comprobarCategoria(String nombre) {
		
		boolean respuesta=false;
		
		if(getCategoria().equals(nombre)) {
			
			respuesta=true;
			
		}
		
		return respuesta;
		
	}
	
	public String vender(String categoria,int unidades) {
		
		String respuesta= "";
		
		if(validarStock(unidades)){
			
			if(comprobarCategoria(categoria)) {
				
				respuesta= "Total a pagar: "+getPrecio()*unidades;
				setStock(getStock()-unidades);
				System.out.println("Stock actualizado");
				
			}else {
				
				respuesta= "Las categorias no coinciden";
			}
			
		}else {
			respuesta="No hay stock para realizar esta venta";
		}
		
		return respuesta;
	}
	
	public String comprar(String categoria,int unidades) {
		
		String respuesta="";
		
		if(comprobarCategoria(categoria)) {
			
			if(getStock()<100) {
				
				setStock(getStock()+unidades);
				respuesta="Id: "+getId()+ " / Nombre: "+getNombre()+" / Categoria: "+getCategoria()+" / Precio: $"+getPrecio()+" / Stock: "+getStock();  
				System.out.println("Stock actualizado");
				
			}else {
				respuesta="No se pudo agregar la compra";
			}
			
		}else {
			
			respuesta="Las categorias no coinciden";
			
		}
		
		return respuesta;
		
	}
	//validastock, comprobarcategoria, actualizar stock
	
}
