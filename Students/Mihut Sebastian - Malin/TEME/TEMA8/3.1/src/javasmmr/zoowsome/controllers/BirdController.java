package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.BirdFrame;

public class BirdController extends AbstractController {
	public BirdController(BirdFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setParrotButtonActionListener(new ParrotButtonActionListener());
		frame.setChickenButtonActionListener(new ChickenButtonActionListener());
		frame.setDuckButtonActionListener(new DuckButtonActionListener());
	}
	
	private class ParrotButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class ChickenButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class DuckButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
