/*	1   
	2  3   
	3  4  5   
	4  5  6  7   
	5  6  7  8  9	
*/
package patternprinting;

public class NumberPatternSix {
	public static void main(String[] args) {
		int row = 6;
		int column = 6;
		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < i; j++) // for column
			{
				System.out.print(i + j);
				System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

}
