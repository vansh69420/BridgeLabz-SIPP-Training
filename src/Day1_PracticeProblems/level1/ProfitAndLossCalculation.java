package Day1_PracticeProblems.level1;

public class ProfitAndLossCalculation {
	public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double profitPercent = (profit / (double)cp) * 100;
        
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + 
                         "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent + "%");
    }
}
