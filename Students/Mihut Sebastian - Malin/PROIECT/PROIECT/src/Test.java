import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * The Class Test.
 */

public class Test {
	
	/** The a. */
	private static SimpleAudioPlayer a;
	
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args){
    	RPSModel model=new RPSModel();
    	new PlayerController(new PlayerView(model));
    	try {
			a = new SimpleAudioPlayer();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
    }
  

}