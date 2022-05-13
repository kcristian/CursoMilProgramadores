package Curso_Java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicios e1=new Ejercicios();
		e1.agregarbotones();
			
	}
	public static class Ejercicios implements ActionListener{
		private JFrame f;
		private JButton b1,b2,b3,b4,b5,b6;
		public Ejercicios() {
			f = new JFrame("Todos los ejercicios");
			b1 = new JButton("Promeddio de notas");
			b2 = new JButton("Mayor de los valores ingresados");
			b3 = new JButton("ejercicio 3");
			b4 = new JButton("ejercicio 4");
			b5 = new JButton("ejercicio 5");
			b6 = new JButton("ejercicio 6");
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
					
		}
		public  void agregarbotones() {
			f.setLayout(new GridLayout(6,1));
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			
			f.pack();
			f.setVisible(true);
			f.setSize(300,200);
			f.setLocationRelativeTo(null);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				int nota1,nota2,nota3;
				float promedio;
				String mensaje;
				
				
				nota1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 1: "));
				nota2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 2: "));
				nota3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 3: "));
				
				promedio= (nota1 + nota2 + nota3)/3;
				mensaje = (promedio>=7) ? "promociona" : "no promociona";				
				int input = JOptionPane.showConfirmDialog(null, "el promedio de las notas es: "+promedio+"\nel alumno: " + mensaje, "situacion", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
				
			}
			if(e.getSource()==b2) {
				int notas[];
				int cantidad_notas=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de notas:"));
				notas=new int[cantidad_notas];
				int nota_mayor=0;
				for(int i=0;i<cantidad_notas;i++) {
					notas[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota"));
				}
				for(int i=0;i<cantidad_notas;i++) {
					if(notas[i]>nota_mayor)
						nota_mayor=notas[i];					
				}
				int input=JOptionPane.showConfirmDialog(null, "el numero mayor es: " + nota_mayor, "numeromayor", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
				
			}
			if(e.getSource()==b3) {
				int input = JOptionPane.showConfirmDialog(null, "ejercicio 3", "boton 3", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
			}
			if(e.getSource()==b4) {
				int input = JOptionPane.showConfirmDialog(null, "ejercicio 4", "boton 4", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
			}
			if(e.getSource()==b5) {
				int input = JOptionPane.showConfirmDialog(null, "ejercicio 5", "boton 5", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
			}
			if(e.getSource()==b6) {
				int input = JOptionPane.showConfirmDialog(null, "ejercicio 6", "boton 6", JOptionPane.DEFAULT_OPTION);
				System.out.println(input);
			}
			
			
			
		}
	
	}
		
		
}
	
	
	


