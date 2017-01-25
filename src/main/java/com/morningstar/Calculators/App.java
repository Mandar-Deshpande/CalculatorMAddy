package com.morningstar.Calculators;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			CalcApplication calc = new CalcApplication();
			System.out.println("\t Welcome \n Calculator Program Using Maven");
			double input1 = 0, input2 = 0;
			int a = 0;
			boolean flag = true;
			while (flag) {
				System.out
						.println("Choose Operation : \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
				System.out.println(
						" 5.Exponential \n 6.Nth root \n 7.Quadratic Equations Root \n 8.Log  \n 9.Mod  \n 10.Tan  \n 11.Exit \n\n\n");
				a = sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("Addition of Two Numbers");
					System.out.println("Enter Number 1 :");
					input1 = sc.nextDouble();
					System.out.println("Enter Number 2 :");
					input2 = sc.nextDouble();
					System.out.println("Addition of " + input1 + " + " + input2 + " = " + calc.add(input1, input2));
					break;
				case 2:
					System.out.println("Subtraction of Two Numbers");
					System.out.println("Enter Number 1 :");
					input1 = sc.nextDouble();
					System.out.println("Enter Number 2 :");
					input2 = sc.nextDouble();
					System.out.println(
							"Subtraction of " + input1 + " - " + input2 + " = " + calc.subtract(input1, input2));
					break;
				case 3:
					System.out.println("Multiplication of Two Numbers");
					System.out.println("Enter Number 1 :");
					input1 = sc.nextDouble();
					System.out.println("Enter Number 2 :");
					input2 = sc.nextDouble();
					System.out.println(
							"Multiplication of " + input1 + " * " + input2 + " = " + calc.multiply(input1, input2));
					break;
				case 4:
					System.out.println("Division of Two Numbers");
					System.out.println("Enter Number 1 :");
					input1 = sc.nextDouble();
					System.out.println("Enter Number 2 :");
					input2 = sc.nextDouble();
					System.out.println("Division of " + input1 + " / " + input2 + " = " + calc.divide(input1, input2));
					break;
				case 5:
					System.out.println("Exponential of Number");
					System.out.println("Enter Number :");
					input1 = sc.nextDouble();
					System.out.println("Expnential of " + input1 + " = " + calc.expone(input1));
					break;
				case 6:
					System.out.println("Nth of Number");
					System.out.println("Enter root :");
					input1 = sc.nextDouble();
					System.out.println("Enter Number :");
					input2 = sc.nextDouble();
					System.out.println(input1 + " Root of " + input2 + " is " + calc.nroot(input1, input2));
					break;
				case 7:
					System.out.println("Quadratic Root of Number");
					System.out.println("Enter vale for a :");
					input1 = sc.nextDouble();
					System.out.println("Enter vale for b :");
					input2 = sc.nextDouble();
					System.out.println("Enter vale for c :");
					double input3 = sc.nextDouble();
					double[] output = calc.qroot(input1, input2, input3);
					System.out.println("Roots of " + input1 + "x \u00b2 +" + input2 + "x +" + input3 + " is {"
							+ output[0] + "," + output[1] + "}");
					break;
				case 8:
					System.out.println("Log of Number");
					System.out.println("Enter Number :");
					input1 = sc.nextDouble();
					System.out.println("Log of " + input1 + " = " + calc.logc(input1));
				case 9:
					System.out.println("Mod of Two Numbers");
					System.out.println("Enter Number 1 :");
					input1 = sc.nextDouble();
					System.out.println("Enter (Mod of) Number 2 as :");
					input2 = sc.nextDouble();
					System.out.println("Mod of " + input1 + " % " + input2 + " = " + calc.mod(input1, input2));
				case 10:
					System.out.println("Tan of Number");
					System.out.println("Enter degree in Radians :");
					input1 = sc.nextDouble();
					System.out.println("Tan(" + input1 + ") = " + calc.GeoTan(input1));
				case 11:
					System.out.println("\n Thank you for using calculator system ");
					flag = false;
					break;
				default:
					System.out.println("\n Invalid Selection..Please select Valid option ");
					break;
				}

				if (a != 8) {
					System.out.println("\n Enter Y to Continue ");
					String x = sc.next();

					for (int clear = 0; clear < 1000; clear++) {
						System.out.println("\b");
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Exception :" + e.getMessage());
		}
	}
}
