package Day6_OOPs.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.01; }
    @Override public void applyForLoan(double amount) { /* logic */ }
    @Override public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}