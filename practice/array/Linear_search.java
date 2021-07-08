import java.util.*;
class Linear_search
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range,pos=-1;
		System.out.print("Enter Range: ");
		range = sc.nextInt();
		int arr[] = new int[range];
		for(int i=0;i<range;i++)
		{
			System.out.print("Enter the "+(i+1)+"th value: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Search Element: ");
		int search = sc.nextInt();

		for(int i=0;i<range;i++)
		{
			if(arr[i]==search)
				pos = i;
		}
		if(pos<0)
			System.out.println("Search Element Not Found.");
		else
			System.out.println("The Search Element is Present in - "+(pos+1));
	}
}