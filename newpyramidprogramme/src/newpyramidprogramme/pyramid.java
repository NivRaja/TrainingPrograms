package newpyramidprogramme;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=6;int k=0;
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<(row-i)*2;j++)
			{
				System.out.print(" ");
			}
			
				for(k=0;k!=2*i-1;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		
		
		

			 
	}
}

			    
