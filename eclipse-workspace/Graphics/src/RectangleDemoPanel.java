import java.awt.Graphics;
import java.awt.Color;
public class RectangleDemoPanel extends MyPanel {
	public RectangleDemoPanel() {
		super();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		int startX= 10;
		int startY = 10;
		int width = 28;
		int height = 28;
		g.drawRect(startX, startY, width, height);
		startX += 30;
		startY += 30;
		g.fillRect(startX, startY, width, height);
	}
}


