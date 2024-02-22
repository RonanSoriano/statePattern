package statePattern;

public class SuspendedState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("Deposits are not allowed for suspended accounts!");
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("Withdrawals are not allowed for suspended accounts!");
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
        account.toString();
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
        account.toString();
    }
}