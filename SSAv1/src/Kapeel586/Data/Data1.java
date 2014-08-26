package Kapeel586.Data;


public class Data1 extends data {

    /* pin for the account*/
    public String pin;
 

    /*balance in the account */
    public int balance;

    /*Input deposit amount*/
    public int deposit;

    /*Input withdraw amount*/
    public int withdraw;

    /* Input pin for the account*/
    public String pinInput;

    
    /*Input balance in the account */
    public int balanceInput;

    public Data1() {
        super();
        maxInvalidAttempts = 2;
        minBalance = 1000;
        penalty =10;
    }

}
