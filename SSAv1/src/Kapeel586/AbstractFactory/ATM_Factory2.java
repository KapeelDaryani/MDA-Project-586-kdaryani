package Kapeel586.AbstractFactory;

import Kapeel586.Output.Chargepenalty.ChargePenalty;
import Kapeel586.Output.Chargepenalty.ChargePenalty2;
import Kapeel586.Output.Displaybalance.DisplayBalance;
import Kapeel586.Output.Displaybalance.DisplayBalance2;
import Kapeel586.Output.Displaymenu.DisplayMenu;
import Kapeel586.Output.Displaymenu.DisplayMenu2;
import Kapeel586.Output.Incorrectpinmessage.Incorrectpinmessage;
import Kapeel586.Output.Incorrectpinmessage.Incorrectpinmessage1;
import Kapeel586.Output.Makedeposit.MakeDeposit;
import Kapeel586.Output.Makedeposit.MakeDeposit2;
import Kapeel586.Output.Makewithdrawal.MakeWithdrawal;
import Kapeel586.Output.Makewithdrawal.MakeWithdrawal2;
import Kapeel586.Output.Promptforpin.Promptforpin;
import Kapeel586.Output.Promptforpin.Promptforpin1;
import Kapeel586.Output.Toomanyattemptsmessage.Toomanyattemptsmessage;
import Kapeel586.Output.Toomanyattemptsmessage.Toomanyattemptsmessage1;
import Kapeel586.Output.dispalybalbelowmin.DispalyBalBelowMin;
import Kapeel586.Output.dispalybalbelowmin.DispalyBalBelowMin1;
import Kapeel586.Output.storedata.StoreData;
import Kapeel586.Output.storedata.StoreData2;

public class ATM_Factory2  implements ATM_Factory{

	@Override
	public DisplayMenu createDisplayMenu() {
		return new DisplayMenu2();
	}

	@Override
	public Incorrectpinmessage createDisplayIncorrectPin() {
		return new Incorrectpinmessage1();
	}

	@Override
	public Toomanyattemptsmessage createDisplayTooManyAttempts() {
		return new Toomanyattemptsmessage1();
	}

	@Override
	public DispalyBalBelowMin createDispalyBalBelowMin() {
		return new DispalyBalBelowMin1();
	}

	@Override
	public DisplayBalance createDispalyBalance() {
		return new DisplayBalance2();
	}

	@Override
	public Promptforpin createDisplayEnterPin() {
		return new Promptforpin1();
	}

	@Override
	public MakeWithdrawal createMakeWithdraw() {
		return new MakeWithdrawal2();
	}

	@Override
	public ChargePenalty createChargePenalty() {
		return new ChargePenalty2();
	}

	@Override
	public MakeDeposit createMakeDeposit() {
		return new MakeDeposit2();
	}

	@Override
	public StoreData createStoreData() {
		// TODO Auto-generated method stub
		return new StoreData2();
	}

}
