import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int num1;
		int num2;
		int status = 0;
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		for(int i=num1;i<=num2;i++) {
			boolean state = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j == 0) {
					state = false;
					break;
				}
			}
			if(state) {
				status = 1;
				System.out.print(i+" ");
			}	
		}
		if(status == 0) {
			System.out.println("No prime numbers exist between "+num1+" and "+num2);
		}
		input.close();
	}
}
