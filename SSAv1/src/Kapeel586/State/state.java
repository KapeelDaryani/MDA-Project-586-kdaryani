package Kapeel586.State;

import Kapeel586.MDA_efsm;

public abstract class state {
MDA_efsm	mda;
	
	public void card()
	{
	};

	public void incorrectPin(int max)
	{
	};
	
	public void correctPin()
	{
	};

	public void aboveMinBalance()
	{
	};
	
	public void belowMinBalance()
	{
	};
	
	public void lock()
	{
	};

	public void deposit()
	{
	};

	public void withdraw()
	{
	};

	public void balance()
	{
	};

	public void exit()
	{
	};

	public void incorrectLock()
	{
	};

	public void unlock()
	{
	};
	
	public void incorrectUnlock()
	{
	}

	public void belowMinBalanceWithPanelty()
	{
		
	}

}
