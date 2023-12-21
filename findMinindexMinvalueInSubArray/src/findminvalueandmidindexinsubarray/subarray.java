package findminvalueandmidindexinsubarray;

public class subarray {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		int arr[]= {19,10,37,48,6,25,72};
		for(int i=0;i<arr.length;i++)
		{
			int minindex=i;
			int minvalue=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[j]<minvalue)
				{
					minvalue=arr[j];
					minindex=j;
					
				}
				
			}
			
		}
	
	}

}
