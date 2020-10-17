import java.util.Scanner;

public class W3EP2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Age a1 = new Age(input.next(),input.nextInt(),input.nextInt());
		Age a2 = new Age(input.next(),input.nextInt(),input.nextInt());
		a1.calAge(a2);
		input.close();
	}

}

class Age{
	private String Name;
	private int month;
	private int year;
	Age(String name,int month,int year){
		this.Name=name;
		this.month=month;
		this.year=year;
	}
	public void calAge(Age a) {
		if(this.year<a.year) {
			if(this.year-a.year==-1)
				System.out.println(this.Name+" is older by "+(a.year-this.year)+" year");
			else
				System.out.println(this.Name+" is older by "+(a.year-this.year)+" years");
		}else if(this.year>a.year) {
			if(this.year-a.year==1)
				System.out.println(a.Name+" is older by "+(this.year-a.year)+" year");
			else
				System.out.println(a.Name+" is older by "+(this.year-a.year)+" years");
		}else if(this.year==a.year&&this.month>a.month) {
			if((a.month-this.month)==-1)
				System.out.println(a.Name+" is older by "+(this.month-a.month)+" month");
			else
				System.out.println(a.Name+" is older by "+(this.month-a.month)+" months");
		}else if(this.year==a.year&&this.month<a.month) {
			if((a.month-this.month)==1)
				System.out.println(this.Name+" is older by "+(a.month-this.month)+" month");
			else
				System.out.println(this.Name+" is older by "+(a.month-this.month)+" months");
		}else {
			System.out.println(this.Name+" and "+a.Name+" are of same age");
		}
	}
}

/*
	sharan
	03
	2001
	karan
	03
	2005

	sharan
	05
	2001
	karan
	03
	2001

*/