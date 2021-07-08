import java.util.*;
class Find_duplicate
{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,2,5,4,6,2,1,5};
		int track[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+track[i]+" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && track[j]!=1){
					track[j]=1;
					System.out.println("Duplicate Element : "+arr[i]+" position: "+(j+1)+" and "+(i+1));
				}
			}
		}
	}
}