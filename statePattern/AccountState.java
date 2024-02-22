package statePattern;

public interface AccountState {
    void deposit(Double depositAmount, Account account);
    void withdraw(Double withdrawAmount, Account account);
    void activateState(Account account);
    void suspendState(Account account);
    void closeState(Account account);

}
