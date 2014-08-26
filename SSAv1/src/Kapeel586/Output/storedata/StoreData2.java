package Kapeel586.Output.storedata;


import Kapeel586.ssaMain;

public class StoreData2 implements StoreData
{
	//store pin and opening balance for ATM 2
	@Override
	public void saveData()
	{
         ssaMain.d2.pin = ssaMain.tmp_pin2;
         ssaMain.d2.balance = ssaMain.tmp_balance2;
         System.out.println("Your account has been established successfully.");
	}

}