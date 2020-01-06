package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.views.EmployeeFrame;

public class EmployeeController extends AbstractController {
	public EmployeeController(EmployeeFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCaretakerButtonActionListener(new CaretakerButtonActionListener());
	}
	
	private class CaretakerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}