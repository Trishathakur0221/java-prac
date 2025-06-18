//DAY-16
// Program to sort an array containing only 0s, 1s, and 2s
// This is a variation of the Dutch National Flag problem
public class sortanarrof0s1s2s {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        sortArray(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] nums) {
        int zeroIndex = 0;
        int oneIndex = 0;
        int twoIndex = nums.length - 1;

        while (oneIndex <= twoIndex) {
            if (nums[oneIndex] == 0) {
                swap(nums, zeroIndex++, oneIndex++);
            } else if (nums[oneIndex] == 1) {
                oneIndex++;
            } else {
                swap(nums, oneIndex, twoIndex--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
