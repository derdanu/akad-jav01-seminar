package de.akad.jav01;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame implements Observer {

	private GridLayout gl = new GridLayout();
	private JLabel l1 = new JLabel("Artikel");
	private JLabel l2 = new JLabel("Bestand");
	private JLabel l3 = new JLabel("Mindestbestand");
	private JLabel l4 = new JLabel("Aktion");
	private JTextField tf1 = new JTextField();
	private JTextField tf2 = new JTextField();
	private JTextField tf3 = new JTextField();
	private JTextField tf4 = new JTextField();
	
	public View() {
		
		gl.setRows(4);
		gl.setColumns(2);
		this.setLayout(gl);
		this.setTitle("Mindestbestand");
		
		tf1.setEditable(false);
		tf2.setEditable(false);
		tf3.setEditable(false);
		tf4.setEditable(false);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(tf4);
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Artikel a = (Artikel) arg;
		this.tf1.setText(a.getBezeichnung());
		this.tf2.setText(Integer.toString(a.getBestand()));
		this.tf3.setText(Integer.toString(a.getMindestbestand()));
		this.tf4.setText(a.getStatus());
	}

	
	
	
}
