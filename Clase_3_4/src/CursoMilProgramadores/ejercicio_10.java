package CursoMilProgramadores;

import javax.swing.JOptionPane;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=Integer.parseInt(JOptionPane.showInputDialog("ingrese la base del rectangulo: "));
		int altura=Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura del rectangulo: "));
		
		int superficie=base*altura;
		System.out.println("la superficie es: "+superficie);
	}

}
