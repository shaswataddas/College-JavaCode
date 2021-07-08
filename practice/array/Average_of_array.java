import java.util.*;
class Average_of_array
{
	public static void main(String[] args) {
		int sum=0,num;
		double ave=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter the "+(i+1)+"th number: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++)
			sum += arr[i];
		ave = (double)sum/(double)num;
		System.out.println("Average: "+ave);
	}
}