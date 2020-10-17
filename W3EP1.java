import java.util.Scanner;

public class W3EP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee e1 = new Employee(input.nextInt(),input.next(),input.nextInt(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		Employee e2 = new Employee(input.nextInt(),input.next(),input.nextInt(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		Employee e3 = new Employee(input.nextInt(),input.next(),input.nextInt(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}

class Employee{
	private int id;
	private String name;
	private int hrs;
	private double basic;
	private double da;
	private double hra;
	private double it;
	private double gross;
	
	Employee(int id, String name, int hrs, double basic, double da, double hra, double it) {
		this.id = id;
		this.name = name;
		this.hrs = hrs;
		this.basic = basic;
		this.da = da/100;
		this.hra = hra/100;
		this.it = it/100;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHrs() {
		return hrs;
	}

	public double getBasic() {
		return basic;
	}

	public double getDa() {
		return da;
	}

	public double getHra() {
		return hra;
	}

	public double getIt() {
		return it;
	}

	public double getGross() {
		return gross;
	}

	public double calSalary() {
		this.gross=basic+(basic*hra)+(basic*da)-(basic*it);
		if(this.hrs==200) {
			return getGross();
		}else if(this.hrs>200) {
			return getGross()+((this.hrs-200)*100);
		}else {
			return getGross()-((200-this.hrs)*100);
		}
	}
	
	public String toString() {
		return "Name: "+getName()+"\nID: "+getId()+"\nNo. of hrs: "+getHrs()+"\nGross Salary: "+calSalary()+"\n";
		
	}
}

/*
12
sharan
205
50000
5
4
12.5
12
karan
195
50000
5
4
12.5
12
shashank
200
50000
5
4
12.5

*/
