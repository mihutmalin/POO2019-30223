import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * The Class AbstractView.
 */
public class AbstractView extends JFrame {

	/** The model. */
	protected RPSModel model;
	
	/** The frame. */
	protected JFrame frame;
	
	/**
	 * Instantiates a new abstract view.
	 *
	 * @param model the model
	 */
	public AbstractView(RPSModel model) {
		
		this.model=model;
		
		frame = new JFrame("PIATRA,FOARFECA,HARTIE!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(2000,2000));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setVisible(true);
		frame.pack();
	}
}
