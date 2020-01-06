package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame {
	private JButton btnAnimal;
	private JButton btnEmployee;
	
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
		
		btnAnimal = new JButton("Animals");
		slPanel.putConstraint(SpringLayout.NORTH, btnAnimal, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAnimal, 90, SpringLayout.WEST, pan);
		pan.add(btnAnimal);
		
		btnEmployee = new JButton("Employee");
		slPanel.putConstraint(SpringLayout.NORTH, btnEmployee, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnEmployee, 90, SpringLayout.WEST, pan);
		pan.add(btnEmployee);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
		
	public void setAnimalButtonActionListener(ActionListener a) {
		btnAnimal.addActionListener(a);
	}
	
	public void setEmployeeButtonActionListener(ActionListener a) {
		btnEmployee.addActionListener(a);
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {
	}
}