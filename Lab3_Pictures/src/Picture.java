import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  public void encode(Picture pic)
  {
  	  Pixel[][] messagePixels = pic.getPixels2D();
  	  Pixel[][] currPixels = this.getPixels2D();
  	  
  	  for(int row = 0; row < currPixels.length; row++)
  	  {
  		  for(int col = 0; col < currPixels[0].length; col++)
  		  {
  			boolean isBlack = messagePixels[row][col].getAverage() > 127.0;
  			boolean isOdd = currPixels[row][col].getRed() % 2 == 1;
  			if(isBlack)
  			{
  				if(!isOdd)
  				{
  					currPixels[row][col].setRed(currPixels[row][col].getRed() + 1);
  				}
  			}
  			else
  			{
  				if(isOdd)
  				{
  					currPixels[row][col].setRed(currPixels[row][col].getRed() - 1);
  				}
  			}
  		  }
  	  }
  } 
  
  
  
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Picture messagePicture = new Picture(height, width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  
	  for(int row = 0; row < height; row++)
	  {
		  for(int col = 0; col < width; col++)
		  {
			  if(pixels[row][col].getRed() % 2 == 1)
			  {
				  messagePixels[row][col].setColor(new Color(255, 255, 255));
			  }
			  else
			  {
				  messagePixels[row][col].setColor(new Color(0, 0, 0));
			  }
		  }
	  }
	  return messagePicture;
  }
  
  public void chromakey(Picture newBack)
  {
     Pixel fromPixel = null;
     Pixel toPixel = null;
     Pixel[][] toPixels = this.getPixels2D();
     Pixel[][] fromPixels = newBack.getPixels2D();

     /** your code here */
     for (int row  = 0; row < toPixels.length; row++)
     {
    	for (int column = 0; column < toPixels[0].length; column++)
    	{
    		if (toPixels[row][column].getBlue() > toPixels[row][column].getRed())
    		{
    			toPixels[row][column].setColor(fromPixels[row][column].getColor());
    		}
    	}
     }
  }
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set the red and green to 0 */
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to grayScale all of the pixels */
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
    	  
        pixelObj.setRed(average);
        pixelObj.setGreen(average);
        pixelObj.setBlue(average);
      }
    }
  }
  
  /** Method to grayScale all of the pixels */
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	if (pixelObj.getGreen() > pixelObj.getBlue())
    	{
    		pixelObj.setBlue(0);
    	}
      }
    }
  }
  
  /** Method to negate all of the pixels */
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
   * vertical mirror in the center of the picture
   * from right to left */
public void mirrorVerticalRightToLeft()
{
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[0].length;
	for (int row = 0; row < pixels.length; row++)
	{
	  for (int col = 0; col < width / 2; col++)
	  {
	    leftPixel = pixels[row][col];
	    rightPixel = pixels[row][width - 1 - col];
	    leftPixel.setColor(rightPixel.getColor());
	  }
	} 
}
 
 /** Method that mirrors the picture around a 
  * horizontal mirror in the center of the picture
  * from top to bottom */
public void mirrorHorizontal()
{
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int height = pixels.length;
	for (int row = 0; row < height / 2; row++)
	{
	  for (int col = 0; col < pixels[0].length; col++)
	  {
	    topPixel = pixels[row][col];
	    bottomPixel = pixels[height - row - 1][col];
	    bottomPixel.setColor(topPixel.getColor());
	  }
	} 
}

/** Method that mirrors the picture around a 
 * horizontal mirror in the center of the picture
 * from bottom to top */
public void mirrorHorizontalBottomToTop()
{
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int height = pixels.length;
	for (int row = 0; row < height / 2; row++)
	{
	  for (int col = 0; col < pixels[0].length; col++)
	  {
	    topPixel = pixels[row][col];
	    bottomPixel = pixels[height - row - 1][col];
	    topPixel.setColor(bottomPixel.getColor());
	  }
	} 
}

/** Method that mirrors the picture around a 
 * diagonal mirror in the center of the picture
 * from bottom left to top right*/
public void mirrorDiagonal()
{
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int squareLength;
	
	if (pixels.length < pixels[0].length)
	{
		 squareLength = pixels.length;
	}
	else
	{
		 squareLength = pixels[0].length;
	}
	
	for (int row = 0; row < squareLength; row++)
	{
		for (int col = 0; col < squareLength; col++)
		{
		  topPixel = pixels[row][col];
		  bottomPixel = pixels[col][row];
		  topPixel.setColor(bottomPixel.getColor());
		}
	} 
}

/** Method that mirrors the picture around a 
 * diagonal mirror in the center of the picture
 * from top right to bottom left*/
public void mirrorDiagonalAlt()
{
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int squareLength;
	
	if (pixels.length < pixels[0].length)
	{
		 squareLength = pixels.length;
	}
	else
	{
		 squareLength = pixels[0].length;
	}
	
	for (int row = 0; row < squareLength; row++)
	{
		for (int col = 0; col < squareLength; col++)
		{
		  topPixel = pixels[row][col];
		  bottomPixel = pixels[col][row];
		  bottomPixel.setColor(topPixel.getColor());
		}
	} 
}

/** Mirror just part of a picture of a snowman */
public void mirrorArms()
{
	int mirrorPoint = 192;
	Pixel left = null;
	Pixel right = null;
	
	Pixel[][] pixels = this.getPixels2D();
  
  	//left arm mirror
	for(int row = 159; row <= 190; row++)
	{
		for(int col = 105; col <= 169; col++)
		{
		  left = pixels[row][col];
		  right = pixels[mirrorPoint - row + mirrorPoint][col];
		  right.setColor(left.getColor());
		}
	}
	
	//right arm mirror
	 	  
	for(int row = 172; row <= 195; row++)
	{
		  for(int col = 239; col <= 293; col++)
		  {
			  left = pixels[row][col];
			  right = pixels[mirrorPoint - row + mirrorPoint][col];
			  right.setColor(left.getColor());
		  }
	}
}
 
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
	      leftPixel = pixels[row][col];      
	      rightPixel = pixels[row]                       
	                       [mirrorPoint - col + mirrorPoint];
	      rightPixel.setColor(leftPixel.getColor());
	      count++;
      }
    }
    
    System.out.println(count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    
    Color rightColor = null;
    Color bottomColor = null;
    
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
    	  topPixel = pixels[row][col];
    	    bottomPixel = pixels[row + 1][col];
    	    bottomColor =  bottomPixel.getColor();
    	    
    	    if (topPixel.colorDistance(bottomColor) > edgeDist)
    	    	topPixel.setColor(Color.BLACK);
    	    else
    	    	topPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
