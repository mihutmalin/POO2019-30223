package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AquaticFrame extends ZooFrame{
	private JButton btnWhale;
	private JButton btnShark;
	private JButton btnFish;
	
	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnWhale = new JButton("Whale");
		slPanel.putConstraint(SpringLayout.NORTH, btnWhale, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnWhale, 90, SpringLayout.WEST, pan);
		pan.add(btnWhale);
		
		btnShark = new JButton("Shark");
		slPanel.putConstraint(SpringLayout.NORTH, btnShark, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnShark, 90, SpringLayout.WEST, pan);
		pan.add(btnShark);
		
		btnFish = new JButton("Fish");
		slPanel.putConstraint(SpringLayout.NORTH,btnFish, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnFish, 90, SpringLayout.WEST, pan);
		pan.add(btnFish);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setWhaleButtonActionListener(ActionListener a) {
		btnWhale.addActionListener(a);
	}
	
	public void setSharkButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}
	
	public void setFishButtonActionListener(ActionListener a) {
		btnFish.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}
}
