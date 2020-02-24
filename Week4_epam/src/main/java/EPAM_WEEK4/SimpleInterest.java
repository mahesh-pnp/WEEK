package EPAM_WEEK4;
import java.util.logging.Logger;

import WEEK4_Epam.HouseConstructionCostMain;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleInterest {
	static Logger logger = Logger.getLogger(SimpleInterest.class.getName());
	public double calSimpleInterest()
	{
	Scanner input = new Scanner(System.in);
		logger.info("Enter Principal Amount:\n");
		double principalAmount = input.nextDouble();
		logger.info("Enter the Number of Years:\n");
		double time = input.nextDouble();
		logger.info("Enter Rate Of Interest:\n");
		double rateOfInterest = input.nextDouble();
		SimpleInterest simpleObj=new SimpleInterest();
		double simpleInterest = simpleObj.calculate_Simple_Interest(principalAmount,time,rateOfInterest);
	
		return simpleInterest;
		}
	public double calculate_Simple_Interest(double principalAmount,double time,double rateOfInterest)
	{
		return principalAmount*time*rateOfInterest/100;
	}
}