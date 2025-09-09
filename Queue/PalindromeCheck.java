import java.util.*;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        Queue<Character> originalQueue = new LinkedList<>();
        Queue<Character> reversedQueue = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            originalQueue.add(ch);
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedQueue.add(str.charAt(i));
        }

        while (!originalQueue.isEmpty()) {
            if (!originalQueue.remove().equals(reversedQueue.remove())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String test = "madam";
        System.out.println(test + " is palindrome? " + isPalindrome(test));
    }
}
