/* 		*   
		*  *   
		*  *  *   
		*  *  *  *   
		*  *  *  *  *   
*/
package patternprinting;

public class StarPatternFive {
	public static void main(String[] args) {
		int row = 5;
		int column = 1;
		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < column; j++) // for column
			{
				System.out.print("*");
				System.out.print("  ");
			}
			column++;
			System.out.println(" ");
		}

	}

}
 