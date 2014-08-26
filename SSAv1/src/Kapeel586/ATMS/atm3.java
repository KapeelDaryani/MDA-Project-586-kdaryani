package Kapeel586.ATMS;

import Kapeel586.MDA_efsm;
import Kapeel586.ssaMain;
import Kapeel586.Data.Data3;

public class atm3 {
	MDA_efsm m = new MDA_efsm();
	Data3 d3;
	public static final int	MIN_BALANCE		= 100;
	private static final int	MAX_ATTEMPTS	= 1;//from 0;
	public static final int	PENALTY			= 0;

	public void card(int x, int y)
	{
		ssaMain.tmp_pin3 = y;
		ssaMain.tmp_balance3 = x;
		m.card();
	}

	public void pin(int x)
	{
		d3 = ssaMain.d3;
		if (x==d3.pin)
		{
			m.correctPin();
			if (d3.balance > MIN_BALANCE)
				m.aboveMinBalance();
			else
				m.belowMinBalance();
		}
		else
			m.incorrectPin(MAX_ATTEMPTS);
	}

	public void exit()
	{
		m.exit();
	}

	public void deposit(int d)
	{
		d3 = ssaMain.d3;
		ssaMain.tmp_deposit3 = d;
		m.deposit();
		if (d3.balance > MIN_BALANCE)
		{
			m.aboveMinBalance();
		}
		else
		{
			m.belowMinBalanceWithPanelty();
		}
	}

	public void withdraw(int w)
	{
		d3 = ssaMain.d3;
		ssaMain.tmp_withdraw3 = w;
		m.withdraw();
		if (d3.balance > MIN_BALANCE)
		{
			m.aboveMinBalance();
		}
		else
		{
			m.belowMinBalanceWithPanelty();
		}
	}

	public void balance()
	{
		m.balance();
	}

	public void lock()
	{
		d3 = ssaMain.d3;
		
		m.lock();
	}

	public void unlock()
	{
		d3 = ssaMain.d3;
		
			m.unLock();
			if (d3.balance > MIN_BALANCE)
			{
				m.aboveMinBalance();
			}
			else
			{
				m.belowMinBalance();
			}
		
	}
}
