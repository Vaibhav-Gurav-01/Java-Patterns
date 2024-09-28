/*	A  B  C  D  E   
	B  C  D  E  F   
	C  D  E  F  G   
	D  E  F  G  H   
	E  F  G  H  I   

 */
package patternprinting;

public class AlphabetPatternPrinting {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		char ch = 'A';
		for (int i = 0; i < row; i++) // for row
		{
			for (int j = 0; j < column; j++) // for column
			{
				System.out.print((char) (ch + i + j));
				System.out.print("  ");
			}
			System.out.println(" ");
		}

	}

}
 