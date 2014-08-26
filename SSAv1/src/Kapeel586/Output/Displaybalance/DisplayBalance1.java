package Kapeel586.Output.Displaybalance;
import Kapeel586.ssaMain;

public class DisplayBalance1 implements DisplayBalance
{
	//Show the current balance for ATM 1
		@Override
		public void showBalance()
		{
			System.out.println("Your Current Balance: $"+ssaMain.d1.balance);
		}
}