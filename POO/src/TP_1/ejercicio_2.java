package TP_1;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie bbt=new Serie("Big Bang theroy",12,"comedia","WB");
		bbt.mostrarDatos(bbt);
	}

}

class Serie{
	
	private String titulo;
	private int numeroTemporadas;
	private String genero;
	private String creador;
	
	public Serie(String t, int nt, String g, String c){
		
		titulo=t;
		numeroTemporadas=nt;
		genero=g;
		creador=c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void mostrarDatos(Serie s){
		System.out.println("Informacion:\ntitulo:"+s.getTitulo()+" numero de temporadas:"+s.getNumeroTemporadas()+
				" genero:"+s.getGenero()+" creador:"+s.getCreador());
	}
}
