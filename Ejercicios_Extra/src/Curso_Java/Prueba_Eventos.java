package Curso_Java;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prueba_Eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones mimarco=new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LaminaBotones milamina=new LaminaBotones();
		add(milamina);
		
	}
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRosa=new JButton("Rosa");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRosa);
		
		//tres fuentes(botones) y 1 oyente(lamina)
		
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRosa.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//getsource captura el origen de evento
		Object botonpulsado=e.getSource();
		
		if(botonpulsado==botonAzul) {
		setBackground(Color.blue);
		}else if(botonpulsado==botonAmarillo) {
		setBackground(Color.yellow);
		}
		else {
		setBackground(Color.pink);
		}
		
	}
}
