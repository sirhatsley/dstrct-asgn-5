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
		
		//TEST 2:
		denominations = new int[] {2,4,6};
		CoinCounter.makeChange(denominations, 50);
		System.out.println(CoinCounter.makeChangeMin(denominations, 50));
		
		//TEST 2:
		denominations = new int[] {1,3,7};
		CoinCounter.makeChange(denominations, 8);
		System.out.println(CoinCounter.makeChangeMin(denominations, 50));
	}//main
	
	
}//class