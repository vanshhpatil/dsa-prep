package Array;

public class TrappingRainWater {
    public static int getTrappedRainWater(int height[]) {
        int n = height.length;
        if (n <= 2) return 0; // Need at least 3 bars to trap water

        // 1. Calculate Left Max Boundary - Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // 2. Calculate Right Max Boundary - Array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // 3. Loop to calculate total trapped water
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total trapped rainwater: " + getTrappedRainWater(height));
    }
}