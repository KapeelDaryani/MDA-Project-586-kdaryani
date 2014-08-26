package Kapeel586;

import Kapeel586.AbstractFactory.ATM_Factory;

public class output {
	//initialize ATM_Factory Interface as af
	public ATM_Factory af;

	//Shows the transaction menu for perticular ATM
	public void displayMenu()
	{
		af = ssaMain.af;
		af.createDisplayMenu().showMenu();
	}

	//display error message if wrong pin is entered for ATM
	public void displayIncorrectPin()
	{
		af = ssaMain.af;
		af.createDisplayIncorrectPin().ShowIncorrectPin();
	}

	//message shows if certain no of tries attempt for correct pin.
	public void displayTooManyAttempts()
	{
		af = ssaMain.af;
		af.createDisplayTooManyAttempts().showTooManyAttempts();
	}

	//error message if there is minimum balance and withdrawn action is made
	public void dispalyBalBelowMin()
	{
		af = ssaMain.af;
		af.createDispalyBalBelowMin().showBalBelowMin();
	}

	//display the current balance after transaction
	public void displayBalance()
	{
		af = ssaMain.af;
		af.createDispalyBalance().showBalance();
	}

	//display message if pin is not entered after card is applied.
	public void displayEnterPin()
	{
		af = ssaMain.af;
		af.createDisplayEnterPin().showEnterPin();
	}

	// action for withdraw amount from current balance
	public void makeWithdrawal()
	{
		af = ssaMain.af;
		af.createMakeWithdraw().withdraw();
	}

	//charge the penalty if current balance is below minimum amount
	public void chargePenalty()
	{
		af = ssaMain.af;
		af.createChargePenalty().penalty();
	}

	//add or deposit amount in current balance
	public void makeDeposit()
	{
		af = ssaMain.af;
		af.createMakeDeposit().deposit();
	}

	//store pin and opening balance for ATM
	public void storeData()
	{
		af = ssaMain.af;
		af.createStoreData().saveData();
	}
}
