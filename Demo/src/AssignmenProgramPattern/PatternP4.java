/* 4) Print pattern 
1 
121 
12321 
1234321 
123454321 
1234321 
12321 
121 
1 

 */
package AssignmenProgramPattern;

public class PatternP4 {
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			for (int l = i - 1; l >= 1; l--) 
			{
				System.out.print(l);
			}

			System.out.println();
		}
		
		for (int i = 4; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			for (int l = i - 1; l >= 1; l--) 
			{
				System.out.print(l);
			}

			System.out.println();
		}
	}
}