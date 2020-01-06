package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.services.factories.animals.AquaticFactory;
import javasmmr.zoowsome.views.AquaticFrame;

public class AquaticController extends AbstractController{
	public AquaticController(AquaticFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setWhaleButtonActionListener(new WhaleButtonActionListener());
		frame.setFishButtonActionListener(new FishButtonActionListener());
		frame.setSharkButtonActionListener(new SharkButtonActionListener());
	}
	
	private class WhaleButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private class FishButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private class SharkButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}
}
