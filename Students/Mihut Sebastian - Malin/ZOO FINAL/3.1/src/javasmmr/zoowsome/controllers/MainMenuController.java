package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {
	
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
	}
	
	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class ListButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ListController(new ListFrame("List"), true);
		}
	}
	
	private class SaveAndExitButtonActionListener implements ActionListener {
		
		Information i=new Information();
		@Override
		public void actionPerformed(ActionEvent e) {	
			/*try {
				i.setLista(i.getAnimalRepository().load());
			} catch (ParserConfigurationException | SAXException | IOException e1) {
		
				e1.printStackTrace();
			}*/
			i.saveInXML(i.getLista());
			exit();
		}
	}

}