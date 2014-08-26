package Kapeel586.Output.Displaybalance;
import Kapeel586.ssaMain;

public class DisplayBalance2 implements DisplayBalance
{
	//Show the current balance for ATM 2
	@Override
	public void showBalance()
	{
		System.out.println("Your Current Balance: $"+ssaMain.d2.balance);		
	}
}
