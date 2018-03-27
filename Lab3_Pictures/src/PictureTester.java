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
  
  public static void testSteg()
  {
	  Picture beach = new Picture("beach.jpg");
	  Picture msg = new Picture("msg.jpg");
	  beach.encode(msg);
	  beach.explore();
	  Picture m = beach.decode();
	  m.explore();
  }
  
  public static void testChromakey()
  {
      Picture mark = new Picture("blue-mark.jpg");
      mark.explore();
      Picture moon = new Picture("moon-surface.jpg");
      mark.chromakey(moon);
      mark.explore();
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
  
  public static Picture copy(Picture toPic, Picture fromPic, int destRow, int destCol, int fromStartRow, int fromEndRow, int fromStartCol, int fromEndCol)
  {
	  Picture collage = toPic;
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = collage.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for(int fromRow = fromStartRow, toRow = destRow; 
			  (fromRow < fromEndRow && fromRow < fromPixels.length) && (toRow < toPixels.length); fromRow++, toRow++)
	  {
		  for(int fromCol = fromStartCol, toCol = destCol; 
				  fromCol < fromEndCol && fromCol < fromPixels.length && toCol < toPixels.length; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }
	  return collage;
  }
  
  public static void testCollage()
  {
	  Picture collage = new Picture("640x480.jpg");
	  Picture flower1 = new Picture("flower1.jpg");
	  Pixel[][] fl1Pixels = flower1.getPixels2D();
	  int fl1NumRows = fl1Pixels.length;
	  int fl1NumCols = fl1Pixels[0].length;
	  collage = copy(collage, flower1, 10, 10, 0, fl1NumRows, 0, fl1NumCols);
	  
	  Picture flower2 = new Picture("flower2.jpg");
	  Pixel[][] fl2Pixels = flower2.getPixels2D();
	  int fl2NumRows = fl2Pixels.length;
	  int fl2NumCols = fl2Pixels[0].length;
	  collage = copy(collage, flower2, 30, 10, 0, fl2NumRows, 0, fl2NumCols);
	  
	  Picture arch = new Picture("arch.jpg");
	  Pixel[][] archPixels = arch.getPixels2D();
	  int archNumRows = archPixels.length;
	  int archNumCols = archPixels[0].length;
	  collage = copy(collage, arch, 50, 50, 0, archNumRows, 0, archNumCols);
	  
	  collage.mirrorVertical();
	  
	  collage.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  //234, 238
	  //322, 344
	  //360
	  Pixel[][] pixels = gull.getPixels2D();
	  
	  gull.explore();
	  
	  Pixel left = null;
	  Pixel right = null;
	  
	  int pivot = 360;
	  for(int row = 234; row <= 322; row++)
	  {
		  for(int col = 238; col <= 344; col++)
		  {
			  left = pixels[row][col];
			  right = pixels[row][pivot - col + pivot];
			  right.setColor(left.getColor());
		  }
	  }
	  
	  
	  gull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
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
	//testSteg();
	  testChromakey();
  }
}