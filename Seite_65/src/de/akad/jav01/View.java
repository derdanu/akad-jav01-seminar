package de.akad.jav01;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame implements ActionListener {

	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private JLabel l1 = new JLabel("Titel:");
	private JLabel l2 = new JLabel("Verfügbar:");	
	private JTextField tf1 = new JTextField();
	private JTextField tf2 = new JTextField();	
	private JButton b1 = new JButton("Suchen");
	private JButton b2 = new JButton("Loeschen");
	private JButton b3 = new JButton("Ausleihen");
	
	public View() {
		
	
		setTitle("Bibliothek");
		setLayout(gbl);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.insets = new Insets(2,2,2,2);  
		
		tf2.setEditable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b3.setEnabled(false);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbl.setConstraints(l1, gbc);
		add(l1);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbl.setConstraints(tf1, gbc);
		add(tf1);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(l2, gbc);
		add(l2);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbl.setConstraints(tf2, gbc);
		add(tf2);
		

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbl.setConstraints(b2, gbc);
		add(b2);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbl.setConstraints(b1, gbc);
		add(b1);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbl.setConstraints(b3, gbc);
		add(b3);		
		
//		add(l2);
//		add(new JLabel());
//		add(tf2);
//		add(b2);
//		add(b1);
//		add(b3);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand() == "Suchen") {
			String name = tf1.getText();
			if (!name.isEmpty()) {
				Bibliothek bib = Bibliothek.getInstance();
				try {
					
					if (bib.istBuchAusgeliehen(name) == 0) {
						tf2.setText("ja");
						b3.setEnabled(true);

					} else {
						tf2.setText("nein");
					}
				} catch (Exception e1) {
					tf2.setText(e1.getMessage());
				}
			} else {
				tf2.setText("Bitte Titel eingeben");
			}
			
		} else if (e.getActionCommand() == "Loeschen") {
			tf1.setText("");
			tf2.setText("");
			b3.setEnabled(false);
		} else if (e.getActionCommand() == "Ausleihen") {
			b3.setEnabled(false);
			String name = tf1.getText();
			Bibliothek bib = Bibliothek.getInstance();
			try {
				
				bib.buchAusleihen(name);
				tf2.setText("nein");
				
			} catch (Exception e1) {
				tf2.setText(e1.getMessage());
			}
		}
		
	}
	
}
