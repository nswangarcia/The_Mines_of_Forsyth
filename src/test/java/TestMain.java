/**
 * File: TestMain.java.
 * Author: Nicole Garcia
 * Date: 02/12/2024
 */

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * TestMain class.
 */
public class TestMain {

    /**
     * Test main init method.
     */
    @Test
    public void testInit() {
        assertTrue(Main.init());
    }
}
