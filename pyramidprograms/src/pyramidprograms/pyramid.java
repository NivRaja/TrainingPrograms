package pyramidprograms;

public class pyramid {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,k,row=5;
       for(i=0;i<row;i++)
       {
    	 for(k=0;k<row-i;k++)
    	 {
    		 System.out.print(" ");
    	 }
    	   for(j=0;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	 
    	   System.out.println();
       }
	}

}
