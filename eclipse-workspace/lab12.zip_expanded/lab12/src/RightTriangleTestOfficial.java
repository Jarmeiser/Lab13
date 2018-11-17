
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    // TODO: complete testing
	 private static RightTriangle s1 = new RightTriangle(new Point(100, 100), 100, 100, Color.BLACK, true);
	    private static Point s1UL = new Point(200, 200);
	    private static Point s1LL = new Point(100, 100);
	    private static Point s1LR = new Point(100, 200);
	    private static RightTriangle s2 = new RightTriangle(new Point(150, 150), 25, 25, Color.CYAN, false);
	    private static Point s2UL = new Point(175, 175);
	    private static Point s2LL = new Point(150, 150);
	    private static Point s2LR = new Point(150, 175);

	    /**
	     * Right number of points?
	     */
	    @Test
	    public void testRightTriangleConstructorPointsArrayLength()
	    {
	        Point[] pts = s1.getLocation();
	        Assert.assertEquals(3, pts.length);
	    }
	    
	    /**
	     * Check points
	     */
	    @Test
	    public void testRightTriangleConstructorCalculatedPoints()
	    {
	        Point[] pts1 = s1.getLocation();
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1UL));
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1LL));
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1LR));
	      
	        Point[] pts2 = s2.getLocation();
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2UL));
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2LL));
	        Assert.assertTrue("Expected point not appearing in Right Triangle. Make sure that the rectangle is centered "
	                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2LR));
	    }
	    
	    /**
	     * Unfilled case
	     */
	    @Test
	    public void testRightTriangleConstructorUnfilled()
	    {
	        Assert.assertFalse("Right Triangle fill incorrect.", s2.isFilled());
	    }
	    
	    /**
	     * Filled case
	     */
	    @Test
	    public void testRightTriangleConstructorFilled()
	    {
	        Assert.assertTrue("Right Triangle fill incorrect.", s1.isFilled());
	    }
	    
	    /**
	     * Color
	     */
	    @Test
	    public void testRightTriangleConstructorColor()
	    {
	        Color clr1 = s1.getColor();
	        Color clr2 = s2.getColor();
	        Assert.assertEquals("Right Triangle color incorrect.", Color.BLACK, clr1);
	        Assert.assertEquals("Right Triangle color incorrect.", Color.CYAN, clr2);
	    }
}


