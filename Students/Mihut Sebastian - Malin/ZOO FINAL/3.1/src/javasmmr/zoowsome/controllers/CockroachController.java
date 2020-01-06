package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.views.CockroachFrame;

public class CockroachController extends AbstractController {
	CockroachFrame view;
	
	public CockroachController(CockroachFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		view=frame;
		frame.setSubmitBtnActionListener(new SpiderActionListener());
	}
	
	private class SpiderActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int para1=Integer.parseInt(view.getNrOfLegsInput());
			boolean para2=Boolean.parseBoolean(view.getCanFlyInput());
			boolean para3=Boolean.parseBoolean(view.getIsDangerousInput());
			double para4=Double.parseDouble(view.getMaintenanceCostInput());
			double para5=Double.parseDouble(view.getDangerPercInput());
			add1(new Cockroach(view.getNameInput(),para1,para2,para3,para4,para5));
		}
	}
	
}
