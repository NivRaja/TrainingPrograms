package printallpairsinarray;

public class printallpairs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5};
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr.length;j++)
    	   {
    		   System.out.println("("+arr[i]+" "+ arr[j]+ ")");
    	   }
       }
	}

}
