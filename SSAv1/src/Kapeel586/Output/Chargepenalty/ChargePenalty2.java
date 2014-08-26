package Kapeel586.Output.Chargepenalty;
import Kapeel586.ssaMain;
import Kapeel586.ATMS.atm2;

public class ChargePenalty2  implements ChargePenalty{
	
	//subtracts the penalty amount from current balance for ATM 2
		@Override
		public void penalty()
		{
			if(ssaMain.flag==2){
			ssaMain.d2.balance = ssaMain.d2.balance-atm2.PENALTY;
			System.out.println("BALANCE BELOW MINIMUM. $"+atm2.PENALTY+" PENALTY APPLIED");
			}
		}
	}


