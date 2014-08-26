package Kapeel586.Output.storedata;

import Kapeel586.ssaMain;

public class StoreData3 implements StoreData
{
	//store pin and opening balance for ATM 3
	@Override
	public void saveData()
	{
         ssaMain.d3.pin = ssaMain.tmp_pin3;
         ssaMain.d3.balance = ssaMain.tmp_balance3;
         System.out.println();
         System.out.println("Your account has been established successfully.");
         System.out.println();
	}

}