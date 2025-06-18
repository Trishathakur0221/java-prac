//DAY-19
// Program to find the intersection of two sorted arrays
public class intersectionoftwosortedarr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 5, 6, 7 };

        int i = 0, j = 0;

        System.out.print("Intersection of the two arrays: ");

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
        System.out.println("Intersection completed.");
    }

}
