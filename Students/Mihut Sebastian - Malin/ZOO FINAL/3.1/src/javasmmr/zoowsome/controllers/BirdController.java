package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.ChickenFrame;
import javasmmr.zoowsome.views.DuckFrame;
import javasmmr.zoowsome.views.ParrotFrame;

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
			new ParrotController(new ParrotFrame("Parrot"),true);
		}
	}
	
	private class ChickenButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ChickenController(new ChickenFrame("Chicken"),true);
		}
	}
	
	private class DuckButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new DuckController(new DuckFrame("Duck"),true);
		}
	}
}
