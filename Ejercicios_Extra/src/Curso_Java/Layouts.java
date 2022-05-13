package Curso_Java;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout marco=new Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		
		setTitle("Preuba Acciones");
		setBounds(600,350,600,300);
		Panel_Layout lamina=new Panel_Layout();
		//FlowLayout disposicion=new FlowLayout(FlowLayout.CENTER); 
		//lamina.setLayout(disposicion);
		lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(lamina);
		//setLocationRelativeTo(null);
		
		
	}
}

class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
		add(new JButton("Rosa"));
	}
}
