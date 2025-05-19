public class unionandintersectionoftwoarray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;

        System.out.println("Union of the two arrays:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int j = 0; j < n2; j++) {
            boolean found = false;
            for (int k = 0; k < n1; k++) {
                if (arr2[j] == arr1[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[j] + " ");
            }
        }

        System.out.println("\nIntersection of the two arrays:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
    
}
