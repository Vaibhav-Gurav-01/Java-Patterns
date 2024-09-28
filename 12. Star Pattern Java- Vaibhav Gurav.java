/*	  X  
	  X  
	XXXXX
	  X  
	  X  
*/
package patternprinting;

public class SymbolPatternOne {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 2 || j == 2)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
