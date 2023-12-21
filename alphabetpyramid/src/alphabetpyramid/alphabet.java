package alphabetpyramid;

public class alphabet {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char startch='A'; char ch='Z';
		for(int i=1;i<=(ch-'A'+1);i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(startch);
			}
			startch++;
			System.out.println();
		}
		
		
	}

}
