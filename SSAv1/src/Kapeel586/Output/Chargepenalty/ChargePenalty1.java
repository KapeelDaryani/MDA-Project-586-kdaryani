package Kapeel586.Output.Chargepenalty;
import Kapeel586.ssaMain;
import Kapeel586.ATMS.atm1;

public class ChargePenalty1 implements ChargePenalty{

	//subtracts the penalty amount from current balance for ATM 1
	@Override
	public void penalty()
	{
		ssaMain.d1.balance =ssaMain.d1.balance- atm1.PENALTY;
		System.out.println("BALANCE BELOW MINIMUM. $"+atm1.PENALTY+" PENALTY APPLIED");
		
	}
}
