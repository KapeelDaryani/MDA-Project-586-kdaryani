package Kapeel586.State;

import Kapeel586.MDA_efsm;


public class ready extends state{
	public  ready(MDA_efsm m)
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
		mda.op.makeDeposit();
		
	}

	@Override
	public void withdraw()
	{
		mda.op.makeWithdrawal();
		mda.changeState(2);
		
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
	public void exit()
	{
		mda.changeState(0);
		System.out.println("Card ejected");
		System.out.println();
	}

	@Override
	public void incorrectLock()
	{
		mda.op.displayIncorrectPin();
	}
}
