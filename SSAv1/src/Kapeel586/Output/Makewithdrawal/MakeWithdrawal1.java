package Kapeel586.Output.Makewithdrawal;
import Kapeel586.ssaMain;

public class MakeWithdrawal1 implements MakeWithdrawal
{

	//withdraw amount from current balance for ATM 1
	@Override
	public void withdraw()
	{
		ssaMain.d1.balance = ssaMain.d1.balance - ssaMain.tmp_withdraw1;
	}

}