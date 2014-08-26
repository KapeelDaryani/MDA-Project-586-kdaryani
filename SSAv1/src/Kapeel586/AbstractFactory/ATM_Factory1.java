package Kapeel586.AbstractFactory;

import Kapeel586.Output.Chargepenalty.ChargePenalty;
import Kapeel586.Output.Chargepenalty.ChargePenalty1;
import Kapeel586.Output.Displaybalance.DisplayBalance;
import Kapeel586.Output.Displaybalance.DisplayBalance1;
import Kapeel586.Output.Displaymenu.DisplayMenu;
import Kapeel586.Output.Displaymenu.DisplayMenu1;
import Kapeel586.Output.Incorrectpinmessage.Incorrectpinmessage;
import Kapeel586.Output.Incorrectpinmessage.Incorrectpinmessage1;
import Kapeel586.Output.Makedeposit.MakeDeposit;
import Kapeel586.Output.Makedeposit.MakeDeposit1;
import Kapeel586.Output.Makewithdrawal.MakeWithdrawal;
import Kapeel586.Output.Makewithdrawal.MakeWithdrawal1;
import Kapeel586.Output.Promptforpin.Promptforpin;
import Kapeel586.Output.Promptforpin.Promptforpin1;
import Kapeel586.Output.Toomanyattemptsmessage.Toomanyattemptsmessage;
import Kapeel586.Output.Toomanyattemptsmessage.Toomanyattemptsmessage1;
import Kapeel586.Output.dispalybalbelowmin.DispalyBalBelowMin;
import Kapeel586.Output.dispalybalbelowmin.DispalyBalBelowMin1;
import Kapeel586.Output.storedata.StoreData;
import Kapeel586.Output.storedata.StoreData1;


public class ATM_Factory1 implements ATM_Factory {
	
	public DisplayMenu createDisplayMenu()
	{
		return new DisplayMenu1();
	}

	//return method for error message if wrong pin is entered for ATM 1
	public Incorrectpinmessage createDisplayIncorrectPin()
	{
		return new Incorrectpinmessage1();
	}

	//return method for message if certain no of tries attempt for pin against ATM 1
	public Toomanyattemptsmessage createDisplayTooManyAttempts()
	{
		return new Toomanyattemptsmessage1();
	}

	//return Method for error message if there is minimum balance and withdrawn action is made in ATM 1
	public DispalyBalBelowMin createDispalyBalBelowMin()
	{
		return new DispalyBalBelowMin1();
	}

	//return Method for display the current balance after transaction in ATM 1
	public DisplayBalance createDispalyBalance()
	{
		return new DisplayBalance1();
	}

	//return method that display message if pin is not entered after card is applied in ATM 1
	public Promptforpin createDisplayEnterPin()
	{
		return new Promptforpin1();
	}

	// return method for action to withdraw amount from current balance against ATM 1
	public MakeWithdrawal createMakeWithdraw()
	{
		return new MakeWithdrawal1();
	}

	//return method for charge the penalty if current balance is below minimum amount in ATM 1
	public ChargePenalty createChargePenalty()
	{
		return new ChargePenalty1();
	}

	//return method for add or deposit amount in current balance from ATM 1
	public MakeDeposit createMakeDeposit()
	{
		return new MakeDeposit1();
	}

	//return method, for store pin and opening balance for ATM 1
	public StoreData createStoreData()
	{
		return new StoreData1();
	}
}
