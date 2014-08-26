package Kapeel586.ATMS;

import Kapeel586.ssaMain;
import Kapeel586.MDA_efsm;
import Kapeel586.Data.Data1;

public class atm1 {
	MDA_efsm m = new MDA_efsm();
	Data1 d1;
	public int tmp_balance;
	public String tmp_pin;
	public int tmp_deposit;
	public static final int	MIN_BALANCE	= 1000;
	private static final int MAX_ATTEMPTS = 2;//from 0;
	public static final int	PENALTY	= 10;
	
	public void card(int x, String y)
	{
		ssaMain.tmp_pin1 = y;
		ssaMain.tmp_balance1 = x;
		
		tmp_balance = x;
		tmp_pin = y;
		
		m.card();
	}

	public void pin(String x)
	{
		d1 = ssaMain.d1;
		if (x.equals(d1.pin))
		{
			m.correctPin();
			if (d1.balance > MIN_BALANCE)
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
		d1 = ssaMain.d1;
		ssaMain.tmp_deposit1 = d;
		
		tmp_deposit = d;
		m.deposit();
		if (d1.balance > MIN_BALANCE)
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
		d1 = ssaMain.d1;
		ssaMain.tmp_withdraw1 = w;
		m.withdraw();
		if (d1.balance > MIN_BALANCE)
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

	public void lock(String x)
	{
		d1 = ssaMain.d1;
		if (x.equals( ssaMain.tmp_pin1))
		{
			m.lock();
		}
		else
		{
			m.incorrectLock();
		}
	}

	public void unlock(String x)
	{
		d1 = ssaMain.d1;
		if (x.equals( ssaMain.tmp_pin1))
		{
			m.unLock();
			if (d1.balance > MIN_BALANCE)
			{
				m.aboveMinBalance();
			}
			else
			{
				m.belowMinBalance();
			}
		}
		else
		{
			m.incorrectUnLock();
		}
	}
}
