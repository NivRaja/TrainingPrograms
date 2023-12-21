

package sortingtechinque;

public class bubblesort {
	static int[] bubble(int arr[])
	{

		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}			
			}
			System.out.println("After Iteration "+(i+1));
			printArr(arr);	
		}
		return arr;
	}
	static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int arr[]= {10,67,98,65,45,20};
		int brr[]=bubble(arr);
		System.out.println("result");
		printArr(brr);
		
		
		
	}

}
