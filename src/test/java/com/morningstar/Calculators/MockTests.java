/**
 * 
 */
package com.morningstar.Calculators;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.morningstar.calculators.CalcApplication;

/**
 * @author mdeshpa
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MockTests {

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#CalcApplication()}.
	 */
	@Test
	public void testCalcApplication() {
		
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#add(double, double)}.
	 */
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#subtract(double, double)}.
	 */
	@Test
	public void testSubtract() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.subtract(10, 5)).thenReturn(5.0);
		Double A=cal.subtract(10, 5);
		Double E=5.0;
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#multiply(double, double)}.
	 */
	@Test
	public void testMultiply() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.multiply(10, 5)).thenReturn(55.0);
		Double A=cal.multiply(10, 5);
		Double E=55.0;
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#divide(double, double)}.
	 */
	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#expone(double)}.
	 */
	@Test
	public void testExpone() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.expone(10)).thenReturn(55.0);
		Double E=55.0;
		Double A=cal.expone(10);
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#nroot(double, double)}.
	 */
	@Test
	public void testNroot() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.nroot(10, 5)).thenReturn(90.0);
		Double A=cal.nroot(10, 5);
		Double E=90.0;
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#nthroot(double, double, double)}.
	 */

	@Test
	public void testQroot() {
		CalcApplication cal=mock(CalcApplication.class);
		double[] E= {50,50};
		when(cal.qroot(25,10, 5)).thenReturn(E);
		double[] A=cal.qroot(25,10, 5);
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#logc(double)}.
	 */
	@Test
	public void testLogc() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.logc(5)).thenReturn(55.0);
		Double A=cal.logc(5);
		Double E=55.0;
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#display_PI()}.
	 */
	@Test
	public void testDisplay_PI() {
		CalcApplication cal=mock(CalcApplication.class);
		when(cal.display_PI()).thenReturn(3.54);
		Double A=cal.display_PI();
		Double E=3.54;
		assertEquals(A, E);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#sin(double)}.
	 */
	@Test
	public void testSin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#cos(double)}.
	 */
	@Test
	public void testCos() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#mod(double, double)}.
	 */
	@Test
	public void testMod() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#GeoTan(double)}.
	 */
	@Test
	public void testGeoTan() {
		fail("Not yet implemented");
	}
	
}
