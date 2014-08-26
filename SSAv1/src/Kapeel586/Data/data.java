package Kapeel586.Data;

public abstract class data {

    /*maximum invalid pin attempts*/
    protected int maxInvalidAttempts;

    /*Minimum balance Amount to be maintained in the account*/
    protected int minBalance;

    /*Penalty if account is overdrawn*/
    protected int penalty;

    /*Locked Status*/
    protected boolean locked;

    public data() {
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }

    public int getMaxInvalidAttempts() {
        return maxInvalidAttempts;
    }

    public void setMaxInvalidAttempts(int maxInvalidAttempts) {
        this.maxInvalidAttempts = maxInvalidAttempts;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
}
