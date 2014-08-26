package Kapeel586.State;

import Kapeel586.MDA_efsm;

public class checkpin extends state {
	public  checkpin(MDA_efsm m)
	{
		mda = m;
	}

	@Override
	public void card()
	{
		System.out.println("Operation open is not available. You already opened an card.");
		System.out.println();
	}


	@Override
	public void incorrectPin(int max)
	{
		if (mda.attempts < max)
		{
			mda.attempts++;
			mda.op.displayIncorrectPin();
		}
		else
		{
			mda.changeState(0);
			mda.op.displayTooManyAttempts();
			mda.attempts = 0;
		}
	}

	@Override
	public void correctPin()
	{
		mda.changeState(2);
		mda.op.displayMenu();
	}

	@Override
	public void incorrectLock()
	{
		System.out.println("PIN is not entered. Operation deposit is not available");
		System.out.println();
	}

	@Override
	public void incorrectUnlock()
	{
		System.out.println("PIN is not entered. Operation deposit is not available");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		System.out.println("PIN is not entered. Operation deposit is not available");
		System.out.println();
	}

	@Override
	public void withdraw()
	{
		System.out.println("PIN is not entered. Operation withdraw is not available");
		System.out.println();
	}

	@Override
	public void balance()
	{
		System.out.println("PIN is not entered. Operation balance is not available");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println("PIN is not entered. Operation lock is not available");
		System.out.println();
	}

	@Override
	public void unlock()
	{
		System.out.println("PIN is not entered. Operation unlock is not available");
		System.out.println();
	}

	@Override
	public void exit()
	{
		//mda.changeState(0);
		System.out.println("No Exit operation available");
		System.out.println();
	}
	
	public void belowMinBalanceWithPanelty()
	{
		System.out.println("PIN is not entered. Operation unlock is not available");
		System.out.println();
	}
}
