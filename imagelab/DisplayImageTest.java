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
        DisplayImage DisplayTest = new DisplayImage(null, testString);
    }

}