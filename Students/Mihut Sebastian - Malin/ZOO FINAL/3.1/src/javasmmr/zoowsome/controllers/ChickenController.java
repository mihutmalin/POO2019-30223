package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.models.animals.Chicken;
import javasmmr.zoowsome.views.ChickenFrame;

public class ChickenController extends AbstractController {
	ChickenFrame view;
	
	public ChickenController(ChickenFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		view=frame;
		frame.setSubmitBtnActionListener(new ChickenActionListener());
	}
	
	private class ChickenActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int para1=Integer.parseInt(view.getNrOfLegsInput());
			int para2=Integer.parseInt(view.getAvgFlightAltitude());
			boolean para3=Boolean.parseBoolean(view.getDangerPercInput());
			double para4=Double.parseDouble(view.getMaintenanceCostInput());
			double para5=Double.parseDouble(view.getDangerPercInput());
			add1(new Chicken(view.getNameInput(),para1,para3,para2,para4,para5));
		}
	}
	
}
