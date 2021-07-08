import java.util.*;
class Remove_element
{
	public static void main(String[] args) {
		int range,pos=-1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		range = sc.nextInt();
		int arr[] = new int[range];
		for(int i=0;i<range;i++)
		{
			System.out.print("Enter the "+(i+1)+"th value: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element for removing: ");
		int num = sc.nextInt();

		for(int i=0;i<range;i++)
			if(arr[i]==num)
				pos=i;
		if(pos>=0)
		{
			for(int i=pos;i<range-1;i++)
				arr[i]=arr[i+1];
			System.out.print("The Result Array : ");
			for(int i=0;i<range-1;i++)
				System.out.print(" "+arr[i]+" ");
		}
		else
		{
			System.out.println("Element Not Found.");
		}
	}
}