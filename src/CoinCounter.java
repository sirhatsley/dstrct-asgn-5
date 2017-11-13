/**
Contains static methods that count coins.


@author Tim Callies, Jacob Wiggins


*/

public class CoinCounter
{

    //Note, you may NOT add any data fields.

	/**
	prints all combinations of the given denominations of coins that add up to the total given value.

	@param denominations  an array of integers that represents the values of different denominations of coins.
	@param total  the value that a combination of coins should add up to.

	*/
	public static void makeChange(int[] denominations, int total)
	{
		makeChange(denominations,total,new int[denominations.length],0);
	}//makeChange

	private static void makeChange(int[] denominations, int total, int[] counts,  int start)
	{
		if (total==0)
		{
			for(int i=0; i<counts.length;i++)
			{
				//Prints out every combo where the total is 0
				System.out.print(counts[i]+" "+denominations[i]+"-coins ");
			}
			System.out.println("");
			return;
		}
		if (start>=denominations.length){return;}
		if (total<0) {return;}
		
		makeChange(denominations,total,counts,start+1);
		int[] newCounts=counts.clone();
		newCounts[start]++;
		makeChange(denominations,total-denominations[start],newCounts,start);
	}
	
	/**
	returns the least amount of coins of the given denominations that add up to the total given value.

	@param denominations  an array of integers that represents the values of different denominations of coins
	@param total  the value that a combination of coins should add up to.
	@return the minimum number of coins needed to make total with the given denominations or -1 if it's not possible


	*/
	public static int makeChangeMin(int[] denominations, int total)
	{
		int output = 0;
		if (total<0){return 999999;}
		if (total==0){return 0;}
		output = makeChangeMin(denominations, total-denominations[0]);
		for(int i=1; i<denominations.length; i++)
		{
			//Finds the min of all denominations
			output=Math.min(output, makeChangeMin(denominations, total-denominations[i]));
		}
		return output+1;
	}//makeChangeMin
}