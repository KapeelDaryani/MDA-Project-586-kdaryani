package Kapeel586.Output.Makewithdrawal;
import Kapeel586.ssaMain;

public class MakeWithdrawal3 implements MakeWithdrawal
{
	//withdraw amount from current balance for ATM 3
	@Override
	public void withdraw()
	{
		ssaMain.d3.balance = ssaMain.d3.balance - ssaMain.tmp_withdraw3;
	}

}