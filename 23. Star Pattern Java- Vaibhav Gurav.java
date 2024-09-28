/*	1   
	1  2   
	1  2  3   
	1  2  3  4   
	1  2  3  4  5  
 */
package patternprinting;

public class NumberPatternFive {
	public static void main(String[] args) {
		int row = 5;
		int column = 1;
		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < column; j++) // for column
			{
				System.out.print(j + 1);
				System.out.print("  ");
			}
			column++;
			System.out.println(" ");
		}

	}

}
 