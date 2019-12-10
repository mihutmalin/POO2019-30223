package javasmmr.zoowsome.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.Information;
import javasmmr.zoowsome.services.factories.animals.InsectFactory;
import javasmmr.zoowsome.views.InsectFrame;

public class InsectController extends AbstractController {
	private InsectFactory insect=new InsectFactory();
	public InsectController(InsectFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setSpiderButtonActionListener(new SpiderButtonActionListener());
		frame.setCockroachButtonActionListener(new CockroachButtonActionListener());
		frame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
	}
	
	private class SpiderButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//lista.add(insect.getAnimal("Spider"));
			System.out.println(lista.isEmpty());
		}
	}
	
	private class CockroachButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//lista.add(insect.getAnimal("Cockroach"));
		}
	}
	
	private class ButterflyButtonActionListener extends Information implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lista.add(insect.getAnimal("Butterfly"));
			System.out.println(lista.isEmpty());
		}
	}
}
