package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.ButterflyFrame;
import javasmmr.zoowsome.views.CockroachFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.SpiderFrame;

public class InsectController extends AbstractController {
	
	public InsectController(InsectFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setSpiderButtonActionListener(new SpiderButtonActionListener());
		frame.setCockroachButtonActionListener(new CockroachButtonActionListener());
		frame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
	}
	
	private class SpiderButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new SpiderController(new SpiderFrame("Spider"), true);
			
		}
	}
	
	private class CockroachButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new CockroachController(new CockroachFrame("Cockraoch"), true);
		}
	}
	
	private class ButterflyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ButterflyController(new ButterflyFrame("Butterfly"), true);
		}
	}
}
