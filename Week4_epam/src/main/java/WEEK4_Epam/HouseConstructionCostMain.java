package WEEK4_Epam;
import java.util.logging.Logger; 
import java.util.Scanner;
public class HouseConstructionCostMain{
	 static Logger logger = Logger.getLogger(HouseConstructionCostMain.class.getName()); 
	static String material;
	static boolean is_automated;
	static int area;
	static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		logger.info("Enter Material Type (Standard,Above,High):-");
		material=input.next();
		logger.info("Enter Area of house in square feets :-");
		area=input.nextInt();
		logger.info("Enter Is House should beFully automated  home or not (True,False):-");
		is_automated=input.nextBoolean();
		HouseConstruction_Cost obj=new HouseConstruction_Cost();
		String s="Overall Estimation Cost for House Construction is:-"+obj.costEstimation(material,area,is_automated);
		logger.info(s);

}
}