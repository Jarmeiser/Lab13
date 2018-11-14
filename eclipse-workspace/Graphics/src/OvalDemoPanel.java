import java.awt.Graphics;
import java.awt.Color;
public class OvalDemoPanel extends MyPanel {
	public OvalDemoPanel() {
		super();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		int CenterX= 10;
		int CenterY = 10;
		int width = 28;
		int height = 28;
		g.drawOval(CenterX, CenterY, width, height);
		CenterX += 30;
		CenterY += 30;
		g.fillOval(CenterX, CenterY, width, height);
	}
}
