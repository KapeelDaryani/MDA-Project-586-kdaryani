package Kapeel586.Output.dispalybalbelowmin;

public class DispalyBalBelowMin1 implements DispalyBalBelowMin
{

	//Error message for withdraw amount if current balance is below minimum balance
	@Override
	public void showBalBelowMin()
	{
		System.out.println("Sorry the amount could not be withdrawn due to insufficient funds or below minimum balance");
	}

}
