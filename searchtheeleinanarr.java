//DAY-17
// This code defines a method to search for an element in an array and prints whether the element is present or not.
public class searchtheeleinanarr {   
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 7, 2, 6, 10};
        int target = 71;

        boolean found = contains(arr, target);
        System.out.println("Is " + target + " present? " + found);
    }
}
// This code defines a method to search for an element in an array and prints whether the element is present or not.
   
