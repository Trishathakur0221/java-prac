public class occurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 1, 2, 9, 5 };

        int n = arr.length;
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[n];
        for (i = 0; i < n; i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    temp[j] = -1;
                }
            }
            if (temp[i] != -1) {
                temp[i] = count;
            }
        }
        System.out.println("The Occurence of each element in the array is:");
        for (i = 0; i < n; i++) {
            if (temp[i] != -1) {
                System.out.println(arr[i] + " occurs " + temp[i] + " times");
            }
        }
        System.out.println("The unique elements in the array are:");
        for (i = 0; i < n; i++) {
            if (temp[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }

}
