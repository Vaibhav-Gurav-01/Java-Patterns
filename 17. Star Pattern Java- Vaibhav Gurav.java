/*	 o  x  x  x  x 
	 x  o  x  x  x 
	 x  x  o  x  x 
	 x  x  x  o  x 
	 x  x  x  x  o 
 */
package patternprinting;

public class SymbolPatternFive {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j)
					System.out.print(" o ");
				else
					System.out.print(" x ");
			}
			System.out.println();
		}

	}

}
