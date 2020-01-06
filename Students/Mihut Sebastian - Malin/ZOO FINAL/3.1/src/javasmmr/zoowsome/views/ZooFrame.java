package javasmmr.zoowsome.views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javasmmr.zoowsome.views.utilities.FrameStack;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;

public abstract class ZooFrame extends JFrame implements ZooFrame_I,Runnable {
	protected JPanel contentPanel;
	public static final int HEIGHT = 500;
	public static final int WIDTH = 700;
	
	private JPanel panelBack=new JPanel();
	private Timer t=new Timer();
	private JButton backButton = new JButton("Back");
	private JLabel jl=new JLabel();
	
	private String[] gmt = {"GMT+2","GMT","GMT+1","GMT+3"};
	private JComboBox combo=new JComboBox(gmt);
	
	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(this.WIDTH,this.HEIGHT);//FRAMES.WIDTH, FRAMES.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		t.schedule(task,0L,1000L);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.red);
		add(contentPanel, BorderLayout.CENTER);
	}
	
	TimerTask task=new TimerTask() {
		public void run() {
			Date data = new Date();
			if((String)combo.getSelectedItem()=="GMT+2")
				jl.setText(data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds());
			else if((String)combo.getSelectedItem()=="GMT+1")
				jl.setText(data.getHours()-1 + ":" + data.getMinutes() + ":" + data.getSeconds());
			else if((String)combo.getSelectedItem()=="GMT")
				jl.setText(data.getHours()-2 + ":" + data.getMinutes() + ":" + data.getSeconds());
			else if((String)combo.getSelectedItem()=="GMT+3")
				jl.setText(data.getHours()+1 + ":" + data.getMinutes() + ":" + data.getSeconds());
		}
	};
	
	public void setBackButtonActionListener(ActionListener a) {
		panelBack.setLayout(new GridLayout(0,5));
		JLabel jl1=new JLabel(" ");
		JLabel jl2=new JLabel(" ");
		panelBack.add(backButton);
		panelBack.add(jl1);
		panelBack.add(jl2);
		panelBack.add(combo);
		this.add(panelBack, BorderLayout.NORTH);
		panelBack.add(jl);
		backButton.addActionListener(a);
	}
}