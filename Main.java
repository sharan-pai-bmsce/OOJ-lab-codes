import java.util.*;
class Player{
	int id;
	String name;
	int no;
	Player(int id,String name,int no) {
		this.id = id;
		this.name=name;
		this.no=no;
	}
	int[] scores = new int[100];
	void setScores() {
		Scanner input = new Scanner(System.in);
		System.out.println(this.no);
		for(int i=0;i<this.no;i++){
			scores[i]=input.nextInt();
		}
	}
	double calAvg() {
		int sum=0;
		for(int i=0;i<no;i++) {
			sum+=scores[i];
		}
		return (double)sum/no;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int num = input.nextInt();
		Player p1 = new Player(num,name,input.nextInt());
		input.nextLine();
		String name1 = input.nextLine();
		int num1 = input.nextInt();
		Player p2 = new Player(num1,name1,input.nextInt());
		System.out.println("Enter the scores of player-1 in "+p1.no+" matches");
		p1.setScores();
		System.out.println("Enter the scores of player-2 in "+p2.no+" mathches");
		p2.setScores();
		compare(p1.calAvg(),p2.calAvg());
	}

	public static void compare(double calAvg, double calAvg2) {
		if(calAvg>calAvg2){
			System.out.println("First Player has got the highest Average Score "+calAvg);
		}
		if(calAvg2>calAvg){
			System.out.println("Second Player has got the highest Average Score "+calAvg2);
		}
		if(calAvg==calAvg2){
			System.out.println("Both players have got the same Average Score "+calAvg);
		}
	}
}
