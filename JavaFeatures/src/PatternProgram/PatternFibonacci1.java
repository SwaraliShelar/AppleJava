/*Print the fibonacci series

0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 
*/
package PatternProgram;

public class PatternFibonacci1 
{
	public static void main(String[] args)
	{
		int a = 0, b = 1, c;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}
}
