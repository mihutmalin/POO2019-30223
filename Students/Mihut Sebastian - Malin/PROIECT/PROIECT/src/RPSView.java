import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * The Class RPSView.
 */
public class RPSView extends AbstractView{
	
	/** The main panel. */
	private JPanel mainPanel;
	
	/** The panel 1. */
	private JPanel panel1;
	
	/** The panel 2. */
	private JPanel panel2;
	
	/** The panel 3. */
	private JPanel panel3;
	
	/** The panel 4. */
	private JPanel panel4;

/** The jbt paper. */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	private JButton jbtPaper =new JButton();
	
	/** The jbt scissor. */
	private JButton jbtScissor=new JButton();
	
	/** The jbt rock. */
	private JButton jbtRock=new JButton();
	
	/** The pane 1. */
	private ImprovmentLeft pane1;
	
	/** The pane 2. */
	private ImprovmentRight pane2;

/** The jbt new player. */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	private JButton jbtNewPlayer =new JButton("New Player");
	
	/** The nume 1. */
	private JLabel nume1=new JLabel();
	
	/** The nume 2. */
	private JLabel nume2=new JLabel();
	
	/** The nume 3. */
	private JLabel nume3=new JLabel();
	
	/** The scor 1. */
	private JLabel scor1=new JLabel();
	
	/** The scor 2. */
	private JLabel scor2=new JLabel();
	
	/** The jbt play again. */
	private JButton jbtPlayAgain=new JButton("Play Again");

	private PlayerView view;
	@Test
	public void test() {
		assertNotEquals(view.model.sizeListName(), 0);
	}
	
	
/**
 * Instantiates a new RPS view.
 *
 * @param model the model
 */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public RPSView(RPSModel model) {
		
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
	   	pane1= new ImprovmentLeft();
		pane1.setPreferredSize(new Dimension(200, 200));
		panel1.add(pane1);
	   	
		jbtPaper.setPreferredSize(new Dimension(200, 200));
		ImageIcon paper=new ImageIcon(panel1.getClass().getResource("/button-paper.png").getFile());
		jbtPaper.setIcon(paper);
		panel1.add(jbtPaper);
		
		jbtRock.setPreferredSize(new Dimension(200, 200));
		ImageIcon rock=new ImageIcon(panel1.getClass().getResource("/button-rock.png").getFile());
		jbtRock.setIcon(rock);
		panel1.add(jbtRock);
		
		jbtScissor.setPreferredSize(new Dimension(200, 200));
		ImageIcon scissor=new ImageIcon(panel1.getClass().getResource("/button-scissor.png").getFile());
		jbtScissor.setIcon(scissor);
		panel1.add(jbtScissor);
		
		pane2= new ImprovmentRight();
		pane2.setPreferredSize(new Dimension(200, 200));
		panel1.add(pane2);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		SpringLayout sl=new SpringLayout();
		panel2.setLayout(sl);
		
		sl.putConstraint(SpringLayout.NORTH,jbtPlayAgain,90, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,jbtPlayAgain,860, SpringLayout.WEST,panel2);
		jbtPlayAgain.setPreferredSize(new Dimension(200, 100));
		jbtPlayAgain.setBackground(Color.yellow);
		jbtPlayAgain.setFont(new Font("Verdana",1,25));
		panel2.add(jbtPlayAgain);
	
		sl.putConstraint(SpringLayout.NORTH,nume1,20, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume1,20, SpringLayout.WEST,panel2);
		nume1.setFont(new Font("Verdana",1,20));
		nume1.setForeground(Color.YELLOW);
	   	panel2.add(nume1);
	   	
	   	sl.putConstraint(SpringLayout.NORTH,nume2,60, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume2,20, SpringLayout.WEST,panel2);
		nume2.setFont(new Font("Verdana",1,20));
		nume2.setForeground(Color.white);
	   	panel2.add(nume2);
	   	
	   	sl.putConstraint(SpringLayout.NORTH,nume3,100, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume3,20, SpringLayout.WEST,panel2);
		nume3.setFont(new Font("Verdana",1,20));
		nume3.setForeground(Color.white);
	   	panel2.add(nume3);
		
		JLabel wins = new JLabel("WINS: "+ model.getNrWins() + " DEFEATS: " + model.getNrDefeats());
		sl.putConstraint(SpringLayout.NORTH,wins,20, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,wins,200, SpringLayout.WEST,panel2);
		wins.setFont(new Font("Verdana",1,20));
		wins.setForeground(Color.white);
		panel2.add(wins);
		

		sl.putConstraint(SpringLayout.NORTH,jbtNewPlayer,90, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,jbtNewPlayer,1500, SpringLayout.WEST,panel2);
		jbtNewPlayer.setPreferredSize(new Dimension(200, 100));
		jbtNewPlayer.setBackground(Color.yellow);
		jbtNewPlayer.setFont(new Font("Verdana",1,25));
		panel2.add(jbtNewPlayer);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		mainPanel= new JPanel();
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
	 * Adds the play again listener.
	 *
	 * @param action the action
	 */
	public void addPlayAgainListener(ActionListener action)
    {
    	this.jbtPlayAgain.addActionListener(action);
    }
	
	/**
	 * Adds the new player listener.
	 *
	 * @param action the action
	 */
	public void addNewPlayerListener(ActionListener action)
    {
    	this.jbtNewPlayer.addActionListener(action);
    }
	
	/**
	 * Adds the rock listener.
	 *
	 * @param action the action
	 */
	public void addRockListener(ActionListener action)
    {
    	this.jbtRock.addActionListener(action);
    }
	
	/**
	 * Adds the paper listener.
	 *
	 * @param action the action
	 */
	public void addPaperListener(ActionListener action)
    {
    	this.jbtPaper.addActionListener(action);
    }
	
	/**
	 * Adds the scissor listener.
	 *
	 * @param action the action
	 */
	public void addScissorListener(ActionListener action)
    {
    	this.jbtScissor.addActionListener(action);
    }
	
	/**
	 * Adds the label panel 3.
	 *
	 * @param jl the jl
	 */
	public void addLabelPanel3(JLabel jl) {
		panel3.add(jl);
		panel3.revalidate();
	}
	
	/**
	 * Adds the label panel 4.
	 *
	 * @param jl the jl
	 */
	public void addLabelPanel4(JLabel jl) {
		panel4.add(jl);
		panel4.revalidate();
	}
	
	/**
	 * This is the computer choice when you choose rock.
	 */
	public void computerChoiceRock() {
		Random rand=new Random();
		int nr=rand.nextInt(3);
		switch(nr) {
		case 0:
			addLabelPanel3(addImageLabel("/rsz_rock1.jpg"));
			addLabelPanel4(addStringLabel("Draw!"));
			break;
		case 1:
			addLabelPanel3(addImageLabel("/rsz_paper.jpg"));
			addLabelPanel4(addStringLabel("You lost!"));
			this.model.increaseNrDefeats();
			break;
		case 2:
			addLabelPanel3(addImageLabel("/triangle111.png"));
			addLabelPanel4(addStringLabel("You won!"));
			this.model.increaseNrWins();
			break;
		}
	}
	
	/**
	 * Computer choice paper.
	 */
	public void computerChoicePaper() {
		Random rand=new Random();
		int nr=rand.nextInt(3);
		switch(nr) {
		case 0:
			addLabelPanel3(addImageLabel("/rsz_rock1.jpg"));
			addLabelPanel4(addStringLabel("You won!"));
			this.model.increaseNrWins();
			break;
		case 1:
			addLabelPanel3(addImageLabel("/rsz_paper.jpg"));
			addLabelPanel4(addStringLabel("Draw!"));
			break;
		case 2:
			addLabelPanel3(addImageLabel("/triangle111.png"));
			addLabelPanel4(addStringLabel("You lost!"));
			this.model.increaseNrDefeats();
			break;
		}
	}
	
	/**
	 * Computer choice scissor.
	 */
	public void computerChoiceScissor() {
		Random rand=new Random();
		int nr=rand.nextInt(3);
		switch(nr) {
		case 0:
			addLabelPanel3(addImageLabel("/rsz_rock1.jpg"));
			addLabelPanel4(addStringLabel("You lost!"));
			this.model.increaseNrDefeats();
			break;
		case 1:
			addLabelPanel3(addImageLabel("/rsz_paper.jpg"));
			addLabelPanel4(addStringLabel("You won!"));
			this.model.increaseNrWins();
			break;
		case 2:
			addLabelPanel3(addImageLabel("/triangle111.png"));
			addLabelPanel4(addStringLabel("Draw!"));
			break;
		}
	}
	
	/**
	 * Adds the image label.
	 *
	 * @param s the s
	 * @return the j label
	 */
	public JLabel addImageLabel(String s) {
		ImageIcon img=new ImageIcon(getClass().getResource(s).getFile());
		return new JLabel(img);	
	}
	
	/**
	 * Adds the string label.
	 *
	 * @param s the s
	 * @return the j label
	 */
	public JLabel addStringLabel(String s) {
		JLabel jl = new JLabel(s);
		jl.setForeground(Color.white);
		jl.setFont(new Font("Verdana",1,20));
		return jl;
	}

	/**
	 * Removes the label 3.
	 */
	public void removeLabel3() {
		panel3.removeAll();
	}
	
	/**
	 * Removes the label 4.
	 */
	public void removeLabel4() {
		panel4.removeAll();
	}
	
	/**
	 * Repaint frame.
	 */
	public void repaintFrame() {
		frame.repaint();
	}
	
	/**
	 * Repaint panel 2.
	 */
	public void repaintPanel2() {
		panel2.removeAll();
		SpringLayout sl=new SpringLayout();
		panel2.setLayout(sl);
		
		sl.putConstraint(SpringLayout.NORTH,jbtPlayAgain,90, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,jbtPlayAgain,860, SpringLayout.WEST,panel2);
		jbtPlayAgain.setPreferredSize(new Dimension(200, 100));
		jbtPlayAgain.setBackground(Color.yellow);
		jbtPlayAgain.setFont(new Font("Verdana",1,25));
		panel2.add(jbtPlayAgain);
	
		sl.putConstraint(SpringLayout.NORTH,nume1,20, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume1,20, SpringLayout.WEST,panel2);
		nume1.setFont(new Font("Verdana",1,20));
		nume1.setForeground(Color.YELLOW);
	   	panel2.add(nume1);
	   	
	   	sl.putConstraint(SpringLayout.NORTH,nume2,60, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume2,20, SpringLayout.WEST,panel2);
		nume2.setFont(new Font("Verdana",1,20));
		nume2.setForeground(Color.white);
	   	panel2.add(nume2);
	   	
	   	sl.putConstraint(SpringLayout.NORTH,nume3,100, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,nume3,20, SpringLayout.WEST,panel2);
		nume3.setFont(new Font("Verdana",1,20));
		nume3.setForeground(Color.white);
	   	panel2.add(nume3);
		
		JLabel wins = new JLabel("WINS: "+ model.getNrWins() + " DEFEATS: " + model.getNrDefeats());
		sl.putConstraint(SpringLayout.NORTH,wins,20, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,wins,200, SpringLayout.WEST,panel2);
		wins.setFont(new Font("Verdana",1,20));
		wins.setForeground(Color.white);
		panel2.add(wins);
		
		sl.putConstraint(SpringLayout.NORTH,scor1,60, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,scor1,200, SpringLayout.WEST,panel2);
		scor1.setFont(new Font("Verdana",1,20));
		scor1.setForeground(Color.white);
	   	panel2.add(scor1);
	   	
	   	sl.putConstraint(SpringLayout.NORTH,scor2,100, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,scor2,200, SpringLayout.WEST,panel2);
		scor2.setFont(new Font("Verdana",1,20));
		scor2.setForeground(Color.white);
	   	panel2.add(scor2);

		sl.putConstraint(SpringLayout.NORTH,jbtNewPlayer,90, SpringLayout.NORTH,panel2);
        sl.putConstraint(SpringLayout.WEST,jbtNewPlayer,1500, SpringLayout.WEST,panel2);
		jbtNewPlayer.setPreferredSize(new Dimension(200, 100));
		jbtNewPlayer.setBackground(Color.yellow);
		jbtNewPlayer.setFont(new Font("Verdana",1,25));
		panel2.add(jbtNewPlayer);
		panel2.repaint();
	}
	
	/**
	 * Sets the nume 1 text.
	 *
	 * @param s the new nume 1 text
	 */
	public void setNume1Text(String s) {
		this.nume1.setText(s);
	}
	
	/**
	 * Sets the nume 2 text.
	 *
	 * @param s the new nume 2 text
	 */
	public void setNume2Text(String s) {
		this.nume2.setText(s);
	}
	
	/**
	 * Sets the nume 3 text.
	 *
	 * @param s the new nume 3 text
	 */
	public void setNume3Text(String s) {
		this.nume3.setText(s);
	}
	
	
	/**
	 * Sets the scor 1 text.
	 *
	 * @param s the new scor 1 text
	 */
	public void setScor1Text(String s) {
		this.scor1.setText(s);
	}
	
	/**
	 * Sets the scor 2 text.
	 *
	 * @param s the new scor 2 text
	 */
	public void setScor2Text(String s) {
		this.scor2.setText(s);
	}

	/**
	 * Dispose.
	 */
	public void dispose() {
		this.frame.dispose();
		
	}
}
