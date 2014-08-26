package Kapeel586.Output.Makewithdrawal;
import Kapeel586.ssaMain;

public class MakeWithdrawal2 implements MakeWithdrawal
{
	//withdraw amount from current balance for ATM 2
	@Override
	public void withdraw()
	{
		ssaMain.d2.balance = ssaMain.d2.balance - ssaMain.tmp_withdraw2;
	}

}