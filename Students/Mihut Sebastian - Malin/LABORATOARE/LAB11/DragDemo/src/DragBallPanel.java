import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener,MouseMotionListener, ActionListener {
	
	 private static final int BALL_DIAMETER = 40;
	 
	 private int _ballX = 50;
	 private int _ballY = 50; 
	
	 private int _dragFromX = 0; // apasat atât in interiorul
	 private int _dragFromY = 0; // dreptunghiului mingii.
	
	 private Timer t;
	 
	 /** true inseamna ca mouse a fost apasat in minge si înca in panou.*/
	 private boolean _canDrag = false;
	
	 public DragBallPanel() {
	 setPreferredSize(new Dimension(300, 300));
	 setBackground(Color.blue);
	 setForeground(Color.yellow);
	 
	 this.addMouseListener(this);
	 this.addMouseMotionListener(this);
	 }
	
	 /** Mingea este desenata la ultimele coordinate înregistrate de
	ascultator */
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g); // Required for background.
		 g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		 
		 g.drawString(Integer.toString(this._ballX),5,15);
		 g.drawString(Integer.toString(this._ballY),30,15);
		
	 }
	
	 /** Seteaza _canDrag daca clic este în minge (sau în dreptunghiul care
	o margineste, ceea ce este destul de bun pentru acest program).
	 Pastrati deplasamentul (dragFromX si Y) in minge ca sa-l folositi
	ca punct relativ de afisare în timpul tâtârii.
	 */
	 public void mousePressed(MouseEvent e) {
	 int x = e.getX(); 
	 int y = e.getY(); 
	
	 if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
	 _canDrag = true;
	 
	 _dragFromX = x - _ballX; 
	 _dragFromY = y - _ballY;
	 } else {
	 _canDrag = false;
	 }	 
	 }
	
	 /** Seteaza pozitia x,y a mouse si redeseneaza. */
	 public void mouseDragged(MouseEvent e) {
	 if (_canDrag) { // True doar la apasare in interiorul mingii.
	 //--- Pozitia mingii din mouse si deplasament click original
	 _ballX = e.getX() - _dragFromX;
	 _ballY = e.getY() - _dragFromY;
	
	 //--- Nu muta mingea in afara marginilor ecranului
	 _ballX = Math.max(_ballX, 0);
	 _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
	
	 //--- Nu muta mingea peste marginile de sus sau jos
	 _ballY = Math.max(_ballY, 0);
	 _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);
	
	 this.repaint();
	 }
	 }
	 
	 /** Dezactiveaza târârea daca mouse iese din panou. */
	 public void mouseExited(MouseEvent e) {
	 _canDrag = false;
	 }

	 public void mouseMoved (MouseEvent e) {}
	 public void mouseEntered (MouseEvent e) {}
	 public void mouseClicked (MouseEvent e) {
		 Random rand= new Random();
		 t=new Timer(100,this);
		 t.start();
		 try {
			    Thread.sleep(700);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
		 
		 _ballX=rand.nextInt(300-BALL_DIAMETER);
		 _ballY=rand.nextInt(300-BALL_DIAMETER);
		 this.repaint();
	 }
	 public void mouseReleased(MouseEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}