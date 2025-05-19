public class missingnuminanarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2; // Sum of first n natural numbers
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
