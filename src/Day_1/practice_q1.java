package Day_1;

public class practice_q1 {
	public static void main(String[] args) {
        int cp = 129;
        int sp = 191;

        int profit = sp - cp;
        float profit_percentage = (float) profit / cp * 100;

        System.out.println("The Cost Price is INR " + cp + " and the Selling Price is INR " + sp + "\n"
        + "The Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
    }

}
