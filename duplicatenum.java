public class duplicatenum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 2, 3};
        int n = arr.length;
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    foundDuplicate = true;
                    break;
                }
            }
            if (foundDuplicate) {
                break;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
    
}
