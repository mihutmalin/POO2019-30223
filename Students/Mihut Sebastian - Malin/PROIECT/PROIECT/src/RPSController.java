import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class RPSController.
 */
public class RPSController extends AbstractController{
	
    /** The frame. */
    RPSView frame;
	
    /**
     * Instantiates a new RPS controller.
     *
     * @param view the view
     */
    public RPSController(RPSView view){
    super(view);
    
   	 frame=view;
   	 view.addPlayAgainListener(new playAgainListener());
   	 view.addRockListener(new RockListener());
   	 view.addPaperListener(new PaperListener());
   	 view.addScissorListener(new ScissorListener());
   	 view.addNewPlayerListener(new NewPlayerActionListener());
   	 
    }
    
    /**
     * The listener interface for receiving playAgain events.
     * The class that is interested in processing a playAgain
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addplayAgainListener<code> method. When
     * the playAgain event occurs, that object's appropriate
     * method is invoked.
     *
     * @see playAgainEvent
     */
    private class playAgainListener implements ActionListener{
	   	 
 	   	/**
 	   	 * Action performed.
 	   	 *
 	   	 * @param e the e
 	   	 */
 	   	public void actionPerformed(ActionEvent e) {
		 		if(frame.model.getIsPressed()==true) {
			 		frame.removeLabel3();
			 		frame.removeLabel4();
			 		frame.repaintFrame();
			 		frame.model.setIsPressed(false);
		 		}
	   	 }
    }
    
    /**
     * The listener interface for receiving rock events.
     * The class that is interested in processing a rock
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addRockListener<code> method. When
     * the rock event occurs, that object's appropriate
     * method is invoked.
     *
     * @see RockEvent
     */
    private class RockListener implements ActionListener{
      	 
 	      /**
 	       * Action performed.
 	       *
 	       * @param e the e
 	       */
 	      public void actionPerformed(ActionEvent e) {
	 			if(frame.model.getIsPressed()==false) {
					frame.addLabelPanel3(frame.addImageLabel("/rsz_player_rock.png"));
					frame.model.setIsPressed(true);
					frame.computerChoiceRock();
					frame.repaintPanel2();

	 		}
			frame.revalidate();
    	}	
	}
    
    /**
     * The listener interface for receiving paper events.
     * The class that is interested in processing a paper
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addPaperListener<code> method. When
     * the paper event occurs, that object's appropriate
     * method is invoked.
     *
     * @see PaperEvent
     */
    private class PaperListener implements ActionListener{
     	 
 	     /**
 	      * Action performed.
 	      *
 	      * @param e the e
 	      */
 	     public void actionPerformed(ActionEvent e) {
	 			if(frame.model.getIsPressed()==false) {
	 				frame.addLabelPanel3(frame.addImageLabel("/rsz_output.png"));
	 				frame.model.setIsPressed(true);
	 				frame.computerChoicePaper();
	 				frame.repaintPanel2();
	 		}
	 			frame.revalidate();
     	 }	
	}
    
    /**
     * The listener interface for receiving scissor events.
     * The class that is interested in processing a scissor
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addScissorListener<code> method. When
     * the scissor event occurs, that object's appropriate
     * method is invoked.
     *
     * @see ScissorEvent
     */
    private class ScissorListener implements ActionListener{
    	 
 	    /**
 	     * Action performed.
 	     *
 	     * @param e the e
 	     */
 	    public void actionPerformed(ActionEvent e) {
	 			if(frame.model.getIsPressed()==false) {
	 				frame.addLabelPanel3(frame.addImageLabel("/triangle.png"));
	 				frame.model.setIsPressed(true);
	 				frame.computerChoiceScissor();
	 				frame.repaintPanel2();
	 		}
	 			frame.revalidate();
    	 }	
	}
    
    /**
     * Exit.
     */
    public void exit() {
		this.frame.dispose();
	}
    
    /**
     * The listener interface for receiving newPlayerAction events.
     * The class that is interested in processing a newPlayerAction
     * event implements this interface, and the object created
     * with that class is registered with a component using the
     * component's <code>addNewPlayerActionListener<code> method. When
     * the newPlayerAction event occurs, that object's appropriate
     * method is invoked.
     *
     * @see NewPlayerActionEvent
     */
    private class NewPlayerActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
	 		new PlayerController(new PlayerView(view.model));
	 		view.model.addWinToList(frame.model.getNrWins());
			view.model.addDefeatsToList(frame.model.getNrDefeats());
			frame.model.setNrWins(0);
			frame.model.setNrDefeats(0);
			frame.model.setIsPressed(false);

	 		exit();
   	 	}
    }
}
