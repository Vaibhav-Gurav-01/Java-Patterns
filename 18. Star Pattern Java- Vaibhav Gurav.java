/*	*----
	-*---
	--*--
	---*-
	----*
*/
package patternprinting;

public class SymbolPatternTwo {
	
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}

	}

}
