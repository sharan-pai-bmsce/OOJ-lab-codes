import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a>=b&&a>=c) {
			System.out.println(a+" is the largest");
		}else if(b>=a&&b>=c) {
			System.out.println(b+" is the largest");
		}else if(c>=b&&c>=a) {
			System.out.println(c+" is the largest");
		}
		input.close();
	}

}
