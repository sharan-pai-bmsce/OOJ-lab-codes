import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		double a,b,c;
		double dis;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		dis = Math.pow(b, 2)-(4*a*c);
		if(dis>0) {
			System.out.println("The roots are real and unequal");
			double r1 = (-b+Math.sqrt(dis))/(2*a);
			double r2 = (-b-Math.sqrt(dis))/(2*a);
			System.out.println("The roots are:"+r1+" and "+r2);
		}else if(dis == 0) {
			System.out.println("The roots are real and equal");
			double r1 = (-b)/(2*a);
			System.out.println("The roots are:"+r1+" and "+r1);
		}else if(dis<0) {
			System.out.println("The roots are imaginary and unequal");
			double real,imag;
			real = (-b)/(2*a);
			imag = Math.sqrt(Math.abs(dis))/(2*a);
			//System.out.println(dis);
			System.out.println("The roots are:"+real+"+i"+imag+" and "+real+"-i"+imag);
		}
	}
}
