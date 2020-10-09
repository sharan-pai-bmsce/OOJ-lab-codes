import java.util.Scanner;

class Student{
	int usn;
	String name;
	int[] credits = new int[6];
	int[] marks = new int[6];
	
	void setUsn(int usn) {
		this.usn = usn;
	}
	void setName(String name) {
		this.name=name;
	}
	void setCredits(int[] credits) {
		for(int i=0;i<this.credits.length;i++) {
			this.credits[i] = credits[i];
		}
	}
	void setMarks(int[] Marks) {
		for(int i=0;i<this.marks.length;i++) {
			this.marks[i] = Marks[i];
		}
	}
	
	double calSGPA() {
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=90) {
				sum+=10;
			}else if(marks[i]>=80) {
				sum+=9;
			}else if(marks[i]>=70) {
				sum+=8;
			}else if(marks[i]>=60) {
				sum+=7;
			}else if(marks[i]>=50) {
				sum+=6;
			}else if(marks[i]>=40) {
				sum+=5;
			}else {
				sum+=4;
			}
		}
		return  (double)sum/marks.length;
	}
}

public class Usn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the name");
		s1.setName(input.nextLine());
		System.out.println("Enter the USN");
		s1.setUsn(input.nextInt());
		int a[]=new int[6];
		int b[]=new int[6];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the credits and marks\n");
			a[i] = input.nextInt();
			b[i] = input.nextInt();
		}
		s1.setCredits(a);
		s1.setMarks(b);
		double result = s1.calSGPA();
		System.out.println(result);
		input.close();
	}

}
