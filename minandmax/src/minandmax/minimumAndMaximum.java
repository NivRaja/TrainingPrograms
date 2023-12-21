package minandmax;

public class minimumAndMaximum {

	static void min(int n[])
	{
		int res=n[0];
		for(int i=1;i<n.length;i++)
		{
		  res=Math.min(res, n[i]);
		}
		System.out.println ("minimum value in the array:"+res);
 	}
	static void secondmin(int n[])
	{
		int min=n[0];
		int second=Integer.MAX_VALUE;
		
		for(int i=1;i<n.length;i++)
		{
			if(n[i]<min)
			{
				second = min;
				min = n[i];
			}
			else if(n[i]<second)
			{
				second=n[i];
			}
		}
		System.out.println("second minimum:"+second);
		
	}
	static void max(int n[])
	{
		int res=n[0];
		for(int i=1;i<n.length;i++)
		{
			res=Math.max(res, n[i]);
		}
		System.out.println ("maximum value in the array:"+res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {12,34,9,8,65};
		min(n);
		secondmin(n);
		max(n);
		System.out.println(Integer.MAX_VALUE);
		
	

	}

}
