package Day5_OOPs.HierarchialInheritance.BankAccount;

public class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account. Term: " + depositTerm + " months");
    }
}
