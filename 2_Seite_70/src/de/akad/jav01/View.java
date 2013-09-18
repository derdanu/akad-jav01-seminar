package de.akad.jav01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame implements ActionListener {

	private GridLayout gl = new GridLayout();
	private JLabel l1 = new JLabel("Alter Name");
	private JLabel l2 = new JLabel("Neuer Name");
	private JTextField tf1 = new JTextField();
	private JTextField tf2 = new JTextField();
	private JButton b = new JButton("aendern");
	
	public View() {
		
		gl.setColumns(2);
		gl.setRows(3);

		b.addActionListener(this);
		
		setLayout(gl);
		setTitle("Personenregister");
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(new JLabel());
		add(b);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Personalbestand pb = Personalbestand.getInstance();
		try {
			Person p = pb.getPersion(tf1.getText());
			p.setName(tf2.getText());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
