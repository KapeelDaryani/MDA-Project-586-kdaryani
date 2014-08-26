package Kapeel586.Output.Makedeposit;
import Kapeel586.ssaMain;

public class MakeDeposit2 implements MakeDeposit
{
	//add amount in current balance for ATM 2
	@Override
	public void deposit()
		{
	ssaMain.d2.balance += ssaMain.tmp_deposit2;
	System.out.println("Your deposit has been successfully added to your balance");
		}

}

