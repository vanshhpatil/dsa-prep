package Array;
import java.util.*;

public class ProfitLoss {
    public static int stockprof(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // Profit nikala
                int profit = prices[i] - buyPrice;
                // Agar naya profit zyada hai to update karo
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Naya buy price set karo
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of days :");
        int p = sc.nextInt();
        int prices[] = new int[p];

        System.out.println("Enter Stock prices value per day:");
        for (int i = 0; i < p; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Highest profit is " + stockprof(prices));
    }
}
