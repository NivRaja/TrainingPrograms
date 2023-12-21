package countdigits;

public class count {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int temp2 = 153;
		
			while(temp2>0)
			{
				count++;
				temp2/=10;
			}
			
			
		
		System.out.print(count);
		
		
	}

}
