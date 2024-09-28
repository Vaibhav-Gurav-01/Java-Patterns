/*	1   
	0  0   
	1  1  1   
	0  0  0  0   
	1  1  1  1  1   
*/
package patternprinting;

public class NumberPatternSeven {
	public static void main(String[] args) {
		int row = 6;
		int column = 6;
		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < i; j++) // for column
			{
				System.out.print(i % 2);
				System.out.print("  ");
			}
			// column++;
			System.out.println(" ");
		}

	}

}
