package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app = new App();
	 @test
	    void testAdd() {
		 assertEquals(25, app.add(20, 5));
	 }
	 @test
	 void testSubtract() {
		 assertEquals(15, app.add(20, 5));
	 }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}

