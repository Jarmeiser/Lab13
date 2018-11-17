
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        setTitle(title);

        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.GRAY, true);
        
        // Ears:
        RightTriangle ear1 = new RightTriangle(new Point(250, 60), 50, 150, Color.GRAY, true);
        RightTriangle ear2 = new RightTriangle(new Point(550, 60), -50, 150, Color.GRAY, true);
        RightTriangle innerear1 = new RightTriangle(new Point(254, 90), 22, 90, Color.PINK, true);
        RightTriangle innerear2 = new RightTriangle(new Point(547, 90), -22, 90, Color.PINK, true);
        // Eyes:
        Oval eye1 = new Oval(new Point(300,210), 50, 80, Color.WHITE, true);
        Oval eye2 = new Oval(new Point(500,210), 50, 80, Color.WHITE, true);
        Oval innereye1 = new Oval(new Point(300,210), 30, 60, Color.BLACK, true);
        Oval innereye2 = new Oval(new Point(500,210), 30, 60, Color.BLACK, true);        
        // Nose and Mouth and Tongue:
        Circle nose = new Circle(new Point(400, 300), 40, Color.BLACK, true);
        PolyLine mouth1 = new PolyLine(new Point(300, 325), new Point(400, 350), 50, Color.BLACK, true);
        PolyLine mouth2 = new PolyLine(new Point(500, 325), new Point(400, 350), 50, Color.BLACK, true);
        Oval tongue = new Oval(new Point(425,400), 50, 70, Color.RED, true);
        // Collar:
        Oval collar = new Oval(new Point(400,500), 350, 50, Color.BLUE, true);
        Circle button = new Circle(new Point(400, 500), 70, Color.RED, true);
        Circle button1 = new Circle(new Point(400, 500), 55, Color.GREEN, false);
        // Square around the dog:
        Square square = new Square(new Point(400, 300), 500, Color.MAGENTA, false);
        Circle circle = new Circle(new Point(400, 300), 707, Color.BLACK, false);
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(ear1);
        drawPanel.addShape(ear2);
        drawPanel.addShape(innerear1);
        drawPanel.addShape(innerear2);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(innereye1);
        drawPanel.addShape(innereye2);
        drawPanel.addShape(nose);
        drawPanel.addShape(mouth1);
        drawPanel.addShape(mouth2);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(button);
        drawPanel.addShape(button1);
        drawPanel.addShape(square);
        drawPanel.addShape(circle);
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
