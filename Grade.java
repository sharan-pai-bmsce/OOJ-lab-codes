import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		
		int CIE,SEE;
		Scanner input = new Scanner(System.in);
		CIE  = input.nextInt();
		SEE  = input.nextInt();
		double total = (double)SEE/2;
		total += (double)CIE;
		if(total>=90) {
			System.out.println("S");
		}else if(total>=80) {
			System.out.println("A");
		}else if(total>=70) {
			System.out.println("B");
		}else  if(total>=60) {
			System.out.println("C");
		}else  if(total>=50) {
			System.out.println("D");
		}else  if(total>=40) {
			System.out.println("E");
		}else{
			System.out.println("F");
		}
		input.close();
	}

}
