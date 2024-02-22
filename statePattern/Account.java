package statePattern;

public class Account {
    private String accountNumber = "";
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void deposit(Double depositAmount) {
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(withdrawAmount, this);
    }

    public void activate() {
        accountState.activateState(this);
    }

    public void suspend() {
        accountState.suspendState(this);
    }

    public void close() {
        accountState.closeState(this);
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public String toString() {
        System.out.println("Account Number: " + getAccountNumber() + "\nCurrent Balance: " + getBalance() + "\n");
        return "";
    }
}