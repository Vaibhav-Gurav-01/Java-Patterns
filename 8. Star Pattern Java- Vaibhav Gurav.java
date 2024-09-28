/*	 x  o  o  o  x 
	 o  x  o  x  o 
	 o  o  x  o  o 
	 o  x  o  x  o 
	 x  o  o  o  x 
  */
package patternprinting;

public class SymbolPatternSeven {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1) {
					System.out.print(" x ");
				} else {
					System.out.print(" o ");
				}
			}
			System.out.println();
		}
	}

}
