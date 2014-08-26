package Kapeel586.Output.Chargepenalty;
import Kapeel586.ssaMain;
import Kapeel586.ATMS.atm3;

public class ChargePenalty3 implements ChargePenalty 
{
	//subtracts the penalty amount from current balance for ATM 3
	@Override
	public void penalty()
	{
		{
		ssaMain.d3.balance = ssaMain.d3.balance-atm3.PENALTY;
		System.out.println("BALANCE BELOW MINIMUM. $"+atm3.PENALTY+" PENALTY APPLIED");
		}
	}
}
