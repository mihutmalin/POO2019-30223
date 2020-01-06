package javasmmr.zoowsome.views;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javasmmr.zoowsome.Information;

public class ListFrame extends ZooFrame{
	Information info=new Information();
	public ListFrame(String title) {
		
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		JTable animalTable= new JTable();
		DefaultTableModel animalModel= new DefaultTableModel();
		String[] coloane= {"nrOfLegs","name","maintenanceCost","takenCareOf","DISCRIMINANT"};
		animalModel.setColumnIdentifiers(coloane);
		animalTable.setModel(animalModel);
		animalTable.setDefaultEditor(Object.class,null);
		
		Object animalRowData[] = new Object[5];
		for(int i=0;i<info.getLista().size();i++) {
			animalRowData[0]=info.getLista().get(i).getNrOfLegs();
			animalRowData[1]=info.getLista().get(i).getName();
			animalRowData[2]=info.getLista().get(i).getMaintenanceCost();
			animalRowData[3]=info.getLista().get(i).getTakenCareOf();
			animalRowData[4]=info.getLista().get(i).getClass().getName().substring(25);
			animalModel.addRow(animalRowData);
		}
	
		JScrollPane scrollpane = new JScrollPane(animalTable);
		animalTable.setFillsViewportHeight(true);
		panel.add(scrollpane);
		panel.add(animalTable);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true); 
	}
	
	@Override
	public void goBack() {
	}

	@Override
	public void run() {
	}
	
}
