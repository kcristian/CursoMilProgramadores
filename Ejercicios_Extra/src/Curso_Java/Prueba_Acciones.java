package Curso_Java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Prueba_Acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco=new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600,350,800,300);
		PanelAccion lamina=new PanelAccion();
		add(lamina);
		
	}
}

class PanelAccion extends JPanel{
	public PanelAccion() {
		
		AccionColor accionamarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/j_1.gif"),Color.yellow);
		AccionColor accionazul=new AccionColor("Azul", new ImageIcon("src/graficos/s_1.gif"),Color.blue);
		AccionColor accionrosa=new AccionColor("Rosa", new ImageIcon("src/graficos/m_1.gif"),Color.pink);
		
		/*JButton botonamarillo=new JButton(accionamarillo);
		add(botonamarillo);*/
		
		add(new JButton(accionamarillo));
		add(new JButton(accionazul));
		add(new JButton(accionrosa));
		
		/*JButton botonamarillo = new JButton("Amarillo");
		JButton botonazul = new JButton("Azul");
		JButton botonrojo = new JButton("Rojo");
		
		add(botonamarillo);
		add(botonazul);
		add(botonrojo);*/
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rosa");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionamarillo);
		mapaAccion.put("fondo_azul", accionazul);
		mapaAccion.put("fondo_rosa", accionrosa);
		
	}
	
	
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON,icono);
			putValue(Action.SHORT_DESCRIPTION, "poner la lamina de color "+nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: "+getValue(Action.NAME)+" Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
	
}



