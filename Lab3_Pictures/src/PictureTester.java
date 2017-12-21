/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayScale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical(boolean leftToRight)
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    
    if (leftToRight)
    {
        caterpillar.mirrorVertical();
    }
    else
    {
        caterpillar.mirrorVerticalRightToLeft();
    }
    
    caterpillar.explore();
  }
  
  /** Method to test mirror horizontal */
  public static void testMirrorHorizontal(boolean topToBottom)
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    
    if (topToBottom)
    {
    	temple.mirrorHorizontal();
    }
    else
    {
    	temple.mirrorHorizontalBottomToTop();
    }
    
    temple.explore();
  }
  
  /** Method to test mirror diagonally */
  public static void testMirrorDiagonal(boolean bLtoTr)
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    
    if (bLtoTr)
    {
    	beach.mirrorDiagonal();
    }
    else
    {
    	beach.mirrorDiagonalAlt();
    }
    
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical(true);
	//testMirrorHorizontal(true);
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal(true);
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}