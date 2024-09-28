/*	      * 
	    *** 
	   ***** 
	  ******* 
	 ********* 
*/
package patternprinting;

public class StarPatternThree {
	public static void main(String[] args) {

		int n = 5;
		int space = 5;
		int star = 1;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < star; l++) {
				System.out.print("*");
			}
			space--;
			star += 2;
			System.out.println(" ");
		}

	}

}
