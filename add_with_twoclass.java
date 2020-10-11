import java.util.*;

class ADDNum
{
	int a,b,c;
	Scanner sc = new Scanner(System.in);

	void add(){
		System.out.print("Enter the 1st Number: ");
		a = sc.nextInt();
		System.out.print("Enter the 2nd Number: ");
		b = sc.nextInt();
		c = a+b;
	}
	void print(){
		System.out.println("Sum is" +c);
	}
}

class add_with_twoclass
{
	public static void main(String[] args) {
		ADDNum N = new ADDNum();
		N.add();
		N.print();
	}
}