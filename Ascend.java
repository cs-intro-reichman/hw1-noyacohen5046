// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int number = Integer.parseInt(args [0]);
	double A = number*Math.random();
	double B = number*Math.random();
	double C = number*Math.random();
	System.out.println((int)A + " " + (int)B + " " + (int)C);
	double max = Math.max(A, B);
	max = Math.max(max, C);
	double min = Math.min(A, B);
			min = Math.min(min, C);
	double mid = A + B + C - min - max;
	System.out.println((int)min + " " + (int)mid+ " " + (int)max);

	}
}
