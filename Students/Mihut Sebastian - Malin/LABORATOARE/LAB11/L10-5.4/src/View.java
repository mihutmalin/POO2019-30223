import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private Model model;
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JButton schimb;
	private JComboBox from;
	private JComboBox to; 
	private JTextField in; 
	private JTextField din;
	
	View(Model model){
		
		this.model=model;
		
		frame= new JFrame("CONVERTOR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000,1000));
		
		panel1= new JPanel();
		panel1.setBackground(new Color(0, 76, 153));
		panel2= new JPanel();
		panel2.setBackground(new Color(0, 76, 153));
		panel3= new JPanel();
		panel3.setBackground(new Color(0, 76, 153));
		panel4= new JPanel();
		panel4.setBackground(new Color(0, 76, 153));
		
		from = new JComboBox(model.getStringMonede());
		from.setForeground(new Color(0, 0, 102));
		from.setBackground(new Color(102, 178, 255));
		from.setPreferredSize(new Dimension(200,200));
		from.setFont(new Font("Verdana",1,20));
		from.setSelectedIndex(2);
		panel1.add(from);
	
		schimb=new JButton("SCHIMBA");
		schimb.setForeground(new Color(0, 0, 102));
		schimb.setBackground(new Color(255, 255, 153));
		schimb.setPreferredSize(new Dimension(200, 200));
		schimb.setFont(new Font("Verdana",1,20));
		panel1.add(schimb);
		
		to = new JComboBox(model.getStringMonede());
		to.setBackground(new Color(102, 178, 255));
		to.setForeground(new Color(0, 0, 102));
		to.setPreferredSize(new Dimension(200,200));
		to.setFont(new Font("Verdana",1,20));
		to.setSelectedIndex(2);
		panel1.add(to);
		
		din = new JTextField(10); 
		din.setFont(new Font("Verdana",1,20));
		din.setPreferredSize(new Dimension(100,50));
		panel2.add(din);
		
		JTextField egal =new JTextField("      =      ");
		egal.setForeground(new Color(0, 0, 102));
		egal.setFont(new Font("Verdana",1,20));
		egal.setPreferredSize(new Dimension(100,50));
		panel3.add(egal);
		
		in=new JTextField();
		in.setFont(new Font("Verdana",1,20));
		in.setPreferredSize(new Dimension(700,50));
		panel4.add(in);
		
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new GridLayout(0,1));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
	}

	public void addSchimbListener(ActionListener action) {
    	this.schimb.addActionListener(action);
    }
	
	public String continutFrom() {
		return (String) this.from.getSelectedItem();
	}
	
	public String continutTo() {
		return (String) this.to.getSelectedItem();
	}
	
	public String getUserInput() { 
		 return din.getText();
	} 
	
	public void putIn(String s) {
		panel4.removeAll();
		in.setText(s);
		panel4.add(in);
		panel4.repaint();
	}
}
