package chain_of_responsibility;

public class Account {

    protected Account successor;
    protected final float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(float amountToPay) {
        if (canPay(amountToPay)) {
            System.out.printf("Paid %s using %s%n", amountToPay, getClass().getSimpleName());
        } else if (successor != null) {
            System.out.printf("Cannot pay using %s. Proceeding ..%n", getClass().getSimpleName());
            successor.pay(amountToPay);
        } else {
            throw new IllegalStateException("None of the accounts have enough balance");
        }
    }

    private boolean canPay(float amount) {
        return balance >= amount;
    }
}
