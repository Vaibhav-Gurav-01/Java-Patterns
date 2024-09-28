/*	1 
	2 3 
	3 4 5 
	4 5 6 7 
	5 6 7 8 9 
 */
package patternprinting;

public class NumberPatternTen {

	public static void main(String[] args) {

		int rows = 5; 

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((i + j) + " ");
			}
			System.out.println(); 
		}
	}
}
