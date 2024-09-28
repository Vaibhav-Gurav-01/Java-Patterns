/*	 ***** 
	  **** 
	   *** 
	    ** 
	     * 
*/
package patternprinting;

public class StarPatternFour {
	public static void main(String[] args) {
		int n = 5;
		int space = 1;
		int star = 5;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < star; l++) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println(" ");
		}
	}

}
