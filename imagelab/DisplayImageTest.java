package imagelab;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

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
         * the directory. Then deconstructs the class before iterating to the next imp in the
         * directory.
         */
        DisplayImage DisplayTest = new DisplayImage(null, testString);
    }

    /**
     * TODO write test for imp NULL situation to esnure that the correct .println
     * output is given, as per the source code
     */

    /**
     * TODO write event tracking test.
     */

}