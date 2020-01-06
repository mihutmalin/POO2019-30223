package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ReptileFrame extends ZooFrame {
	private JButton btnTurtle;
	private JButton btnSnake;
	private JButton btnChameleon;
	
	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnTurtle = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, btnTurtle, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTurtle, 90, SpringLayout.WEST, pan);
		pan.add(btnTurtle);
		
		btnSnake = new JButton("Sanke");
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 90, SpringLayout.WEST, pan);
		pan.add(btnSnake);
		
		btnChameleon = new JButton("Chameleon");
		slPanel.putConstraint(SpringLayout.NORTH, btnChameleon, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnChameleon, 90, SpringLayout.WEST, pan);
		pan.add(btnChameleon);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setTurtleButtonActionListener(ActionListener a) {
		btnTurtle.addActionListener(a);
	}
	
	public void setSnakeButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}
	
	public void setChameleonButtonActionListener(ActionListener a) {
		btnChameleon.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {
	}
}