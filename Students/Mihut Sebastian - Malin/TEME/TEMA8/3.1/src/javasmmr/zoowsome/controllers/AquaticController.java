package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AquaticFrame;

public class AquaticController extends AbstractController{
	public AquaticController(AquaticFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setWhaleButtonActionListener(new WhaleButtonActionListener());
		frame.setFishButtonActionListener(new FishButtonActionListener());
		frame.setSharkButtonActionListener(new SharkButtonActionListener());
	}
	
	private class WhaleButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class FishButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class SharkButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
