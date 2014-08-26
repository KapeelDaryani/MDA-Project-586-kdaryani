package Kapeel586.State;
import Kapeel586.MDA_efsm;


public class idle extends state{
	
	public  idle(MDA_efsm m)
	{
		mda = m;
	}

	@Override
	public void card()
	{
		mda.changeState(1); //Change the state to CheckPin.
		mda.op.storeData(); //Point to data class
	}
	
	@Override
	public void incorrectPin(int max)
	{
		//mda.op.displayIncorrectPin();
		System.out.println("Please open the card first.");
		System.out.println();
	}
	
	@Override
	public void incorrectLock()
	{
		System.out.println("Please login first");
		System.out.println();
	}

	@Override
	public void incorrectUnlock()
	{
		mda.op.displayIncorrectPin();
	}

	@Override
	public void correctPin()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void withdraw()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void balance()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void unlock()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}

	@Override
	public void exit()
	{
		System.out.println("Please open the card first.");
		System.out.println();
	}
}
