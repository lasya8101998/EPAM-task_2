/**
 * 
 * @author lasya8101998
 *
 */

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCalc {
	private static Calculate calc;
	
	@BeforeClass
	public static void initcalc() {
		calc= new Calculate();
	}

	@Test
	public void testSum() {
		assertEquals(5,calc.addition(2,3));
		assertEquals(-6,calc.addition(-9,3));
		assertEquals(2,calc.addition(5,-3));
		assertEquals(-9,calc.addition(-3,-6));
	}

	@Test
	public void testProduct() {
		assertEquals(6,calc.multiplication(2,3));
		assertEquals(-27,calc.multiplication(-9,3));
		assertEquals(-15,calc.multiplication(5,-3));
		assertEquals(18,calc.multiplication(-3,-6));
	}
	
	@Test
	public void testQuotient() {
		try {
			assertEquals(1,calc.division(2,2));
			assertEquals(-3,calc.division(-9,3));
			assertEquals(-6,calc.division(18,-3));
			assertEquals(2,calc.division(-14,-7));
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testQuotientException() throws Exception {
		calc.division(5, 0);
	}
}
