package Curso_Java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
	
}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		
		LaminaCalculadora milamina=new LaminaCalculadora();
		add(milamina);
	}
}

class LaminaCalculadora extends JPanel{
	
	private class InsertarNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand();
			
			if(principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion=e.getActionCommand();
			System.out.println(operacion);
			
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion=operacion;
			principio=true;
			
		}
		public void calcular(Double x) {
			
			if(ultimaOperacion.equals("+")) {
				resultado+=x;
			}
			else if(ultimaOperacion.equals("-")) {
				resultado-=x;
			}
			else if(ultimaOperacion.equals("*")) {
				resultado*=x;
			}
			
			else if(ultimaOperacion.equals("/")) {
				resultado/=x;
			}
			else if(ultimaOperacion.equals("=")) {
				resultado=x;
			}
			
			pantalla.setText(""+resultado);
		}
		
	}
	
	private JButton pantalla;
	private JPanel milamina2;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
	
	public LaminaCalculadora() {
		
		principio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		milamina2=new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar=new InsertarNumero();
		
		ActionListener orden=new AccionOrden();
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",orden);
		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",orden);
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",orden);
		
		ponerBoton("0",insertar);
		ponerBoton(",",orden);
		ponerBoton("=",orden);
		ponerBoton("+",orden);
		
		add(milamina2,BorderLayout.CENTER);
		ultimaOperacion="";
	}
	
	private void ponerBoton(String rotulo,ActionListener oyente) {
		//al poner el boton tambien ponerlo a la escucha
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
	}
}

