package com.morningstar.calculators;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */

public class App {
	private static Scanner sc;
	private static double input1;
	private static double input2;
	private static CalcApplication calc;
	private static boolean flag;
	private static Logger log;
	private App() {
		input1 = 0.0;
		input2 = 0.0;
	}

	public static void main(String[] args) {
		log.info("\t Welcome \n Calculator Program Using Maven");
		flag = true;
		sc = new Scanner(System.in);
		log = Logger.getLogger(App.class.getName());
		calc = new CalcApplication();
		while (flag) {
			brline();
			catcherror();
		}
	}
	
	private static void catcherror(){
		int a = 0;
		try {
			log.info("Choose Operation : \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
			log.info(" 5.Exponential \n 6.Nth root \n 7.Quadratic Equations Root \n 8.Log  \n 9.Mod  \n 10.Tan  \n 11.Exit \n\n\n");
			a = sc.nextInt();
			choise(a);
		} catch (Exception ex) {
			log.error(ex);
		}
		finally {
			String x="n";
			if (a != 11) {
				log.info("\n Enter Y to Continue ");
				 x = sc.next();
			}
			if(!"y".equalsIgnoreCase(x)) {
				flag=false;
				log.info("\n Thank you for using calculator system ");
			}
		}
	}
	
	private static void brline(){
		for (int clear = 0; clear < 10; clear++) {
			log.debug("\n");
		}
	}
	
	private static void inputdata(){
		log.info("Enter Number 1 :");
		input1 = sc.nextDouble();
		log.info("Enter Number 2 :");
		input2 = sc.nextDouble();
	}

	private static void inpdata(){
		log.info("Enter Number :");
		input1 = sc.nextDouble();
		input2=0.0;
	}
	private static void add() {
		log.info("Addition of Two Numbers");
		inputdata();
		log.info("Addition of " + input1 + " + " + input2 + " = " + calc.add(input1, input2));
	}

	private static void sub() {
		log.info("Subtraction of Two Numbers");
		inputdata();
		log.info("Subtraction of " + input1 + " - " + input2 + " = " + calc.subtract(input1, input2));
	}

	private static void mul() {
		log.info("Multiplication of Two Numbers");
		inputdata();
		log.info("Multiplication of " + input1 + " * " + input2 + " = " + calc.multiply(input1, input2));
	}

	private static void div() {
		log.info("Division of Two Numbers");
		inputdata();
		log.info("Division of " + input1 + " / " + input2 + " = " + calc.divide(input1, input2));
	}

	private static void exp() {
		log.info("Exponential of Number");
		inpdata();
		log.info("Expnential of " + input1 + " = " + calc.expone(input1));
	}

	private static void root() {
		log.info("Nth of Number");
		inputdata();
		log.info(input1 + " Root of " + input2 + " is " + calc.nroot(input1, input2));
	}

	private static void qroot() {
		log.info("Quadratic Root of Number");
		log.info("Enter vale for a :");
		input1 = sc.nextDouble();
		log.info("Enter vale for b :");
		input2 = sc.nextDouble();
		log.info("Enter vale for c :");
		double input3 = sc.nextDouble();
		double[] output = calc.qroot(input1, input2, input3);
		log.info("Roots of " + input1 + "x \u00b2 +" + input2 + "x +" + input3 + " is {" + output[0] + "," + output[1] + "}");
	}
	private static void log() {
		log.info("Log of Number");
		inpdata();
		log.info("Log of " + input1 + " = " + calc.logc(input1));
	}
	private static void mod() {
		log.info("Mod of Two Numbers");
		inpdata();
		log.info("Enter (Mod of) Number :");
		input2 = sc.nextDouble();
		log.info("Mod of " + input1 + " % " + input2 + " = " + calc.mod(input1, input2));
	}
	private static void tan() {
		log.info("Tan of Number");
		log.info("Enter degree in Radians :");
		input1 = sc.nextDouble();
		log.info("Tan(" + input1 + ") = " + calc.geoTan(input1));
	}
	private static void choise(int a){
		switch (a) {
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;
		case 5:
			exp();
			break;
		case 6:
			root();
			break;
		case 7:
			qroot();
			break;
		case 8:
			log();
			break;
		case 9:
			mod();
			break;
		case 10:
			tan();
			break;
		case 11:
			log.info("\n Thank you for using calculator system ");
			flag = false;
			break;
		default:
			log.info("\n Invalid Selection..Please select Valid option ");
			break;
		}
	}
}
