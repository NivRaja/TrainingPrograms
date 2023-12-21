package armstrongnumber;

import java.util.*;

public class arm {
    static boolean Isprime (int n)
	{
	    if(n<=1)
	    {
	    	return false;
	    }
	    for(int i=2;i<n/2;i++)
	    {
	    	if(n%i==0)
			return false;
	
	    }
		return true;
	}
    static int updateScore(int score)
    {
    	if(Isprime(score))
    		return score*2;
    	else
    		return score;
    }
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int player1score=500,player2score=500;
		int counter = 0;
		System.out.println("Player1:500 Player2:500");
		while(player1score>0 && player2score>0)
		{
			if(counter%2 == 0)
			{
				System.out.println("Enter the score to be reduced for player 1");
				int num = scan.nextInt();
				player1score -= num;
				player1score = updateScore(player1score);
				System.out.println("Player 1 new score = "+player1score);
			}
			else
			{
				System.out.println("Enter the score to be reduced for player 2");
				int num = scan.nextInt();
				player2score -= num;
				player2score = updateScore(player2score);
				System.out.println("Player 2 new score = "+player2score);
			}
			counter++;
		}
		if(player1score<0)
			System.out.println("Player 2 wins");
		else
			System.out.println("Player 1 wins");
	}
}


	
	

