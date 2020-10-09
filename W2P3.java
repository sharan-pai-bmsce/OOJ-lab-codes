import java.util.*;

class Book{
	int id=0;
	String title=null;
	int noOfPages=0;
	String year=null;
	String author=null;
	double price=0;
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Book Id: "+this.id);
		System.out.println("Book Name: "+this.title);
		System.out.println("Book noOfPages: "+this.noOfPages);
		System.out.println("Year of publishing: "+this.year);
		System.out.println("Book Author: "+this.author);
		System.out.println("Book Price: "+this.price);
	}
	
	public static void AuthorDisplay(Book[] b,String author) {
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(b[i].author.equals(author)) {
				b[i].display();
			}
		}
	}
	
	public static void YearDisplay(Book[] b) {
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(b[i].year.equals("2020")) {
				b[i].display();
			}
		}
	}
	
	public static void leastPages(Book[] b) {
		int small = b[0].noOfPages;
		int value;
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(small>b[i].noOfPages) {
				small = b[i].noOfPages;
			}
		}
		for(int i=0;i<b.length;i++) {
			if(small==b[i].noOfPages) {
				b[i].display();
			}
		}
		
	}
}
public class W2P3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book[] b = new Book[3];
		for(int i=0;i<b.length;i++) {
			b[i] = new Book();
			//System.out.println("Enter the Id");
			b[i].setId(input.nextInt());
			input.nextLine();
			//System.out.println("Enter the title");
			b[i].setTitle(input.nextLine());
			//System.out.println("Enter the Author");
			b[i].setAuthor(input.nextLine());
			//System.out.println("Enter the Year of publishing");
			b[i].setYear(input.nextLine());
			//System.out.println("Enter the No. of pages");
			b[i].setNoOfPages(input.nextInt());
			//System.out.println("Enter the Price of the book");
			b[i].setPrice(input.nextDouble());
		}
		System.out.println("\nShowing display based on year\n");
		Book.YearDisplay(b);
		System.out.println("\nShowing display based on least no. of pages\n");
		Book.leastPages(b);
		System.out.println("\nShowing display based on author-name (Suzzane Collins)\n");
		Book.AuthorDisplay(b, "Suzzane Collins");
	}

}
