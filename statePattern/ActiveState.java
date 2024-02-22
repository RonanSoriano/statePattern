package statePattern;

public class ActiveState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposited " + depositAmount);
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawn " + withdrawAmount);
        account.toString();

    }

    @Override
    public void activateState(Account account) {
        System.out.println("\nAccount is already activated!\n");
    }

    @Override
    public void suspendState(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
        account.toString();
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}