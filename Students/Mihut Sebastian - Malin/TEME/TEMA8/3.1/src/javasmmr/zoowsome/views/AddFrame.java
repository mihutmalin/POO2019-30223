package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame {
	private JButton btnAquatic;
	private JButton btnMammal;
	private JButton btnInsect;
	private JButton btnReptile;
	private JButton btnBird;
	
	public AddFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnAquatic = new JButton("Aquatics");
		slPanel.putConstraint(SpringLayout.NORTH, btnAquatic, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAquatic, 90, SpringLayout.WEST, pan);
		pan.add(btnAquatic);
		
		btnMammal = new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, btnMammal, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnMammal, 90, SpringLayout.WEST, pan);
		pan.add(btnMammal);
		
		btnInsect = new JButton("Insects");
		slPanel.putConstraint(SpringLayout.NORTH, btnInsect, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnInsect, 90, SpringLayout.WEST, pan);
		pan.add(btnInsect);
		
		btnReptile = new JButton("Reptiles");
		slPanel.putConstraint(SpringLayout.NORTH, btnReptile, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnReptile, 90, SpringLayout.WEST, pan);
		pan.add(btnReptile);
		
		btnBird = new JButton("Birds");
		slPanel.putConstraint(SpringLayout.NORTH, btnBird, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnBird, 90, SpringLayout.WEST, pan);
		pan.add(btnBird);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
	
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}
}