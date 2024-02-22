package statePattern;

public class ClosedState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw from a closed account!");
        account.toString();
    }

    @Override
    public void activateState(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void closeState(Account account) {
        System.out.println("Account is already closed!");
    }
}