/*	X0000
	0X000
	00X00
	000X0
	0000X
*/
package patternprinting;

public class SymbolPatternThree {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j)
					System.out.print("X");
				System.out.print("0");
			}
			System.out.println();
		}
	}

}