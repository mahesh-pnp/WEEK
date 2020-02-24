package EPAM_WEEK4;

import java.util.Scanner;
import java.util.logging.Logger;

import WEEK4_Epam.HouseConstructionCostMain;
import java.util.logging.Logger; 
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class App {
	static Scanner input;
	static Logger logger = Logger.getLogger(App.class.getName()); 
	public static void main(String args[]) {
		logger.info("Enter \'simple\' for simple interest or \'compound\' for compound interest:\n");
		input=new Scanner(System.in);
		String ch=input.nextLine();
		switch(ch)
		{
			case "simple":
				SimpleInterest simpleInterest=new SimpleInterest();
			logger.info(Double.toString(simpleInterest.calSimpleInterest()));break;
			case "compound":
				CompoundInterest compoundInterest=new CompoundInterest();
				logger.info(Double.toString(compoundInterest.calCompoundInterest()));break;
				default:
					logger.info("\nInvalid option");break;
					}
		
	}
	

}