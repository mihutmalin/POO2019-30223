import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The Class PlayerView.
 */
public class PlayerView extends AbstractView {

	/** The panel 1. */
	private JPanel panel1;
	
	/** The panel 2. */
	private JPanel panel2;
	
	/** The panel 3. */
	private JPanel panel3;
	
	/** The panel 4. */
	private JPanel panel4;
	
	/** The text 1. */
	private JLabel text1 = new JLabel("Bienvenido al juego más adictivo!");
	
	/** The text 2. */
	private JLabel text2 = new JLabel("Ingresa un nombre:");
	
	/** The nume 1. */
	private JTextField nume1 = new JTextField(20);
	
	/** The play. */
	private JButton play=new JButton("Play");
	
	/**
	 * Instantiates a new player view.
	 *
	 * @param model the model
	 */
	public PlayerView(RPSModel model) {
		
		super(model);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(2000,2000));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  
		
		panel1 = new JPanel();
		panel1.setBackground(Color.darkGray);
		panel2 = new JPanel();
		panel2.setBackground(Color.darkGray);
		panel3 = new JPanel();
		panel3.setBackground(Color.darkGray);
		panel4 = new JPanel();
		panel4.setBackground(Color.darkGray);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		text1.setFont(new Font("Verdana",2,50));
		text1.setForeground(Color.white);
		panel1.add(text1);
		
		text2.setFont(new Font("Verdana",2,50));
		text2.setForeground(Color.white);
		panel2.add(text2);
		
		getNume1().setFont(new Font("Verdana",1,50));
		getNume1().setPreferredSize(new Dimension(300,100));
		panel3.add(getNume1());
		
		play.setFont(new Font("Verdana",1,50));
		play.setBackground(Color.yellow);
		play.setForeground(Color.DARK_GRAY);
		play.setPreferredSize(new Dimension(250, 150));
		panel4.add(play);
		
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new GridLayout(0,1));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}
	
	/**
	 * Sets the play button action listener.
	 *
	 * @param a the new play button action listener
	 */
	public void setPlayButtonActionListener(ActionListener a) {
			play.addActionListener(a);
	}

	/**
	 * Dispose.
	 */
	public void dispose() {
		this.frame.dispose();
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return getNume1().getText();
	}

	/**
	 * Gets the nume 1.
	 *
	 * @return the nume 1
	 */
	public JTextField getNume1() {
		return nume1;
	}

	/**
	 * Sets the nume 1.
	 *
	 * @param nume1 the new nume 1
	 */
	public void setNume1(JTextField nume1) {
		this.nume1 = nume1;
	}
		
}

