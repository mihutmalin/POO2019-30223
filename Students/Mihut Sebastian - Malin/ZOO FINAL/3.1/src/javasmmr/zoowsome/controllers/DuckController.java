package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.views.DuckFrame;

public class DuckController extends AbstractController {
	DuckFrame view;
	
	public DuckController(DuckFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		view=frame;
		frame.setSubmitBtnActionListener(new DuckActionListener());
	}
	
	private class DuckActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int para1=Integer.parseInt(view.getNrOfLegsInput());
			int para2=Integer.parseInt(view.getAvgFlightAltitude());
			boolean para3=Boolean.parseBoolean(view.getDangerPercInput());
			double para4=Double.parseDouble(view.getMaintenanceCostInput());
			double para5=Double.parseDouble(view.getDangerPercInput());
			add1(new Duck(view.getNameInput(),para1,para3,para2,para4,para5));
		}
	}
	
}
