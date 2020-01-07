import static org.junit.Assert.assertFalse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.junit.Test;

/**
 * The Class PlayerController.
 */
public class PlayerController extends AbstractController{
	
	/** The frame. */
	protected PlayerView frame;
	
	/** The nou. */
	private RPSView nou;
	
	/**
	 * Instantiates a new player controller.
	 *
	 * @param view the view
	 */
	public PlayerController(PlayerView view) {
		super(view);
		frame=view;
		view.setPlayButtonActionListener(new RPSActionListener());
	}
	
	/**
	 * Exit.
	 */
	public void exit() {
		this.frame.dispose();
	}
	
	/**
	 * The listener interface for receiving RPSAction events.
	 * The class that is interested in processing a RPSAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addRPSActionListener<code> method. When
	 * the RPSAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see RPSActionEvent
	 */
	private class RPSActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			nou=new RPSView(view.model);
			new RPSController(nou);
			
			view.model.deleteWithCondition();
			view.model.deleteWithConditionWins();
			view.model.deleteWithConditionDefeats();
			
			if(frame.getName().equals("")) {
				view.model.addNameToList("Unknown");
				nou.setNume1Text("Unkonwn");
			}
			else {
				view.model.addNameToList(frame.getName());
				nou.setNume1Text(view.model.getNameFromList());
			}
			
			if(view.model.sizeListName()==2) {
				nou.setNume2Text(view.model.getName0FromList());
				nou.setScor1Text("WINS: "+Integer.toString(view.model.getWin0FromList())+ " DEFEATS: " +Integer.toString(view.model.getDefeats0FromList()));
			}
			if(view.model.sizeListName()==3) {
				nou.setNume2Text(view.model.getName1FromList());
				nou.setScor1Text("WINS: "+Integer.toString(view.model.getWin1FromList())+ " DEFEATS: " +Integer.toString(view.model.getDefeats1FromList()));
				nou.setNume3Text(view.model.getName0FromList());
				nou.setScor2Text("WINS: "+Integer.toString(view.model.getWin0FromList())+ " DEFEATS: " +Integer.toString(view.model.getDefeats0FromList()));
			}
		
			
			nou.repaintPanel2();
			
			exit();
		}
	}
	
	@Test
	public void test() {
		assertFalse(view.model.getIsPressed());
	}
}