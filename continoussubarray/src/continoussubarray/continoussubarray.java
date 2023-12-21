package continoussubarray;

public class continoussubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n[]= {1,2,3,4,5};
        
		for(int i=0;i<n.length;i++)
		{
			for(int j=i;j<n.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+n[k];
				}
				if(sum%5==0)
				{
					System.out.println(sum);
					System.out.println("start index:"+i);
					System.out.println("end index:"+j);
				}
			}
		}		
		
	}

}
