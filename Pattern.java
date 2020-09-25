import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		int count=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
		input.close();
	}

}
