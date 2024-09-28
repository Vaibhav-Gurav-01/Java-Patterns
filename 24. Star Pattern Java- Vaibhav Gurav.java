/*	1  1  1  1  1  
	2  2  2  2  2  
	3  3  3  3  3  
	4  4  4  4  4  
	5  5  5  5  5  

*/
package patternprinting;

public class NumberPatternTwo {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;

		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < column; j++) // for column
			{
				System.out.print(i + 1);
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}