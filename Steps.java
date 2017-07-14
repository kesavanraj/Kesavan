package string;
import java.util.Scanner;

public class Steps 
{
	public static void main(String[] args) 
  {
		int numInput;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number");
		numInput = read.nextInt();
		int firstStep[] = new int[numInput];
		int lastStep[] = new int[numInput];
		for (int count = 0; count < numInput; count++) 
    {
			firstStep[count] = read.nextInt();
			lastStep[count] = read.nextInt();
		}
		read.close();
		for (int count = 0; count < numInput; count++) 
		{
			
      
			int stepsToTravel = lastStep[count] - firstStep[count];
			if (stepsToTravel > -1)
			{
			
				int n = 1;
				int countSteps = 0;
				if (stepsToTravel > 1) 
				{
					String output = "1 1";
					countSteps = countSteps + 2;
					stepsToTravel = stepsToTravel - 2;
					while (stepsToTravel > 0) 
          {
						
            	if (stepsToTravel >= (2 * n + 2)) 
              {
							countSteps = countSteps + 2;
							
							stepsToTravel = stepsToTravel - (2 * n) - 2;
							n++;
						} 
            	else if (stepsToTravel == (2 * n + 1))
            {
							countSteps = countSteps + 2;
							
							stepsToTravel = stepsToTravel - (2 * n) - 1;
						} 
            	else if (stepsToTravel == (2 * n))
            {
							{
								if (n == 1) 
                {
									countSteps = countSteps + 1;
									output = output.concat(" " + (2 * n));
									stepsToTravel = stepsToTravel - 2;
									continue;
								}
								countSteps = countSteps + 2;
								
							}

						}
            	else 
            {
							countSteps++;
							
							stepsToTravel = 0;
						}
					}
					
				}
				else if (stepsToTravel == 1) 
        {
					countSteps++;
				}

				System.out.println(countSteps);
			} 
			else 
			{
				System.out.println("Invalid input");
			}
		}
	}
}
