/**

Tests the CoinCounter class methods

@author Tim Callies, Jabob Wiggins

*/
public class CoinCounterDriver{
	
	public static void main(String[] args){
		
		//TEST 1: Assignment Example 
		int[] denominations = {25,10,5};
		CoinCounter.makeChange(denominations, 50);
		System.out.println(CoinCounter.makeChangeMin(denominations, 50));
		denominations = new int[] {2,4,6};
		CoinCounter.makeChange(denominations, 50);
		System.out.println(CoinCounter.makeChangeMin(denominations, 50));
		
		
	}//main
	
	
}//class