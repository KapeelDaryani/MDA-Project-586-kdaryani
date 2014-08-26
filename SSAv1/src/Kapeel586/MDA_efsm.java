package Kapeel586;

import Kapeel586.State.*;

public class MDA_efsm {
	public state s;
	public state[] sList = new state[6];
	public int attempts	= 0;
	public output op = new output();

	public MDA_efsm()
	{
		sList[0] = new idle(this);
		sList[1] = new checkpin(this);
		sList[2] = new balanceChecker(this);
		sList[3] = new ready(this);
		sList[4] = new overdrawn(this);
		sList[5] = new locked(this);
		s = sList[0];
	}

	public void card()
	{
		s.card();
	}

	public void correctPin()
	{
		s.correctPin();
	}

	public void incorrectPin(int max)
	{
		s.incorrectPin(max);
	}
	
	public void aboveMinBalance()
	{
		s.aboveMinBalance();
	}

	public void belowMinBalance()
	{
		s.belowMinBalance();
	}


	public void exit()
	{
		s.exit();
	}

	public void withdraw()
	{
		s.withdraw();
	}

	public void belowMinBalanceWithPanelty()
	{
		s.belowMinBalanceWithPanelty();
	}

	public void deposit()
	{
		s.deposit();
	}

	public void balance()
	{
		s.balance();
	}

	public void lock()
	{
		s.lock();
	}

	public void incorrectLock()
	{
		s.incorrectLock();
	}

	public void unLock()
	{
		s.unlock();
	}

	public void incorrectUnLock()
	{
		s.incorrectUnlock();
	}

	public void changeState(int state)
	{
		s = sList[state];
	}

}
