package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
	}
	
	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class SaveAndExitButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				animalRepository.save(lista);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (XMLStreamException e1) {
				e1.printStackTrace();
			}
			
			try {
				animalRepository.load();
			} catch (ParserConfigurationException e1) {
				e1.printStackTrace();
			} catch (SAXException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			exit();
		}
	}
 
}