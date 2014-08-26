package Kapeel586.State;

import Kapeel586.MDA_efsm;


public class locked extends state{
	public  locked(MDA_efsm m)
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
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();

	}

	@Override
	public void withdraw()
	{
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();

	}

	@Override
	public void balance()
	{
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println("Operation lock is not available because your account had already been locked.");
		System.out.println();
	}

	@Override
	public void incorrectLock()
	{
		mda.op.displayIncorrectPin();
	}

	@Override
	public void unlock()
	{
		mda.changeState(2);
		System.out.println("You unlocked your account.");
	}

	@Override
	public void incorrectUnlock()
	{
		mda.op.displayIncorrectPin();
	}

	@Override
	public void exit()
	{
		System.out.println("Your account is locked, please unlock it first.");
		mda.changeState(1);
		System.out.println();
	}
}
