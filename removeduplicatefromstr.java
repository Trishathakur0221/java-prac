//DAY-24
// Program to remove duplicate characters from a string
public class removeduplicatefromstr {
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        String result = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
