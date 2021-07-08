import java.util.*;
class Insert_element
{
	public static void main(String[] args) {
		int range;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range: ");
		range = sc.nextInt();
		int arr[] = new int[range+1];
		for(int i=0;i<range;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the position and the Element: ");
		int pos = sc.nextInt();
		int num = sc.nextInt();

		for(int i=range-1;i>=pos-1;i--)	//check edge elements
		{
			arr[i+1] = arr[i];
		}
		arr[pos-1]=num;
		System.out.print("Result: ");
		for(int i=0;i<range+1;i++)
			System.out.print(" "+arr[i]+" ");
	}
}
