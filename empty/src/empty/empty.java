package empty;

public class empty {

	public static int linearsearch (int[] ab,int key) {
		for(int i=0;i<ab.length;i++)
		{
			if(ab[i]==key)
			{
				return i;
			}
		}
		return-1;
	}
	public static void uniquePairDivisibleByThirty(int[] ab)
	{
		int count=0;
		for(int i=0;i<ab.length;i++)
		{
			for(int j=i+1;j<ab.length;j++) {
				if((ab[i]+ab[j])%30==0) {
					System.out.println(ab[i]+" "+ab[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void binarysearch(int[] ab, int key) {
		int start = 0, end=ab.length-1,mid = -1;
		while(start<=end)
		{
			mid = (start+end)/2;
						
			if(ab[mid]==key)
			{
				System.out.println("The key is found in position "+mid);
				return;
			}
			else if(ab[mid]>key)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		System.out.println("The key is not found");
	}
	
	public static void main(String[] args)
	{
		int ab[]= {10,20,30,40,50};
		int key=35;
		System.out.println(linearsearch(ab,key));	
		uniquePairDivisibleByThirty(ab);
		binarysearch(ab,key);
	}
}

