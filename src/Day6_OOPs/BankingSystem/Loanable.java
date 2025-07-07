package Day6_OOPs.BankingSystem;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}