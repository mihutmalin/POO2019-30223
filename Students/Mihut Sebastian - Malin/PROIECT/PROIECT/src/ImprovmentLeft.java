import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The Class ImprovmentLeft.
 */
public class ImprovmentLeft extends JPanel implements ActionListener{
	
	 /** The l. */
 	private JLabel l;
	 
 	/** The t. */
 	private Timer t;
	
	 /**
 	 * Instantiates a new improvment left.
 	 */
 	ImprovmentLeft(){
	 ImageIcon img = new ImageIcon("D:\\FACULTATE\\POO\\Malin\\PROIECT\\gif\\1.gif");
		 l = new JLabel(img);
		 this.add(l);
		 setBackground(Color.white);
		 t = new Timer(100, this);
		 t.start();
	 }
	 
	 /**
 	 * Action performed.
 	 *
 	 * @param e the e
 	 */
 	public void actionPerformed(ActionEvent e){}
}