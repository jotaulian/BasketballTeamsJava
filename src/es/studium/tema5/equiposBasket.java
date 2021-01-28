package es.studium.tema5;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class equiposBasket extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	List lista = new List();
	Label ciudad = new Label("");
	
	public equiposBasket() {
		setLayout(new BorderLayout());
		setTitle("Lista");
		
		//Guardamos las provincias en un Array
		String[] equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife","TD Systems Baskonia","Hereda San Pablo Burgos","Valencia Basket","Club Joventut de Badalona","Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran Canaria","Monbus Obradoiro","Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada","Coosur Real Betis","RETAbet Bilbao Basket","Acunsa Gipuzkoa Basket"};
		//Añadimos las provincias del array a la lista mediante un ForEach
		for (String equipo : equipos)
		{
			lista.add(equipo);
		}		
		add("North",lista);
		add("South",ciudad);
		lista.addActionListener(this);
		
		addWindowListener(this);
		setSize(300,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	//Main Method
	public static void main(String[] args)
	{
		new equiposBasket();
	}
	
	//Window Listener Methods
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
		{
			System.exit(0);
		}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	
	//Action Listener Method
	public void actionPerformed(ActionEvent ae)
	{
		if("Real Madrid".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Madrid");
		}else if("Barça".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Barcelona");
		}else if("Iberoestar Tenerife".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Tenerife");
		}else if("TD Systems Baskonia".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Bilbao");
		}else if("Hereda San Pablo Burgos".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Burgos");
		}else if("Valencia Basket".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Valencia");
		}else if("Club Joventut de Badalona".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Badalona");
		}else if("Unicaja".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Málaga");
		}else if("UCAM Murcia".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Murcia");
		}else if("Baxi Manresa".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Manresa");
		}else if("MoraBanc Andorra".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Andorra");
		}else if("Herbalife Gran Canaria".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Canarias");
		}else if("Monbus Obradoir".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Santiago de Compostela");
		}else if("Movistar Estudiantes".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Madrid");
		}else if("Casademont Zaragoza".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Zaragoza");
		}else if("Urbas Fuenlabrada".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Fuenlabrada");
		}else if("Coosur Real Betis".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Sevilla");
		}else if("RETAbet Bilbao Basket".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en Bilbao");
		}else if("Acunsa Gipuzkoa Basket".equals(lista.getSelectedItem())) {
			ciudad.setText("Este equipo tiene sede en San Sebastián");
		}
	}

}