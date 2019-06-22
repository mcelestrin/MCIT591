/**
 * A class to monitor the growth of an investment that  3 accumulates interest at 
 * a fixed annual rate. 
 * @author michellecelestrin
 */
public class Investment 
{
	private double balance;
	private double rate;
	private int year;
	
	//Constructor, initial investment object
	public Investment(double aBalance, double aRate)
	{
		balance = aBalance;
		rate = aRate;
		year = 0;

	}
		/** method for accumulating interest until target reached
		 * @param targetBalance
		 */
	
	public void waitForBalance(double targetBalance) 
	{
		while (balance < targetBalance)
		{
			year++;
			double interest = balance * rate/ 100;
			balance = balance + interest;
		}

	}
		//gets current balance
	public double getBalance()
	{
		return balance;
    }
	public int getYears() 
	{
		return year;
	}
}
