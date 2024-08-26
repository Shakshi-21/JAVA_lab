//Create a class called Bank_Account with following data member and member function
a) Account_Holder_Name, Account_Number, Account_Type (S for savings, C for current), balance
b) withdraw_money () and deposit_money with proper prototype.

class BankAccount
{
	String AccountHolderName, AccountNumber;
	char AccountType;
	double balance;
	BankAccount(String name, String number, char type, double balance)
	{
		this.AccountHolderName=name;
		this.AccountNumber=number;
		this.AccountType=type;
		this.balance=balance;
	}
	void DepositMoney(double amount)
	{
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited Amount: "+amount);
			System.out.println("New Balance : "+balance);
		}
		else{
			System.out.println("Invalid Amount");
		}
	}
	void WithdrawMoney(double amount)
	{
		if(amount>0 && amount<=balance){
			balance-=amount;
			System.out.println("Withdrew Amount: "+amount);
			System.out.println("Remaining Balance : "+balance);
		}
		else{
			System.out.println("Invalid Amount");
		}
	}
	void display()
	{
		System.out.println("Account Holder Name: "+AccountHolderName+"\nAccount number: "+AccountNumber+"\nAccount Type: "+(AccountType=='S'?"Savings":"Current")+"\nBalance: "+balance);
	}
}
class Bank
{
	public static void main(String args[])
	{
		System.out.println("--------------------------------------");
		BankAccount obj1=new BankAccount("Tumpa Bhattacharya", "AS234567", 'S', 45000);
		obj1.display();
		obj1.DepositMoney(8000);
		obj1.WithdrawMoney(1000);
		System.out.println("--------------------------------------");
		BankAccount obj2=new BankAccount("Shakshi Bhattacharya", "PQ678902", 'C', 15000);
		obj2.display();
		obj2.DepositMoney(3000);
		obj2.WithdrawMoney(500);
	}
}

