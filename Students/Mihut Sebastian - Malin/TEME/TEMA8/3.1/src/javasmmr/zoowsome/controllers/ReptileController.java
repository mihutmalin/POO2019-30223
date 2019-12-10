package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.ReptileFrame;


public class ReptileController extends AbstractController {

	public ReptileController(ReptileFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setTurtleButtonActionListener(new TurtleButtonActionListener());
		frame.setChameleonButtonActionListener(new ChameleonButtonActionListener());
		frame.setSnakeButtonActionListener(new SnakeButtonActionListener());
	}
	
	private class TurtleButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class ChameleonButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class SnakeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
