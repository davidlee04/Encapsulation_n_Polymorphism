package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePolymorph extends Polymorph{
	int mouseX = 0;
	int mouseY = 0;

	MousePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
	
	public void update(int mouseX, int mouseY) {
		x = mouseX;
		y = mouseY;
	}

}
