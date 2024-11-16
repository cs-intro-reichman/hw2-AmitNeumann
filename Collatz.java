// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N=Integer.parseInt(args[0]), num=1,count=1;
		String mode=args[1];
		if(mode.equals("v")) {
		System.out.print(num+" ");
		num=num*3+1;
		System.out.print(num+" ");
		while(num!=1) { // for row 1 
			if(num%2==0) {
				num=num/2;
			} else {
				num=num*3+1;
			} count++;
			System.out.print(num+" ");
		} System.out.print("("+count+")");
		System.out.println();
		for (int i=2;i<=N;i++) { // other rows
			count=1;
			num=i;
			System.out.print(num+" ");
			while(num!=1) {
				if(num%2==0) {
					num=num/2;
				} else {
					num=num*3+1;
				} count++;
				System.out.print(num+" ");
			} System.out.print("("+count+")");
			System.out.println();
		 } 	System.out.println("Every one of the first "+N+" hailstone sequences reached 1.");
		} else if (mode.equals("c")){
			boolean reached1=false;
			num=num*3+1; // מאחד לארבע בשורה ראשונה, על מנת להכנס
			while(num!=1) { // for row 1 
				if(num%2==0) {
					num=num/2;
				} else {
					num=num*3+1;
				} 
			} 
			for (int i=2;i<=N;i++) { // other rows
				num=i;
				while(num!=1) {
					if(num%2==0) {
						num=num/2;
					} else {
						num=num*3+1;
					} 
				} 
			} if (num==1) {
				reached1=true;
			}
			if (reached1)  {
				System.out.println("Every one of the first "+N+" hailstone sequences reached 1.");
			}
		}
	} 
}
