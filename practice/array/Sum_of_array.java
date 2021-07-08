import java.util.*;
class Sum_of_array
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum=0;
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter the "+(i+1)+"th number: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++)
			sum += arr[i];
		System.out.println("The Result is: "+sum);

	}
}