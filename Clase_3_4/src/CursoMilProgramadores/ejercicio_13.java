package CursoMilProgramadores;

import javax.swing.JOptionPane;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero natural: "));
		for(int i=-k;i<=k;i++) {
			if(i%2==0) {
				System.out.println("entero par: "+i);
			}
		}
	}

}
