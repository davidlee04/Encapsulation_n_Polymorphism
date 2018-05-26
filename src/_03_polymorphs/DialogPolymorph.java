package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class DialogPolymorph extends Polymorph {

	DialogPolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
	}

	public void update(boolean clickedOn) {
		if (clickedOn) {
			JOptionPane.showMessageDialog(null, "click click click click click click");
		}
	}

}
