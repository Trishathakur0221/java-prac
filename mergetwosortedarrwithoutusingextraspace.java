public class mergetwosortedarrwithoutusingextraspace {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;

        // Create a new array to hold the merged result
        int[] mergedArray = new int[n + m];

        // Merge the two sorted arrays
        mergeSortedArrays(arr1, arr2, mergedArray);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2, int[] mergedArray) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
    }
    
}
