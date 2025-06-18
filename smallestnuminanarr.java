// DAY-15
// Program to find the smallest element in an array
public class smallestnuminanarr {
    public static void main(String[] args) {
        int arr[]= {9,12,61,45,6,3};
        System.out.println("Smallest element in the array: " + findSmallest(arr));
  }
    public static int findSmallest(int[] nums) {
        if (nums.length == 0) return Integer.MAX_VALUE; // Handle empty array case

        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
