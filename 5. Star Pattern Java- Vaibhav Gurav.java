/*	54321
	5432
	543
	54
	5 
*/
package patternprinting;

public class NumberPatternEight {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int j = 0; j < row; j++) {
			for (int k = column; k > j; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

}
 