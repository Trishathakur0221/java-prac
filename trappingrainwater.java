//DAY-21
// Problem: Trapping Rain Water
// Description: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
public class trappingrainwater {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped rainwater: " + trap(height));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int waterTrapped = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                waterTrapped += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                waterTrapped += rightMax - height[right];
            }
        }
        return waterTrapped;
    }
    
}
