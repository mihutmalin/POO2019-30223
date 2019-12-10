package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ListFrame extends ZooFrame{
	
	public ListFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		JLabel jl=new JLabel();
		//String value ="";
		//for (int j = 0; j <= lista.length; j++) {
		//                value += myArray[j];}
		//labelWord.setText( value );
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
	
	@Override
	public void goBack() {
	}
}
