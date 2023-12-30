import java.util.*;
import java.text.DecimalFormat;

class Expenses{
	public static void main(String[] args) throws Exception{ 
		Scanner sc=new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("##.00");

		System.out.println("Enter branding expenses");
		double brand=sc.nextDouble();
		System.out.println("Enter travel expenses");
		double travel=sc.nextDouble();
		System.out.println("Enter food expenses");
		double food=sc.nextDouble();
		System.out.println("Enter logistics expenses");
		double logistics=sc.nextDouble();

		double totalExpenses=brand+travel+food+logistics;

		double brandPercent=(brand/totalExpenses)*100;
		double travelPercent=(travel/totalExpenses)*100;
		double foodPercent=(food/totalExpenses)*100;
		double logisticsPercent=(logistics/totalExpenses)*100;

		System.out.println("Total expenses: Rs."+numberFormat.format(totalExpenses));
		System.out.println("Branding expenses percentage: "+ numberFormat.format(brandPercent));
		System.out.println("Travel expenses percentage: "+ numberFormat.format(travelPercent));
		System.out.println("Food expenses percentage: "+ numberFormat.format(foodPercent));
		System.out.println("Logistics expenses percentage: "+ numberFormat.format(logisticsPercent));

		sc.close();
	}
}
