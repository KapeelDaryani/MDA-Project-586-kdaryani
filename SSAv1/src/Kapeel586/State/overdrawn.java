package Kapeel586.State;

import Kapeel586.MDA_efsm;


public class overdrawn extends state{
	public  overdrawn(MDA_efsm m)
	{
		mda = m;
	}
	
	@Override
	public void card()
	{
		System.out.println("Operation open is not available. You already opened an account.");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		mda.changeState(2);
		mda.op.makeDeposit();
	}

	@Override
	public void withdraw()
	{
		mda.op.dispalyBalBelowMin();
	}

	@Override
	public void balance()
	{
		mda.op.displayBalance();
	}

	@Override
	public void lock()
	{
		mda.changeState(5);
		System.out.println("You locked your account.");
	}

	@Override
	public void unlock()
	{
		System.out.println("Please lock first to use unlock");
		System.out.println();
	}
	
	@Override
	public void incorrectLock()
	{
		mda.op.displayIncorrectPin();
	}

	@Override
	public void exit()
	{
		mda.changeState(0);
		System.out.println("Card ejected");
		System.out.println();
		
	}
	
	@Override
	public void incorrectPin(int max)
	{
		mda.op.displayIncorrectPin();
	};
	
}
