/*	1  2  3  4  5   
	1  2  3  4  5   
	1  2  3  4  5   
	1  2  3  4  5   
	1  2  3  4  5   
*/
package patternprinting;

public class NumberPatternOne {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;

		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < column; j++) // for column
			{
				System.out.print(j + 1);
				System.out.print("  ");
			}
			System.out.println(" ");
		}
	}
}
