package Kapeel586.Data;

public class Data3 extends data{  /* pin for the account*/
		public int pin;
 
		/*balance in the account */
		public int balance;

		/*Input deposit amount*/
		public int deposit;

		/*Input withdraw amount*/
		public int withdraw;

    public Data3() {
        super();
        maxInvalidAttempts = 0;
        minBalance = 100;
        penalty =0;
    }}
