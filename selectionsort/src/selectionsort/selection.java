package selectionsort;

public class selection {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,30,40,50,80,1};
		for(int i=0;i<arr.length-1;i++)
		{	
			
			int minindex=i;
			 for(int j=i+1;j<arr.length;j++)
			{
				 if(arr[j]<arr[minindex])
				 {
				minindex=j;	
				 }
			}
			 int temp=arr[minindex];
			 arr[minindex]=arr[i];
			 arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

}
	
}
