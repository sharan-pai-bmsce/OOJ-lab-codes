import java.util.Scanner;

class Account{
	String name;
	int accountNo;
	String accountType;
	double balance;
	Account(String name,int accountNo,String accountType,double balance){
		this.name = name;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
	}
	void DisplayStatus() {
		System.out.println("******"+this.accountType+"*******");
		System.out.println("Name: "+this.name);
		System.out.println("Account no.:  "+this.accountNo);
		System.out.println("Account Type:  "+this.accountType);
		System.out.println("Balance: "+this.balance);
	}
}

class SavAcct extends Account{
	double depositAmount;
	double Withdrawmount;
	SavAcct(String name,int accountNo,String accountType,double balance){
		super(name,accountNo,accountType,balance);
	}
	static Scanner input = new Scanner(System.in);
	private void checkBalance() {
		if(balance<0) {
			System.out.println("Transaction is not possible. Balance becomes less than zero");
			balance+=Withdrawmount;
			Withdrawmount=0;
			Withdraw();
		}
	}
	void CalInterest() {
		System.out.println("Interest To Be added");
		System.out.println("Annual rate of interest: 4%");
		System.out.println("Enter the tenure in terms of year");
		int tenure = input.nextInt();
		balance = balance*Math.pow(1.04, tenure); 
	}
	void Deposit() {
		System.out.println("Enter the Deposit amount");
		depositAmount = input.nextDouble();
		balance+=depositAmount;
	}
	void Withdraw() {
		System.out.println("Enter the Withdrawal amount");
		Withdrawmount = input.nextDouble();
		balance-=Withdrawmount;
		checkBalance();
		System.out.println("Withdraw amount = "+Withdrawmount);
	}
}

class CurrAcct extends Account{
	double minBalance = 1000;
	double depositAmount;
	double Withdrawmount;
	static Scanner input = new Scanner(System.in);
	CurrAcct(String name,int accountNo,String accountType,double balance){
		super(name,accountNo,accountType,balance);
	}
	private void checkBalance() {
		if(balance<minBalance) {
			System.out.println("Transaction is not possible. Balance becomes less than minimum balance.");
			balance+=Withdrawmount;
			System.out.println("Do u still want to do the transaction with added service charges");
			String ans = input.next();
			if(ans.toLowerCase().equals("yes")) {
				balance-=(Withdrawmount+(0.05*Withdrawmount)+1000);
				System.out.println("ALERT: Negative balance.\nService Charge added: "+(0.05*Withdrawmount));
			}else {
				Withdrawmount = 0;
			}
		}
	}
	void Deposit() {
		System.out.println("Enter the Deposit amount");
		depositAmount = input.nextDouble();
		balance+=depositAmount;
	}
	void Withdraw() {
		System.out.println("Enter the Withdrawal amount");
		Withdrawmount = input.nextDouble();
		balance-=Withdrawmount;
		checkBalance();
		System.out.println("withdraw amount = "+Withdrawmount);
	}
}

public class Bank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = in.next();
		System.out.println("Enter the account no.");
		int num = in.nextInt();
		int i=0;
		while(i<2) {
		System.out.println("Enter the account type\ncurr-current acc.\nsav-savings acct.");
		String type = in.next();
		if(type.equals("curr")) {
			double bal = in.nextInt();
			CurrAcct c1 = new CurrAcct(name,num,"Current Account",bal);
			c1.DisplayStatus();
			c1.Deposit();
			c1.DisplayStatus();
			c1.Withdraw();
			c1.DisplayStatus();
		}else if(type.toLowerCase().equals("sav")) {
			double bal = in.nextInt();
			SavAcct s1 = new SavAcct(name,num,"Savings Account",bal);
			s1.DisplayStatus();
			s1.Deposit();
			s1.DisplayStatus();
			s1.Withdraw();
			s1.DisplayStatus();
			s1.CalInterest();
			s1.DisplayStatus();
		}
		i++;
		}
		in.close();
	}
}
