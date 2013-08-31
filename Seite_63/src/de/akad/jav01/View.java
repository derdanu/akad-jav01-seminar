package de.akad.jav01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class View extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private GridLayout gl = new GridLayout();
	private JLabel l1 = new JLabel("Speisekarte");
	private JLabel l2 = new JLabel("Wochentag");
	private JLabel l3 = new JLabel("Speise");
	private JTextField tf = new JTextField();
	private JComboBox cb = new JComboBox();
	private JButton b1 = new JButton("Welche Speise");
	
	public View() {
		
		gl.setRows(4);
		gl.setColumns(2);
		this.setLayout(gl);
		this.setTitle("Speiseplan");
		
		b1.addActionListener(this);
		cb.addItem(Speisekarte.MONTAG);
		cb.addItem(Speisekarte.DIENSTAG);
		cb.addItem(Speisekarte.MITTWOCH);
		cb.addItem(Speisekarte.DONNERSTAG);
		cb.addItem(Speisekarte.FREITAG);

		tf.setEditable(false);
		
		add(l1);
		add(new JLabel(""));
		add(l2);
		add(cb);
		add(l3);
		add(tf);
		add(new JLabel(""));
		add(b1);
		
	}

	public void actionPerformed(ActionEvent e) {
		Speisekarte karte = (Speisekarte) this.cb.getSelectedItem();
		tf.setText(karte.gibGericht());
	}
	
}
