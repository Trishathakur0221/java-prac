//DAY-25
// Count the occurrence of a character in a string
public class counttheoccurneceofchar {
    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' occurs " + count + " times in the string.");
    }
    
}
