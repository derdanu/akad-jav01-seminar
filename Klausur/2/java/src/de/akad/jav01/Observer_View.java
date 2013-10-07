package de.akad.jav01;

import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Observer_View extends JFrame implements Observer, WindowListener{
	
	private GridLayout gridLayout = new GridLayout();
	
	private JLabel lbl_alterName = new JLabel("alter Name");
	private JTextField txt_alterName = new JTextField();
	private JLabel lbl_neuerName = new JLabel("neuer Name");
	private JTextField txt_neuerName = new JTextField();
	
	public Observer_View() {
		view_Aufbau();
	}
	
	private void view_Aufbau() {
		
		gridLayout.setRows(2);
		gridLayout.setColumns(2);
		this.setLayout(gridLayout);
		this.setTitle("Personenregister");
		this.add(lbl_alterName);
		this.add(txt_alterName);
		this.add(lbl_neuerName);
		this.add(txt_neuerName);
		this.addWindowListener(this);
		
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.txt_alterName.setText(((String) arg));

		this.txt_neuerName.setText(((Person) o).getName());
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		this.dispose();
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
