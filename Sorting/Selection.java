package selection;
import java.util.*;

public class Selection {

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
			
			  f.SelectionSort(arr, n);
			  System.out.println("sorted array is :");
			  for(int i=0;i<n;i++)
			  System.out.println(arr[i]);
			  sc.close();
		}

	}

class Functions
{
	void swap(int arr[],int i,int j)
	{ 
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	int minPos(int arr[],int start,int stop)
	{
		int minPosition=start;
		int minElement=arr[start];
		for(int i=start+1;i<stop;i++)
		if(arr[i]<minElement)
		{
			minElement=arr[i];
			minPosition=i;
		}
		return minPosition;
	}	
		void SelectionSort(int arr[],int size)
	{
		int minPosofElement=0;	
		for(int i=0;i<size-1;++i)
		{
			minPosofElement=minPos(arr,i,size);
			swap(arr,i,minPosofElement);
		}
	}
}
