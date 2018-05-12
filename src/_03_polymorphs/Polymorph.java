package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	int x;
	int y;
	int width = 50;
	int height = 50;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {
		
	}

	public abstract void draw(Graphics g);

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}

	void setX(int i) {
		x = i;
	}

	void setY(int i) {
		y = i;
	}
	
	void setWidth(int i) {
		width = i;
	}
	
	void setHeight(int i) {
		height = i;
	}
}
