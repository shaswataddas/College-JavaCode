class Employee
{
	String name;
	double salary;
	String setName()
	{
		name = "Shaswata Das";
		return name;
	}
	double setSalary()
	{
		salary = 25000;
		return salary;
	}
}

class Employee_main
{
	public static void main(String[] args) {
		Employee shas = new Employee();

		System.out.println("Name of the Employee: "+shas.setName());
		System.out.println("Salary of the Employee: "+shas.setSalary());
	}
}