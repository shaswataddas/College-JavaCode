import java.util.*;
class Bank
{
	String owner;
	int id;
	String type;
	float balance;
	Scanner sc = new Scanner(System.in);

	void initialVal(int idnum)
	{
		System.out.println("Enter Name: ");
		owner = sc.nextLine();
		id = idnum;
		System.out.println("1: Savings         2:Current ");
		System.out.println("Enter Account Type: ");
		int temp = sc.nextInt();
		if(temp==1)
			type = "Savings";
		else
			type = "Current";
		balance = 0;
	}
	void deposite()
	{
		System.out.println("Enter the amount to deposite: ");
		int temp = sc.nextInt();
		balance = balance + temp;
		System.out.println("Successfully Deposited. Current Balance: "+balance);
	}
	void withdraw()
	{
		System.out.println("Enter the amount to withdraw: ");
		int temp = sc.nextInt();
		if(temp<=balance)
			balance = balance - temp;
		else
			System.out.println("You do not have sufficient balance. ");
		System.out.println("Your Current Balance is: "+balance);
	}
}
class Bank_main
{
	public static void main(String[] args) {
		int quary,i=0;
		Scanner sc = new Scanner(System.in);
		Bank[] b; 
		b = new Bank[10];
		while (true)
		{
			System.out.println("\nOperations: \n1. Create a new Bank Account.\n2. Already have an Account.\n3.Exit\n");
			quary = sc.nextInt();
			if(quary==1 && i<10){
				b[i] = new Bank();
				b[i].initialVal(i);
				System.out.println("\n        "+b[i].owner+", your account is successfully created.");
				System.out.println("        IMPORTANT: Your account ID is: "+i+". Kindly Remember your Account ID.");
				i+=1;
			}
			else if(quary == 2){
				System.out.print("Enter your Account ID: ");				
				int idnum = sc.nextInt();
				while(true){
					System.out.println("\n  *******************  ");
					System.out.print("Name: "+b[idnum].owner+"        Account ID: "+b[idnum].id+"\n");
					System.out.println("\n  Operations:\n2.  Deposite Money.\n3.  Withdraw Money.\n4.  Display my account details.\n5.  Logout.\n");
					System.out.print("Enter choice: ");
					quary = sc.nextInt();
					if (quary==2){
						b[idnum].deposite();
					}
					else if(quary==3){
						b[idnum].withdraw();
					}
					else if(quary==4){
						System.out.println("\n       Account details: ");
						System.out.println("\nAccount Holder Name: "+b[idnum].owner);
						System.out.println("Account Number: "+b[idnum].id);
						System.out.println("Type of the Account: "+b[idnum].type);
						System.out.println("Your Current Balance is: "+b[idnum].balance);
					}
					else if(quary==5){
						System.out.println(b[idnum].owner+" ,you are Successfully Logout from your Account.");
						break;
					}
					else{
						System.out.println("Invalid Input.");
					}
				}
			}
			else if(quary == 3){
				System.out.println("Thank You.");
				break;
			}
			else{
				System.out.println("Invalid Input.");
			}
		}
	}
}