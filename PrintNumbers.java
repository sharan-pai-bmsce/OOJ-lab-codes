import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		input.close();
	}
}
