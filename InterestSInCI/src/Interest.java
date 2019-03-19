/**
 * To calculate simple interest and
 * compound interest
 * @author lasya8101998
 */

public class Interest {
	
	/**
	 * @param principle
	 * @param rate
	 * @param time
	 * finds simple interest 
	 * @return double simple interest
	 */
	
	public double simpleInterest(int principle,double rate,double time)
	{
		return (principle*rate*time)/100;
	}
	
	/**
	 * @param principle
	 * @param rate
	 * @param time
	 * finds compound interest 
	 * @return double compound interest
	 */
	
	public double compoundInterest(int principle,double rate,double time)
	{
		return principle*(Math.pow((1+rate)/100,time));
	}
	
}
