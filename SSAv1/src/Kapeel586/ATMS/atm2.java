package Kapeel586.ATMS;

import Kapeel586.ssaMain;
import Kapeel586.MDA_efsm;
import Kapeel586.Data.Data2;

public class atm2 {
	MDA_efsm m = new MDA_efsm();
	Data2 d2;
	public static final int	MIN_BALANCE		= 500;
	private static final int	MAX_ATTEMPTS	= 1;//from 0;
	public static final int	PENALTY			= 20;

	public void CARD(float x, int y)
	{
		ssaMain.tmp_pin2 = y;
		ssaMain.tmp_balance2 = x;
		m.card();
	}

	public void PIN(int x)
	{
		d2 = ssaMain.d2;
		if (x == d2.pin)
		{
			m.correctPin();
			if (d2.balance > MIN_BALANCE)
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

	public void DEPOSIT(float d)
	{
		d2 = ssaMain.d2;
		ssaMain.tmp_deposit2 = d;
		m.deposit();
		if (d2.balance > MIN_BALANCE)
		{
			m.aboveMinBalance();
		}
		else
		{
			m.belowMinBalanceWithPanelty();
		}
	}

	public void WITHDRAW(float w)
	{
		d2 = ssaMain.d2;
		ssaMain.tmp_withdraw2 = w;
		m.withdraw();
		if (d2.balance > MIN_BALANCE)
		{
			m.aboveMinBalance();
		}
		else
		{
			m.belowMinBalanceWithPanelty();
		}
	}

	public void BALANCE()
	{
		m.balance();
	}
}
