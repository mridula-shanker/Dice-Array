
public class test 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int [] count = new int[11];
		
		for (int i=0; i<1000;i++)
		{
			int val1 = dice1.roll();
			int val2 = dice2.roll();
			int sum = val1 + val2;
			
			if(sum==2)
			{
				count[0] += 1;
			}
			if(sum==3)
			{
				count[1] += 1;
			}
			if(sum==4)
			{
				count[2] += 1;
			}
			if(sum==5)
			{
				count[3] += 1;
			}
			if(sum==6)
			{
				count[4] += 1;
			}
			if(sum==7)
			{
				count[5] += 1;
			}
			if(sum==8)
			{
				count[6] += 1;
			}
			if(sum==9)
			{
				count[7] += 1;
			}
			if(sum==10)
			{
				count[8] += 1;
			}
			if(sum==11)
			{
				count[9] += 1;
			}
			if(sum==12)
			{
				count[10] += 1;
			}
			
			
		}
		int totalRoll = 0;
		for(int i=0;i<11;i++)
		{
			System.out.println(i+2 + " rolled " + count[i] + " times");
			totalRoll = totalRoll + count [i];
		}
			
		System.out.println("Total times rolled: " + totalRoll);
	}

}
