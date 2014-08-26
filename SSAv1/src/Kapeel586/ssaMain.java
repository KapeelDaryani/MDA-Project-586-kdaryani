package Kapeel586;

import java.util.Scanner;
import Kapeel586.AbstractFactory.ATM_Factory;
import Kapeel586.AbstractFactory.ATM_Factory1;
import Kapeel586.AbstractFactory.ATM_Factory2;
import Kapeel586.AbstractFactory.ATM_Factory3;
import Kapeel586.ATMS.atm1;
import Kapeel586.ATMS.atm2;
import Kapeel586.ATMS.atm3;
import Kapeel586.Data.*;

public class ssaMain {
	
	public static ATM_Factory af;
	public static Data1				d1;
	public static Data2				d2;
	public static Data3				d3;
	public static  String			tmp_pin1;//atm1
	
	public static  int				tmp_balance1;
	public static int				tmp_deposit1;
	public static int				tmp_withdraw1;
	public static int			    tmp_pin2;//atm2
	public static float				tmp_balance2;
	public static float				tmp_deposit2;
	public static float				tmp_withdraw2;
	public static int			    tmp_pin3;//atm3
	public static int				tmp_balance3;
	public static int				tmp_deposit3;
	public static int				tmp_withdraw3;
	public static int				ch;
	public static int               flag;
	
	
	
	

	public static void main(String[] args)
	{
		System.out.println("Software System Architecture - CS586 ");
		System.out.println("			Project");
		System.out.println();
		System.out.println("Submitted By: Kapeel Daryani - A20313146");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			System.out.println("Select from ATM-1 or ATM-2 or ATM-3 to be used");
			System.out.println();
			System.out.println("Press 1 for ATM-1");
			System.out.println("Press 2 for ATM-2");
			System.out.println("Press 3 for ATM-3");
			System.out.println("Press 4 to quit from the program");
			System.out.println();
			System.out.println("Enter the value:");

			ch = scan.nextInt();
			if (ch == 4)
			{
				System.out.print("Operation: Quit ");
				System.exit(0);
				break;
			}
			else
			{
				if (ch == 1)
				{
					flag=1;
					atm1 atm1 = new atm1();
					af = new ATM_Factory1();
					d1 = new Data1();

					String pin;
					int balance;
					int deposit;
					int withdraw;

					System.out.println();
					System.out.println("      ATM-1");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. card(int,string)");
					System.out.println("   1. pin(string)");
					System.out.println("   2. deposit(int)");
					System.out.println("   3. withdraw(int)");
					System.out.println("   4. balance()");
					System.out.println("   5. lock(String)");
					System.out.println("   6. unlock(String)");
					System.out.println("   7. exit()");
					System.out.println("   8. closeSystem()");
					System.out.println();

					while (ch != 8)
					{
						System.out.println("      ATM-1 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out
								.println("0-card,1-pin,2-deposit,3-withdraw,4-balance,5-lock,6-unlock,7-exit");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (int x, string y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextInt();
							System.out.print("Enter value of the pin p: ");
							pin = scan.next();
							atm1.card(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  pin(String x) ");
							System.out.print("Enter value of the pin x ");
							pin = scan.next();
							atm1.pin(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  deposit(int d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextInt();
							atm1.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  withdraw(int w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextInt();
							atm1.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  balance() ");
							atm1.balance();
							scan.nextLine();
							System.out.println();
							break;
														
						case 5:
							System.out.print("Operation:  lock(String x) ");
							System.out.print(" Enter value of the pin x: ");
							pin = scan.next();
							atm1.lock(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 6:
							System.out.print("Operation:  unlock(String x) ");
							System.out.print(" Enter value of the pin x: ");
							pin = scan.next();
							atm1.unlock(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation: EXIT, Card Ejected, Press 0 to insert card again.");
							atm1.exit();
							System.out.println();
							break;
							
						case 8:
							System.out.print("Operation: System Closed");
							System.exit(0);
							break;
							
							
							
						}
					}
				}
				else if (ch == 2)
				{
					flag=2;
					atm2 atm2 = new atm2();
					af = new ATM_Factory2();
					d2 = new Data2();

					System.out.println();
					System.out.println("      ATM-2");
					System.out.println();
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. CARD(float,int)");
					System.out.println("   1. PIN(int)");
					System.out.println("   2. DEPOSIT(float)");
					System.out.println("   3. WITHDRAW(float)");
					System.out.println("   4. BALANCE()");
					System.out.println("   5. EXIT()");
					System.out.println();

					int pin;
					float balance;
					float deposit;
					float withdraw;

					while (ch != 5)
					{
						System.out.println("      ATM-2 Execution");
						System.out.println();
						System.out.println("     Select Operation:");
						System.out.println("0-Card,1-PIN,2-DEPOSIT,3-WITHDRAW,4-BALANCE,5-EXIT");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (float x, int y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextFloat();
							System.out.print("Enter value of the pin p: ");
							pin = scan.nextInt();
							atm2.CARD(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
			
						case 1:
							System.out.print("Operation:  PIN(int x) ");
							System.out.print("Enter value of the PIN x ");
							pin = scan.nextInt();
							atm2.PIN(pin);
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  DEPOSIT(float d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextFloat();
							atm2.DEPOSIT(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  WITHDRAW(float w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextFloat();
							atm2.WITHDRAW(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  BALANCE() ");
							atm2.BALANCE();
							System.out.println();
							break;
							
						case 5:
							System.out.print("Operation: EXIT, Card Ejected");
							atm2.exit();
							break;
							
						

						}
					}
				}
				if (ch == 3)
				{
					flag=3;
					atm3 atm3 = new atm3();
					af = new ATM_Factory3();
					d3 = new Data3();

					int pin;
					int balance;
					int deposit;
					int withdraw;

					System.out.println();
					System.out.println("      ATM-3");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. card(int,int)");
					System.out.println("   1. pin(int)");
					System.out.println("   2. deposit(int)");
					System.out.println("   3. withdraw(int)");
					System.out.println("   4. balance()");
					System.out.println("   5. lock()");
					System.out.println("   6. unlock()");
					System.out.println("   7. exit()");
					System.out.println();

					while (ch != 8)
					{
						System.out.println("      ATM-3 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out
								.println("0-card,1-pin,2-deposit,3-withdraw,4-balance,5-lock,6-unlock,7-exit");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (int x, int y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextInt();
							System.out.print("Enter value of the pin p: ");
							pin = scan.nextInt();
							atm3.card(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  pin(int x) ");
							System.out.print("Enter value of the pin x ");
							pin = scan.nextInt();
							atm3.pin(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  deposit(int d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextInt();
							atm3.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  withdraw(int w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextInt();
							atm3.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  balance() ");
							atm3.balance();
							scan.nextLine();
							System.out.println();
							break;
														
						case 5:
							System.out.print("Operation:  lock() ");
							atm3.lock();
							scan.nextLine();
							System.out.println();
							break;
							
						case 6:
							System.out.print("Operation:  unlock() ");
							atm3.unlock();
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation: EXIT, Card Ejected, Press 0 to insert card again. ");
							atm3.exit();
							break;
							
						case 8:
							System.out.print("Operation: Close System");
							System.exit(0);
							break;
						}
					}
				}
			}
		}
	}
}
