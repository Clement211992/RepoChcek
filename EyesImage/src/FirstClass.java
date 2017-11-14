
import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FirstClass {

	public static void main(String[] args) throws IOException {
		Eyes eyes = new Eyes();

        // Initialize the eyes SDK and set your private API key.
        eyes.setApiKey("me316sek95lJdb9aF99CHvylIXDsggaQN4I8KZKJ5YdU110");

        // Define the OS and hosting application to identify the baseline.
        eyes.setHostOS("Windows 10");
        eyes.setHostApp("My maxthon browser");

       
        
        try {

            // Start the test and set the browser's viewport size to 800x600.
            eyes.open("RandomImageCompare", "TestRandomImg", new RectangleSize(800, 600));
            eyes.checkImage("C:\\Users\\Clement\\Pictures\\Ships\\voyager.jpg", "Local3");
            
            //While running the test first time, use this to set all the images as the basline
            
            //eyes.setSaveFailedTests(true);
           // eyes.checkImage(img, "Contact-us page");
            
           // eyes.checkImage(img);
            //eyes.checkImage(img1);
            
           // boolean b = eyes.checkImage(img1);
            //boolean b1 = eyes.checkImage(img1);
            //boolean b2 = eyes.checkImage(img1);
            
        
            //System.out.println(b1);
            //System.out.println(b2);
           eyes.close();
                    } 
        
        finally {
            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();

        }
		
		
	}

}
