package imagelab;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
//import java.io.File;
import java.lang.*;

/** Unit test for DisplayImage.java
 * @author Ryan Peterson
 */

public class DisplayImageTest {

    String testString = "TEST";

    /**
     * Test for constructor
     */
    @Test
    public void constructorTest () {
        /**
         * TODO iterate through the images directory to ensure they all construct as a proper
         * constructor test. Each iterator constructs the class and passes a different imp in
         * the directory. Then deconstructs the class before iterating to the next image in the
         * directory.
         *
         * This may be more difficult than intended because DisplayImage expects soemthing from ImgProvider
         * so one cannot just pass some random .jpg file. Best chance for success is to create an ImgProvider
         * class then pass that to the constructor.
         */

        ImgProvider imageFile = new ImgProvider ("images/AHEC.jpg"); //needs reference to relative directory, independent of system.
        DisplayImage DisplayTest = new DisplayImage(imageFile, testString);
    }

    /**
     * TODO write test for imp NULL situation to esnure that the correct .println
     * output is given, as per the source code
     */

    @Test
    public void impNullTest() {
        //DisplayImage nullTest = new DisplayImage(null, testString);
        //assertThrows(NullPointerException.class, ()->{nullTest});
       /** OutputStream outStream = new ByteArrayOutputStream();
        PrintStream printS = new PrintStream(outStream);
        System.setOut(printS);
        String compareString = printS.toString();
        assertEquals("\n\n***DisplayImage: imp is null!!! ***\n\n", compareString); */
    }

    /**
     * TODO write event tracking test.
     */
}
