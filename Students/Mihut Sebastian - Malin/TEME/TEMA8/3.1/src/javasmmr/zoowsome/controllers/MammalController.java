package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.MammalFrame;

public class MammalController extends AbstractController{

	public MammalController(MammalFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		frame.setCowButtonActionListener(new CowButtonActionListener());
		frame.setTigerButtonActionListener(new TigerButtonActionListener());
	}
	
	private class MonkeyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class CowButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class TigerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
