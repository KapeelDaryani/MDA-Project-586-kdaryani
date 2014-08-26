package Kapeel586.Output.storedata;

import Kapeel586.ssaMain;

public class StoreData1 implements StoreData
{

	//store pin and opening balance for ATM 1
	@Override
	public void saveData()
	{
         ssaMain.d1.pin = ssaMain.tmp_pin1;
         ssaMain.d1.balance = ssaMain.tmp_balance1;
         System.out.println("Your account has been established successfully.");
	}

}

