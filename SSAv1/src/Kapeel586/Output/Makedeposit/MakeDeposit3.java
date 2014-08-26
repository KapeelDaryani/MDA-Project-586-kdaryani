package Kapeel586.Output.Makedeposit;
import Kapeel586.ssaMain;

public class MakeDeposit3 implements MakeDeposit
{
	//add amount in current balance for ATM 3
	@Override
	public void deposit()
		{
	ssaMain.d3.balance += ssaMain.tmp_deposit3;
	System.out.println("Your deposit has been successfully added to your balance");
		}

}
