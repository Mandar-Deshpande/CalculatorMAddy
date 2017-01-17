/**
 * 
 */
package com.morningstar.Calculators;

/**
 * @author mdeshpa
 *
 */
public interface CalcInterface {

	public Double add(double input1, double input2);

	public Double subtract(double input1, double input2);

	public Double multiply(double input1, double input2);

	public Double divide(double input1, double input2);

	public Double expone(double input1);

	public Double nroot(double input1, double input2);

	public double[] qroot(double input1, double input2, double input3);

	public double logc(double a);

	public double mod(double input1, double input2);

	public double GeoTan(double input1);

	public Double display_PI();

	
}
