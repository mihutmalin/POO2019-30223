package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MammalFrame extends ZooFrame {
	private JButton btnMonkey;
	private JButton btnTiger;
	private JButton btnCow;
	
	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnMonkey = new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, btnMonkey, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnMonkey, 90, SpringLayout.WEST, pan);
		pan.add(btnMonkey);
		
		btnTiger = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, btnTiger, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTiger, 90, SpringLayout.WEST, pan);
		pan.add(btnTiger);
		
		btnCow = new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH,btnCow, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCow, 90, SpringLayout.WEST, pan);
		pan.add(btnCow);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setMonkeyButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
	
	public void setCowButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {	
	}
}
