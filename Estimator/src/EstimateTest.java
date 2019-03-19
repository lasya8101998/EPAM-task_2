/**
 * 
 * @author lasya8101998
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EstimateTest {
	private static Estimate e;

	@BeforeAll
	public static void inite()
	{
		e=new Estimate();
	}
	
	@Test
	void testEstimate() {
		assertEquals(300000.0, e.findCost(0, 250, false));
		assertEquals(300675.102, e.findCost(0, 250.562585, false));
		assertEquals(2500, e.findCost(2, 1, true));
		assertEquals(1800, e.findCost(2, 1, false));
		
	}

}