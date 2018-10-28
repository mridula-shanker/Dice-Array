/**
 * 
 * @author Mridula Shanker
 *Dice Array
 *Period 6
 */
public class DiceArray 
{
/**
 * Method to calculate the number of times each value rolled 
 * @param no parameter required
 * Prints the count for each value rolled (out of 1000 rolls)
 */
	public static void main(String[] args) 
	{
		Dice dice1 = new Dice(); // Creates dice1 object
		Dice dice2 = new Dice(); // Creates dice2 object
		
		int [] count = new int[13]; // Creates an array length of 13 to store count
		
		for (int i=0; i<1000;i++)  // Rolling dice 1000 times
		{
			int val1 = dice1.roll();  // Value for dice1
			int val2 = dice2.roll();  // Value for dice2
			int sum = val1 + val2;    // Sum of dice1 and dice2
			
			//Checks and counts how many times each value is rolled (2..12)
			if(sum==2)  
			{
				count[2] += 1;
			}
			if(sum==3)
			{
				count[3] += 1;
			}
			if(sum==4)
			{
				count[4] += 1;
			}
			if(sum==5)
			{
				count[5] += 1;
			}
			if(sum==6)
			{
				count[6] += 1;
			}
			if(sum==7)
			{
				count[7] += 1;
			}
			if(sum==8)
			{
				count[8] += 1;
			}
			if(sum==9)
			{
				count[9] += 1;
			}
			if(sum==10)
			{
				count[10] += 1;
			}
			if(sum==11)
			{
				count[11] += 1;
			}
			if(sum==12)
			{
				count[12] += 1;
			}
			
			
		}
		int totalRoll = 0; 
		for(int i=2;i<13;i++)  // goes through the values of the array and prints number of times value is rolled
		{
			System.out.println(i + " rolled " + count[i] + " times");
			totalRoll = totalRoll + count [i]; // total number of times dice rolled for re-verification
		}
			
		System.out.println("Total times rolled: " + totalRoll);
	}

}
