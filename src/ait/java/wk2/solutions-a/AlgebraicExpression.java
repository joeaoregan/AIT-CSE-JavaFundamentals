package ait.java.wk2.solutions-a;

public class AlgebraicExpression {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=0, a=0;

		// Assume x == 2 and a == 3
		x = 2;
		a = 3;
		System.out.println ("Evaluating \"y = ax3 + 7\" where x == 2 and a == 3\n");

		// y = ax3 + 7, thus y should be 31

		y = a * x * x * x + 7;		// 3 * 2 * 2 * 2 + 7 = 31 (correct)
		System.out.println ("y = a * x * x * x + 7 sets y to \t: " + y);

		y = a * x * x * (x + 7);	// 3 * 2 * 2 * 9 = 108
		System.out.println ("y = a * x * x * (x + 7) sets y to \t: " + y);
	
		y = (a * x) * x * (x + 7);	// 6 * 2 * 9 = 108
		System.out.println ("y = (a * x) * x * (x + 7) sets y to \t: " + y);

		y = (a * x) * x * x + 7;	// 6 * 2 * 2 + 7 = 31 (correct)
		System.out.println ("y = (a * x) * x * x + 7 sets y to \t: " + y);

		y = a * (x * x * x) + 7;	// 3 * 8 + 7 = 31 (correct)
		System.out.println ("y = a * (x * x * x) + 7 sets y to \t: " + y);

		y = a * x * (x * x + 7);	// 3 * 2 * 11 = 66
		System.out.println ("y = a * x * (x * x + 7) sets y to \t: " + y);
		
		y= (int) (a*Math.pow(x,3)+7);
		System.out.println ("y = a * x^3 +7 using Math.pow) sets y to \t: " + y);
	}
}
