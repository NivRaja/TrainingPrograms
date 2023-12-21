package arrayreverse;

public class arrayreverse {

	public static void main(String args[])
	{
		int count=0;
		int arr[]= {10,20,30,40,80,1};
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			count++;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.print(count);
	}
}
