
import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class FirstClass2 {

	public static void main(String[] args) throws IOException {
		Eyes eyes = new Eyes();


        // Initialize the eyes SDK and set your private API key.
        eyes.setApiKey("undefined");

        // Define the OS and hosting application to identify the baseline.
        eyes.setHostOS("Windows 10");
        eyes.setHostApp("My maxthon browser");

        BufferedImage img;

        try {

            // Start the test and set the browser's viewport size to 800x600.
            eyes.open("Applitools site", "Java Screenshot test!", new RectangleSize(800, 600));

            // Load page image and validate.
            img = ImageIO.read(new URL("https://applitools.com/images/tutorials/applitools_hero.png"));

            // Visual validation.
            eyes.checkImage(img);

            // End visual testing.
         //   eyes.close();

        } finally {

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();

        }	}

}
