package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class BirdFrame extends ZooFrame{
	private JButton btnParrot;
	private JButton btnDuck;
	private JButton btnChicken;
	
	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnParrot = new JButton("Parrot");
		slPanel.putConstraint(SpringLayout.NORTH, btnParrot, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnParrot, 90, SpringLayout.WEST, pan);
		pan.add(btnParrot);
		
		btnDuck = new JButton("Duck");
		slPanel.putConstraint(SpringLayout.NORTH, btnDuck, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnDuck, 90, SpringLayout.WEST, pan);
		pan.add(btnDuck);
		
		btnChicken = new JButton("Chicken");
		slPanel.putConstraint(SpringLayout.NORTH,btnChicken, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnChicken, 90, SpringLayout.WEST, pan);
		pan.add(btnChicken);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setParrotButtonActionListener(ActionListener a) {
		btnParrot.addActionListener(a);
	}
	
	public void setDuckButtonActionListener(ActionListener a) {
		btnDuck.addActionListener(a);
	}
	
	public void setChickenButtonActionListener(ActionListener a) {
		btnChicken.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {
	}
}
