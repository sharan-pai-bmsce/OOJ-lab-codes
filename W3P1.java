import java.util.*;
public class W3P1 {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		Book[] b=new Book[num];
		for(int i=0;i<num;i++) {
			input.nextLine();
			b[i]=new Book(input.nextLine(),input.nextLine(),input.nextDouble(),input.nextInt());
		}
		for(int i=0;i<num;i++) {
			System.out.println("\n**Book Description**\n"+b[i].toString());
		}

	}

}

class Book{
	private String name;
	private String author;
	private double price;
	private int numPages;
	
	Book(String name,String author,double price,int num){
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=num;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getNumPages() {
		return numPages;
	}
	public String toString() {
		return "Name of the Book: "+getName()+"\nName of the author: "+getAuthor()+"\nPrice of the book: "+getPrice()+"\nNo. of pages: "+getNumPages()+"\n";
	}
	
}

/*
4
Game of thrones
Greorge RR martin
1200.00
900
The Hunger Games
Suzzane Collins
1400.00
450
Divergent
Veronica Roth
1300.00
600
Harry Potter
JK Rowling
1200.00
632

*/
