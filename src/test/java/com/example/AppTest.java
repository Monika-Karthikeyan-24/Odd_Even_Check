
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testEvenNumber() {
        App app = new App();
        assertEquals("Even", app.checkEvenOdd(8));
    }

    @Test
    public void testOddNumber() {
        App app = new App();
        assertEquals("Odd", app.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        App app = new App();
        assertEquals("Even", app.checkEvenOdd(0));
    }
}
