package Kapeel586.Output.Displaybalance;

import Kapeel586.ssaMain;

public class DisplayBalance3 implements DisplayBalance{
	//Show the current balance for ATM 3
	@Override
	public void showBalance()
	{
		System.out.println("Your Current Balance: $"+ssaMain.d3.balance);
	}

}
