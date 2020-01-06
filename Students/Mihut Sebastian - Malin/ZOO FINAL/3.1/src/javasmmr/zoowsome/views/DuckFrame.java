package javasmmr.zoowsome.views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DuckFrame extends ZooFrame {

    private static JTextField name;
    private static JTextField nrOfLegs;
    private static JTextField migrates;
    private static JTextField avgFlightAltitude;
    private static JTextField maintenanceCost;
    private static JTextField dangerPerc;
    private JButton submitBtn;

    public DuckFrame(String title) {
    	
        super(title);

        contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

        JLabel jl1= new JLabel("Name : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl1, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl1, 150, SpringLayout.WEST, pan);
        name = new JTextField(10);
        slPanel.putConstraint(SpringLayout.NORTH, name, 40, SpringLayout.NORTH, pan);
      	slPanel.putConstraint(SpringLayout.WEST, name, 250, SpringLayout.WEST, pan);
        pan.add(name);
        pan.add(jl1);

        JLabel jl2=new JLabel("Number of legs : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl2, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl2, 150, SpringLayout.WEST, pan);
        nrOfLegs = new JTextField(5);
        slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 80, SpringLayout.NORTH, pan);
      	slPanel.putConstraint(SpringLayout.WEST, nrOfLegs, 250, SpringLayout.WEST, pan);
        pan.add(nrOfLegs);
        pan.add(jl2);

        
        JLabel jl3=new JLabel("Migrates : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl3, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl3, 150, SpringLayout.WEST, pan);
		migrates = new JTextField(5);
		slPanel.putConstraint(SpringLayout.NORTH, migrates, 120, SpringLayout.NORTH, pan);
      	slPanel.putConstraint(SpringLayout.WEST, migrates, 250, SpringLayout.WEST, pan);
        pan.add(migrates);
        pan.add(jl3);

        JLabel jl4=new JLabel("AvgFlightAltitude : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl4, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl4, 150, SpringLayout.WEST, pan);
		avgFlightAltitude = new JTextField(5);
		slPanel.putConstraint(SpringLayout.NORTH, avgFlightAltitude, 160, SpringLayout.NORTH, pan);
      	slPanel.putConstraint(SpringLayout.WEST, avgFlightAltitude, 250, SpringLayout.WEST, pan);
        pan.add(avgFlightAltitude);
        pan.add(jl4);
        
        JLabel jl5=new JLabel("MaintainceCost : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl5, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl5, 150, SpringLayout.WEST, pan);
		maintenanceCost = new JTextField(5);
		slPanel.putConstraint(SpringLayout.NORTH, maintenanceCost,200, SpringLayout.NORTH, pan);
      	slPanel.putConstraint(SpringLayout.WEST, maintenanceCost, 250, SpringLayout.WEST, pan);
        pan.add(maintenanceCost);
        pan.add(jl5);
        
        JLabel jl6=new JLabel("DangerPerc : ");
        slPanel.putConstraint(SpringLayout.NORTH, jl6, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jl6, 150, SpringLayout.WEST, pan);
		dangerPerc= new JTextField(5);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPerc, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dangerPerc, 250, SpringLayout.WEST, pan);
        pan.add(dangerPerc);
        pan.add(jl6);
        
        submitBtn = new JButton("ADD");
        slPanel.putConstraint(SpringLayout.NORTH, submitBtn, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, submitBtn, 200, SpringLayout.WEST, pan);
        pan.add(submitBtn);
        
		setVisible(true); 
    }

    public String getNameInput() {
        return name.getText();
    }

    public String getNrOfLegsInput() {
        return nrOfLegs.getText();
    }

    public String getMigratesInput() {
        return migrates.getText();
    }

    public String getAvgFlightAltitude() {
        return avgFlightAltitude.getText();
    }
    
    public String getMaintenanceCostInput() {
        return maintenanceCost.getText();
    }
    
    public String getDangerPercInput() {
        return dangerPerc.getText();
    }

    public void setSubmitBtnActionListener(ActionListener submitBtnActionListener) {
        submitBtn.addActionListener(submitBtnActionListener);
    }

	@Override
	public void goBack() {
	}

	@Override
	public void run() {

	}
}
