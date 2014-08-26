package Kapeel586.AbstractFactory;

import Kapeel586.Output.Chargepenalty.ChargePenalty;
import Kapeel586.Output.Displaybalance.DisplayBalance;
import Kapeel586.Output.Displaymenu.DisplayMenu;
import Kapeel586.Output.Incorrectpinmessage.Incorrectpinmessage;
import Kapeel586.Output.Makedeposit.MakeDeposit;
import Kapeel586.Output.Makewithdrawal.MakeWithdrawal;
import Kapeel586.Output.Promptforpin.Promptforpin;
import Kapeel586.Output.Toomanyattemptsmessage.Toomanyattemptsmessage;
import Kapeel586.Output.dispalybalbelowmin.DispalyBalBelowMin;
import Kapeel586.Output.storedata.StoreData;


public interface ATM_Factory {
	public DisplayMenu createDisplayMenu();

	public Incorrectpinmessage createDisplayIncorrectPin();

	public Toomanyattemptsmessage createDisplayTooManyAttempts();

	public DispalyBalBelowMin createDispalyBalBelowMin();

	public DisplayBalance createDispalyBalance();

	public Promptforpin createDisplayEnterPin();

	public MakeWithdrawal createMakeWithdraw();

	public ChargePenalty createChargePenalty();

	public MakeDeposit createMakeDeposit();

	public StoreData createStoreData();
}
