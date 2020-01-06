package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class EmployeeFrame extends ZooFrame {
	private JButton btnCaretaker;
	
	public EmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnCaretaker = new JButton("Caretaker");
		slPanel.putConstraint(SpringLayout.NORTH, btnCaretaker, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCaretaker, 90, SpringLayout.WEST, pan);
		pan.add(btnCaretaker);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setCaretakerButtonActionListener(ActionListener a) {
		btnCaretaker.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {	
	}
}