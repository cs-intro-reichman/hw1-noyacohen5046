// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int CurrentValue = Integer.parseInt(args[0]);
	double Precent = Double.parseDouble(args[1]);
	int Years = Integer.parseInt(args[2]);
	double futurevalue = CurrentValue*Math.pow((1+Precent/100), Years);
	System.out.println("After "+ Years +" years, "+ "$ " + CurrentValue +" Saved at "+ Precent +"% "+ " will yiels "+ (int)futurevalue +"$");
	}
}