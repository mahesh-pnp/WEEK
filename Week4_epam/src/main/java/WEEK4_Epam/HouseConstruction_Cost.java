package WEEK4_Epam;
import java.util.logging.Logger; 
public class HouseConstruction_Cost {
	Logger logger = Logger.getLogger(HouseConstruction_Cost.class.getName());
	public int costEstimation(String material_Type,int area,boolean is_automated){
		int cost_per_square_feet=-1;
		if(is_automated==true && material_Type.equals("High")) {
			cost_per_square_feet=2500;
		}
		else if(material_Type.equals("High")) {
			cost_per_square_feet=1800;
		}
		else if(material_Type.equals("Above")){
			cost_per_square_feet=1500;
		}
		else if(material_Type.equals("Standard")){
			cost_per_square_feet=1200;
		}
		else {
			System.out.format("%s","Invalid Inputs");
			System.exit(0);
		}
		return(cost_per_square_feet*area);
	}

}