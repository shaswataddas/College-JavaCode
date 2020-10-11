import java.util.*;

class Calculator
{
	double num1;
	double num2;

	double add()
	{
		return num1+num2;
	}
	double sub()
	{
		if (num1>num2) {
			return num1 - num2;
		}
		else{
			return num2 - num1;
		}
	}
	double multi()
	{
		return num1*num2;
	}
	double div()
	{
		return num1/num2;
	}
	void setval()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st number: ");
		num1 = sc.nextDouble();
		System.out.print("Enter the 2nd number: ");
		num2 = sc.nextDouble();
	}
}

class Calculator_main
{
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.setval();

		System.out.println("Addition : "+cal.add());
		System.out.println("Substraction : "+cal.sub());
		System.out.println("Multiplication : "+cal.multi());
		System.out.println("Division : "+cal.div());
	}
}