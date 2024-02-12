/**
 * File: TestMain.java.
 * Author: Nicole Garcia
 * Date: 02/12/2024
 */
package org.forsyth_mines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TestMain class.
 */
public class TestMain {

    /**
     * Test main init method.
     */
    @Test
    public void testInit() {
        Main main = new Main();
        assertTrue(main.init());
    }
}
