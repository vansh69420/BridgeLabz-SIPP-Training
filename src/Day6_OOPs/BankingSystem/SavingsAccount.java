package Day6_OOPs.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.04; }
    @Override public void applyForLoan(double amount) { /* logic */ }
    @Override public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}