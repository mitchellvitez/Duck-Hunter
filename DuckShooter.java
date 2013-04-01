/**
 * Basic underlying code by @author Evan Chavis
 * Touchups and output/interface by @author Mitchell Vitez
 * DuckHunter: Using arbitrary trial and shooter numbers, find how many targets are hit in those trials
 */

import java.util.ArrayList;
import java.util.Random;

public class DuckShooter
{
  static int trialNumber = 1000000;
	static int shooterNumber = 10;
	
	static boolean showLabels = true;
	static boolean showPercentages = false;
	static boolean showAverage = true;
	static boolean showTrials = true;
	static boolean showShooters = true;
	static boolean showHalfPercentage = true;
	
	private static ArrayList<Integer> randomTen;
	
	public static void main(String[] args)
	{		
		double count= 0;
		int oneCount=0, twoCount=0, threeCount=0, fourCount=0, fiveCount=0, 
				sixCount=0, sevenCount=0, eightCount=0, nineCount=0, tenCount=0;

		for(int y = trialNumber; y>0; y--)
		{
			ArrayList<Integer> myList = CreateTen();
			count++;
			switch(myList.size())
			{
			case 1:
				oneCount++;
				break;
			case 2:
				twoCount++;
				break;
			case 3:
				threeCount++;
				break;
			case 4:
				fourCount ++;
				break;
			case 5:
				fiveCount++;
				break;
			case 6:
				sixCount++;
				break;
			case 7:
				sevenCount++;
				break;
			case 8:
				eightCount++;
				break;
			case 9:
				nineCount++;
				break;
			case 10:
				tenCount++;
				break;
			}
		}	
		
		if(showLabels==true)
		{
			System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");
		}
		
		System.out.println(oneCount +"\t"+ twoCount +"\t"+ threeCount +"\t"+fourCount +"\t"+
				fiveCount +"\t"+ sixCount +"\t"+ sevenCount +"\t"+ eightCount +"\t"+ nineCount +"\t"+ tenCount);
		
		if (showPercentages == true) 
		{
			System.out.println(100.0*oneCount/trialNumber +"%\t"+ 100.0*twoCount/trialNumber +"%\t"+ 100.0*threeCount/trialNumber +"%\t"+100.0*fourCount/trialNumber +"%\t"+
				100.0*fiveCount/trialNumber +"%\t"+ 100.0*sixCount/trialNumber +"%\t"+ 100.0*sevenCount/trialNumber +"%\t"+ 100.0*eightCount/trialNumber +"%\t"+ 100.0*nineCount/trialNumber +"%\t"+ 100.0*tenCount/trialNumber + "%");
		}
		
		if(showAverage==true)
		{
			System.out.println("\nAverage: " + (oneCount*1+twoCount*2+threeCount*3+fourCount*4+fiveCount*5+sixCount*6+sevenCount*7+eightCount*8+nineCount*9+tenCount*10)/(count*1.0));
		}
		
		if(showTrials==true)
		{
			System.out.println("Trials: " + trialNumber );
		}
		
		if(showShooters==true)
		{
			System.out.println("Shooters: " + shooterNumber );
		}
		
		if(showHalfPercentage==true)
		{
			System.out.println("\n"+(100.0*(sixCount+sevenCount+eightCount+nineCount+tenCount)/trialNumber)+"% of the time, more than 1/2 the ducks were hit.");
		}
	}
	
	public static ArrayList<Integer> CreateTen()
	{
		randomTen = new ArrayList<Integer>();
		Random randomDigitMaker = new Random();
		
		for(int i=0; i< shooterNumber; i++)
		{
			int newDigit = randomDigitMaker.nextInt(10);
			if(randomTen.contains(newDigit)==false)
			{
				randomTen.add(newDigit);
			}
		}
		return randomTen;
	}
}
