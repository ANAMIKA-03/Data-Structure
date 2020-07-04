package insertion;
import java.util.*;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Functions f =new Functions();
     		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the size of array");
			int n=sc.nextInt();
			int[] arr = new int[n];
			System.out.println("enter "+n+" elements in array");
			for(int i=0;i<n;i++)
			  arr[i]=sc.nextInt();
			
			  f.InsertionSort(arr);
			  System.out.println("sorted array is :");
			  for(int i=0;i<n;i++)
			  System.out.println(arr[i]);
			  sc.close();
		}

	}

class Functions
{
	void InsertionSort(int arr[])
	{
		int N=arr.length;
		int i,j,temp;
		for(i=1;i<N;i++)
		{
			j=i;
			temp=arr[i];
			while(j>0&&temp<arr[j-1])
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}
}