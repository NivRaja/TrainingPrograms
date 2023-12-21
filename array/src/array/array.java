package array;

public class array {
	
			public static int search(int arr[],int N,int x)
			{
				for(int i=0;i<N;i++)
				{
				
				if(arr[i]==x)
				
					
					return i;
				}
				return -1;
			}
			public static void main(String atrgs[])
			{
				int arr[]= {10,20,30,40};
				int x=40;
				int result=search(arr,arr.length,x);
				if(result==-1)
				{
						System.out.print("It is not found");
			}
				else 
				{
					System.out.print("It is found");
				
				}
				
			
				
			
		}
			
}
			