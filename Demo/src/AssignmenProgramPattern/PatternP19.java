/* 19.	WAP to print following Pattern
	1 0 1 0 1
	0 1 0 1 0
	1 0 1 0 1
	0 1 0 1 0
	1 0 1 0 1
 */
package AssignmenProgramPattern;

public class PatternP19 
{
public static void main(String[] args)
{
	int r=5;
	for(int i=1;i<=r;i++)
	{
		int num;
		if(i%2==0)
		{
			num=0;
			for(int j=1;j<=r;j++)
			{
			System.out.print(num);
			num=(num==0)?1:0;
			}
		}
		else
		{
			num=1;
			for(int j=1;j<=r;j++)
			{
				System.out.print(num);
				num=(num==0)?1:0;
			}	
		}
		System.out.println();
	}
	}	
}