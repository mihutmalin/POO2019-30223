import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * The Class SimpleAudioPlayer.
 */
public class SimpleAudioPlayer  { 
  
    /** The current frame. */
    // to store current position 
    Long currentFrame; 
    
    /** The clip. */
    Clip clip; 
      
    /** The status. */
    // current status of clip 
    String status; 
      
    /** The audio input stream. */
    AudioInputStream audioInputStream; 
    
    /** The file path. */
    static String filePath= "D:\\FACULTATE\\POO\\Malin\\PROIECT\\msuic\\Mexican Hat Dance.wav"; ; 
  
    /**
     * Instantiates a new simple audio player.
     *
     * @throws UnsupportedAudioFileException the unsupported audio file exception
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws LineUnavailableException the line unavailable exception
     */
    // constructor to initialize streams and clip 
    public SimpleAudioPlayer() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
        // create AudioInputStream object 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    }   
}