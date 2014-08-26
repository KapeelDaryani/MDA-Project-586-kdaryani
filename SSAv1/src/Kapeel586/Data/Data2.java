package Kapeel586.Data;

public class Data2 extends data{

    /* pin for the account*/
    public int pin;
 
    /*balance in the account */
    public float balance;

    /*Input deposit amount*/
    public float deposit;

    /*Input withdraw amount*/
    public float withdraw;

    public Data2() {
        super();
        maxInvalidAttempts = 2;
        minBalance = 1000;
        penalty =10;
    }
  
}
