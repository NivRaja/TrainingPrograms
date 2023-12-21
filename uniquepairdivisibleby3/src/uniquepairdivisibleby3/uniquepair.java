package uniquepairdivisibleby3;

public class uniquepair {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])%3==0) 
				{
				System.out.println("("+arr[i]+" "+arr[j]+")");
				}
				
				
			}
		}

	}

}
