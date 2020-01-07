import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The Class ImprovmentRight.
 */
public class ImprovmentRight extends JPanel implements ActionListener{
	
	 /** The l. */
 	private JLabel l;
	 
 	/** The t. */
 	private Timer t;
	
	 /**
 	 * Instantiates a new improvment right.
 	 */
 	ImprovmentRight(){
	 ImageIcon img = new ImageIcon("D:\\FACULTATE\\POO\\Malin\\PROIECT\\gif\\2.gif");
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