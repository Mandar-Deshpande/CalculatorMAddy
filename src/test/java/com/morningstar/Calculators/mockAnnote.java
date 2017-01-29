/**
 * 
 */
package com.morningstar.Calculators;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.mockito.runners.MockitoJUnitRunner;

import com.morningstar.calculators.CalcApplication;
import com.morningstar.calculators.CalcInterface;

/**
 * @author mdeshpa
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class mockAnnote {

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#CalcApplication()}.
	 */
	@Test
	public void testCalcApplication() {
		
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#add(double, double)}.
	 */
	
	
	@Mock
	CalcInterface ci=new CalcApplication();
	
	
	
	@PostConstruct
	public void start(){
		System.out.println("started");
	}
	
	
	@PreDestroy
	public void end(){
		System.out.println("ended");
	}
	/*@InjectMocks
	
	CalcApplication ca1=new CalcApplication();
	*/
	
	
	@Test
	public void testAdd() {
		Double d=10.0;
		when(ci.add(12, 2)).thenReturn(12.0 - 2.0);
		
		assertEquals(d,ci.add(12, 2),0.00001);
		
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#subtract(double, double)}.
	 */
	@Test
	public void testSubtract() {
		when(ci.subtract(12, 2)).thenReturn(10.0);
		assertEquals(10.0,ci.subtract(12, 2),0.00001);
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#multiply(double, double)}.
	 */
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#nroot(double, double)}.
	 */
	@Test
	public void testNroot() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#nthroot(double, double, double)}.
	 */
	@Test
	public void testNthroot() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#qroot(double, double, double)}.
	 */
	@Test
	public void testQroot() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#logc(double)}.
	 */
	@Test
	public void testLogc() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.morningstar.calculators.CalcApplication#displayPI()}.
	 */
	@Test
	public void testDisplayPI() {
		fail("Not yet implemented");
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
	 * Test method for {@link com.morningstar.calculators.CalcApplication#geoTan(double)}.
	 */
	@Test
	public void testGeoTan() {
		fail("Not yet implemented");
	}

}
