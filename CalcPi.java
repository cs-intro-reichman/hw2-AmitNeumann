// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n=Integer.parseInt(args[0]),denominator;
		double sum=0.0, numerator;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				numerator=1.0;
			} else {
				numerator=-1.0;
			}
			denominator=1+(i*2);
			sum=sum+(numerator/denominator);
		}
		System.out.println(String.format("Pi according to Java: %.15f", Math.PI));
		if (n!=0) {
			System.out.println(String.format("Pi, approximated:     %.15f", sum * 4));
		} else 
			System.out.println("Pi, approximated: cannot be done with n=0");
	}
}
