/**
 * 
 * @author lasya8101998
 *
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InterestTest {
	Interest obj=new Interest();
	
	@Test
	void testCalc() {
		assertEquals(625.0, obj.simpleInterest(5000, 2.5, 5));
		assertEquals(0.0, obj.simpleInterest(5000, 0, 5));
		assertEquals(556.125, obj.simpleInterest(4449, 2.5, 5));
	}

	@Test
	void testCompoundInterest() {
		assertEquals(5.000000000000001E-7, obj.compoundInterest(5000,0,5));
		assertEquals(5000, obj.compoundInterest(5000, 3, 0));
		assertEquals(2.336698218750001E-4, obj.compoundInterest(4449, 2.5, 5));
	}

}
