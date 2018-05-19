package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	BufferedImage i;

	ImagePolymorph(int x, int y, String file) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			i = ImageIO.read(this.getClass().getResourceAsStream(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(i, x, y, 100, 100, Color.LIGHT_GRAY, null);
	}

}
