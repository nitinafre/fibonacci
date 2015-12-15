package org.nitin.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by nitinafre on 15/12/2015.
 */
public class FibonacciTest {

	@Test
	public void testNumber() {
		Fibonacci series = new Fibonacci();
		String response = series.fibonacci(10);
		System.out.println(response);
		assertTrue(response.equals("0, 1, 1, 2, 3, 5, 8, 13, 21, 34"));
	}
}
