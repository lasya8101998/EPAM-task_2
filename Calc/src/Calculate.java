/**
 * To perform addition, multiplication
 * and division of any two numbers 
 * @author lasya8101998
 */

public class Calculate {
	
	/**
	 * finds the sum
	 * @param a
	 * @param b 
	 * @return int 
	 */
	
	public int addition(int a, int b) {
		return a + b;
	}
	
	/**
	 * finds the product
	 * @param a
	 * @param b 
	 * @return int 
	 */
	
	public int multiplication(int a, int b) {
		return a * b;
	}

	/**
	 * finds the quotient
	 * @param a
	 * @param b 
	 * @return int 
	 */
	
	public int division(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Dividend can't be zero");
		}

		return a / b;
	}

}
