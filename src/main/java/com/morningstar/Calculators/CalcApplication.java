/**
 * 
 */
package com.morningstar.Calculators;

public class CalcApplication implements CalcInterface {

	public Double add(double input1, double input2) {
		return (input1 + input2);
	}

	public Double subtract(double input1, double input2) {
		return (input1 - input2);
	}

	public Double multiply(double input1, double input2) {
		return (input1 * input2);
	}

	public Double divide(double input1, double input2) {
		if (input2 != 0.0) {
			double x = (input1 / input2);
			return x;
		} else {
			return Double.MIN_VALUE;
		}
	}

	public Double expone(double input1) {
		return (Math.round(Math.exp(input1) * 100.0) / 100.0);
	}

	public Double nroot(double input1, double input2) {
		return nthroot(input1, input2, .0001);
	}

	public double nthroot(double input1, double x, double p) {
		if (x < 0) {
			System.err.println("Negative!");
			return -1;
		}
		if (x == 0)
			return 0;
		double x1 = x;
		double x2 = x / input1;
		while (Math.abs(x1 - x2) > p) {
			x1 = x2;
			x2 = ((input1 - 1.0) * x2 + x / Math.pow(x2, input1 - 1.0)) / input1;
		}
		return Math.round(x2 * 1000.0) / 1000.0;
	}

	public double[] qroot(double a, double b, double c) {
		double[] roots = { 0.0, 0.0 };
		double d = (b * b) - 4 * a * c;
		if (d > 0) {
			roots[0] = (-b + Math.sqrt(d)) / (2 * a);
			roots[1] = (-b - Math.sqrt(d)) / (2 * a);
			return roots;
		} else if (d == 0) {
			roots[0] = (-b + Math.sqrt(d)) / (2 * a);
			roots[1] = (-b + Math.sqrt(d)) / (2 * a);
			return roots;
		} else {
			System.out.println("Roots are imaginary");
			return roots;
		}
	}

	public double logc(double a) {
		return Math.log(a);

	}

	public Double display_PI() {
		return Math.PI;
	}

	public Double sin(double a) {

		return Math.sin(Math.toRadians(a));

	}

	public Double cos(double a) {

		return Math.cos(Math.toRadians(a));

	}

	public double mod(double input1, double input2) {
		return (input1 % input2);
	}

	public double GeoTan(double input1) {
		return Math.tan(input1);
	}

}
