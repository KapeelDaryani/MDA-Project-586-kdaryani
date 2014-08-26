package Kapeel586.Output.Makedeposit;

import Kapeel586.ssaMain;

	public class MakeDeposit1 implements MakeDeposit
	{
		//add or deposit amount in current balance for ATM 1
		@Override
		public void deposit()
			{
		ssaMain.d1.balance += ssaMain.tmp_deposit1;
		System.out.println("Your deposit has been successfully added to your balance");
			}

	}
