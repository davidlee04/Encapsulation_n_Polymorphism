package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(900, 600));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);
		window.addMouseListener(this);

		timer = new Timer(1000 / 30, this);
		timer.start();
		polymorphs.add(new BluePolymorph(90, 400));
		polymorphs.add(new RedPolymorph(60, 90));
		polymorphs.add(new RedPolymorph(500, 400));
		polymorphs.add(new BluePolymorph(300, 200));
		polymorphs.add(new BluePolymorph(500, 100));
		polymorphs.add(new MovingPolymorph(60, 0));
		polymorphs.add(new MovingPolymorph(120, 50));
		polymorphs.add(new MousePolymorph(50, 50));
		polymorphs.add(new ImagePolymorph(120, 200, "turtle.png"));
		polymorphs.add(new ImagePolymorph(240, 400, "potato.png"));
		polymorphs.add(new ImagePolymorph(360, 150, "watermelon.png"));
		polymorphs.add(new DialogPolymorph(600, 200));
	}

	public void paintComponent(Graphics g) {
		// draw background

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 900, 600);

		// draw polymorph

		for (Polymorph polymorph : polymorphs) {
			polymorph.draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : polymorphs) {
			polymorph.update();
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		for (Polymorph polymorph : polymorphs) {
			if (polymorph instanceof MousePolymorph) {
				((MousePolymorph) polymorph).update(e.getX(), e.getY());
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		boolean clickedOn = false;
		for (Polymorph polymorph : polymorphs) {
			if (polymorph instanceof DialogPolymorph) {
				x = ((DialogPolymorph) polymorph).getX();
				y = ((DialogPolymorph) polymorph).getY();
			}
			if (e.getX() >= x && e.getX() <= x + 49 && e.getY() >= y && e.getY() <= y + 49) {
				clickedOn = true;
				((DialogPolymorph) polymorph).update(clickedOn);
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
