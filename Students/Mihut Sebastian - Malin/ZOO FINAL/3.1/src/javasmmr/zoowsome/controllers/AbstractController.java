package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AbstractController {
	protected static ArrayList<Animals> lista=new ArrayList<>();
	protected AnimalRepository animalRepository=new AnimalRepository();
	protected ZooFrame frame;
	
	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton)
			frame.setBackButtonActionListener(new BackButtonListener());
	}
	
	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}
	
	public void exit() {
		this.frame.dispose();
	}
	
}