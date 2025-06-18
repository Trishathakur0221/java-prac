//DAY-18
//// Write a program to compare two arrays and check if they are equal or not.
public class comparisonoftwoarr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 9};

        boolean areEqual = true;

        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
    
}
