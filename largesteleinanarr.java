//DAY-14
// Program to find the largest element in an array

public class largesteleinanarr {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 9};
        System.out.println("Largest element in the array: " + findLargest(arr));
    }

    public static int findLargest(int[] nums) {
        if (nums.length == 0) return Integer.MIN_VALUE; // Handle empty array case

        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
    
}
