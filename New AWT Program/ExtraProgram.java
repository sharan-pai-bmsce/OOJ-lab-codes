
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * <applet code="ExtraProgram" width="1200" height="600"></applet>
 * 
 */
// Lab Program-2
/*
public class ExtraProgram extends Applet implements MouseListener,MouseMotionListener {

		String msg="";
		int x=50;
		int y=50;
	public ExtraProgram(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		msg="(x="+x+",y="+y+")";
		setForeground(Color.RED);
		repaint();
	}
	public void init() {
		setBackground(Color.BLACK);
	}
	public void start() {
		msg="Started";
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		msg="Mouse Clicked "+e.getClickCount()+" times";
		setForeground(Color.ORANGE);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		msg = "Pressed At "+x+" "+y;
		setForeground(Color.BLUE);
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		msg = "Released At "+x+" "+y;
		setForeground(Color.CYAN);
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		x=100;
		y=100;
		msg="Mouse Enterred";
		setForeground(Color.YELLOW);
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		x=100;
		y=100;
		setForeground(Color.GREEN);
		msg="Mouse Exited";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
}*/

//Lab Program-1

public class ExtraProgram extends Frame implements MouseListener,MouseMotionListener{
	String msg = "";
	int x = 0,y = 0;
	public ExtraProgram(){
		addMouseListener(this);
		addMouseMotionListener(this);
		this.setBackground(Color.BLACK);
		addWindowListener(new MyWindow());
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		msg="mouse clicked "+e.getClickCount()+" times";
		setForeground(Color.ORANGE);
		repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		x = getWidth()/2;
		y = getHeight()/2;
		setForeground(Color.YELLOW);
		msg = "mouse entered";
		repaint();
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		x = 100;
		y = 100;
		setForeground(Color.GREEN);
		msg = "mouse exited";
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		msg = "Pressed at "+x+" "+y;
		setForeground(Color.BLUE);
		repaint();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		setForeground(Color.RED);
		msg = "x = "+x+"y = "+y;
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString(msg,x,y);
	}
	public static void main(String[] args) {
		ExtraProgram s = new ExtraProgram();
		s.setSize(300, 300);
		s.setVisible(true);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		msg = "Mouse Released "+x+" "+y;
		setForeground(Color.CYAN);
		repaint();
	}
	
}

class MyWindow extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
		System.exit(0);
	}
}