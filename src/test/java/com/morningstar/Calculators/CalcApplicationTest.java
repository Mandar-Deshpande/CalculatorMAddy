/**
 * 
 */
package com.morningstar.Calculators;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import com.morningstar.calculators.CalcApplication;

/**
 * @author mdeshpa
 *
 */
public class CalcApplicationTest {

	CalcApplication cl = new CalcApplication();

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#add(double, double)}.
	 */
	@Test
	public void testAdd() {
		Double ExpectedOut = 10.0;
		Double ActualOut = cl.add(5, 5);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#add(double, double)}.
	 */
	@Test
	public void test2Add() {
		Double ExpectedOut = 1.7976931348623157E308;
		Double ActualOut = cl.add(Double.MAX_VALUE, Double.MIN_VALUE);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#subtract(double, double)}
	 * .
	 */
	@Test
	public void testSubtract() {
		Double ExpectedOut = 10.0;
		Double ActualOut = cl.subtract(20, 10);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#subtract(double, double)}
	 * .
	 */
	@Test
	public void test2Subtract() {
		Double ExpectedOut = -100.0;
		Double ActualOut = cl.subtract(-300, -200);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#multiply(double, double)}
	 * .
	 */
	@Test
	public void testMultiply() {
		Double ExpectedOut = 150.0;
		Double ActualOut = cl.multiply(15, 10);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#multiply(double, double)}
	 * .
	 */
	@Test
	public void test2Multiply() {
		Double ExpectedOut = -900.0;
		Double ActualOut = cl.multiply(30, -30);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#divide(double, double)}
	 * .
	 */
	@Test
	public void testDivide() {
		Double ExpectedOut = 5.0;
		Double ActualOut = cl.divide(25, 5);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#divide(double, double)}
	 * .
	 */
	@Test
	public void test2Divide() {
		Double ExpectedOut = Double.POSITIVE_INFINITY;
		Double ActualOut = cl.divide(25, 0);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#expone(double)}.
	 */
	@Test
	public void testExpone() {
		Double ExpectedOut = 2980.96;
		Double ActualOut = cl.expone(8);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#nroot(double root, double Number)}
	 * .
	 */
	@Test
	public void testNroot() {
		Double ExpectedOut = 1.817;
		Double ActualOut = cl.nroot(3, 6);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#Qroot(double, double, double)}
	 * .
	 */
	@Test
	public void testQroot() {
		double[] ExpectedOut = { 4.0, -1.0 };
		double[] ActualOut = cl.qroot(1, -3, -4);
		assertArrayEquals(ExpectedOut, ActualOut, 0.0001);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#Log(double)} .
	 */
	@Test
	public void testLogc() {
		double ExpectedOut = 3.0445;
		double ActualOut = cl.logc(21);
		assertEquals(ExpectedOut, ActualOut, 0.0001);
	}

	@Test
	public void sin() {

		Double ExpectedOut = 0.49999999999999994;
		Double ActualOut = cl.sin(30.0);
		assertEquals(ExpectedOut, ActualOut);
	}

	@Test
	public void cos() {

		Double ExpectedOut = 0.8660254037844387;
		Double ActualOut = cl.cos(30);
		assertEquals(ExpectedOut, ActualOut);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#Tan(double)} .
	 */
	@Test
	public void testTan() {
		double ExpectedOut = 0.3200403;
		double ActualOut = cl.geoTan(60);
		assertEquals(ExpectedOut, ActualOut, 0.0001);
	}

	/**
	 * Test method for
	 * {@link com.morningstar.calculators.CalcApplication#Mod(double)} .
	 */
	@Test
	public void testMod() {
		double ExpectedOut = 1.0;
		double ActualOut = cl.mod(15, 2);
		assertEquals(ExpectedOut, ActualOut, 0.0001);
	}

	public static void main(String[] args) throws Exception {
		JUnitCore.main("com.morningstar.calculators.CalcApplicationTest");
	}

}
