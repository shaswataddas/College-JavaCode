import java.util.*;
class Student
{
	String name;
	int roll;
	int total;
	double mark;
	String status="Not Calculated.";
	Scanner sc = new Scanner(System.in);

	void initialVal()
	{
		System.out.println("Enter Student Name: ");
		name = sc.nextLine();
		System.out.println("Enter Student Roll No: ");
		roll = sc.nextInt();
		System.out.println("Enter Marks: 1. Java   2. OS   3. SoftwareEng.");
		int individual = 0;
		for (int j = 0;j<3;j++) {
			individual = sc.nextInt(); 
			mark = mark + individual;
			total = (int)mark;
		}
		mark = total/3;
		if(mark<40)
			status = "Fail";
		else
			status = "Pass";
	}
	void totalmarks()
	{
		System.out.println("You Scored : "+total);
	}
	void showGrade()
	{
		String grade;
		if(mark>=90)
			grade = "O";
		else if (mark>=80) 
			grade = "E";
		else if (mark>=70) 
			grade = "A";
		else if (mark>=60)
			grade = "B";
		else if (mark>=50) 
			grade = "C";
		else if (mark>=40)
			grade = "D";
		else
			grade = "F";
		System.out.println(name+",Your Overall Grade is: "+grade);
	}
}
class StudentGrade
{
	public static void main(String[] args) {
		int quary,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int totalStudent = sc.nextInt();
		Student[] s; 
		s = new Student[totalStudent];
		while (true)
		{
			System.out.println("\nOperations: \n1. Enter Data for a New Student.\n2. Show Grade of a Student.\n3.Show all students exam status.\n4.Exit\n");
			quary = sc.nextInt();
			if(quary==1 && i<totalStudent){
				s[i] = new Student();
				s[i].initialVal();
				System.out.println("\n        "+s[i].name+", Student mark is successfully Registered.");
				System.out.println("        IMPORTANT: Your Unique ID is: "+i+". Kindly Remember your Unique ID to show Grade.");
				i+=1;
			}
			else if(quary == 2){
				System.out.print("Enter your Unique ID: ");				
				int idnum = sc.nextInt();
				while(true){
					System.out.println("\n  *******************  ");
					System.out.print("Name: "+s[idnum].name+"        Student Roll: "+s[idnum].roll+"\n");
					System.out.println("\n  Operations:\n2.  Show Total Marks.\n3.  Show the overall Grade.\n4.  Display my Student details.\n5.  Logout.\n");
					System.out.print("Enter choice: ");
					quary = sc.nextInt();
					if (quary==2){
						s[idnum].totalmarks();
					}
					else if(quary==3){
						s[idnum].showGrade();
					}
					else if(quary==4){
						System.out.println("\n       Student details: ");
						System.out.println("\n Student Name: "+s[idnum].name);
						System.out.println("Student Roll No: "+s[idnum].roll);
						System.out.println("Total Marks: "+s[idnum].total);
						System.out.println("Exam Status: "+s[idnum].status);
					}
					else if(quary==5){
						System.out.println(s[idnum].name+" ,you are Successfully Logout from your Account.");
						break;
					}
					else{
						System.out.println("Invalid Input.");
					}
				}
			}
			else if(quary == 4){
				System.out.println("Thank You.");
				break;
			}
			else if(quary == 3){
				System.out.println("\n       All Student details: ");
				System.out.println("\n Student Name \t \t Exam Status \t \t Total Marks");
				for(int z = 0;z<=s.length;z++){
					try{
						System.out.println("\n "+ s[z].name+" \t \t "+s[z].status+" \t \t "+s[z].total);
					}
					catch(NullPointerException e){
						break;
					}
				}
			}
			else{
				System.out.println("Invalid Input.");
			}
		}
	}
}
