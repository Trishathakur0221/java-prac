public class moveallnegnumtobeginningandpositivetoend {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7};
        moveNegativesToBeginning(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveNegativesToBeginning(int[] arr) {
        int n = arr.length;
        int j = 0; // Pointer for the position to place negative numbers

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                // Swap negative number with the number at position j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
    }
    
}
