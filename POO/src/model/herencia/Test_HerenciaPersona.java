package model.herencia;

public class Test_HerenciaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per=new Persona("Amelia","Sanchez",85246,"Tres cerritos 9954",false);
		Estudiante e=new Estudiante("Tomy", "Gimenez", 21345, "San Ignacio 789", true, 16, 2);
		Profesor p=new Profesor("Elena","Gomez",56780,"Parque La Vega 81",false,45000);
		
		per.mostrarDatos();
		e.mostrarDatos();
		p.mostrarDatos();
	}

}
