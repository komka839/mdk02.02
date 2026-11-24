package prac17.task4;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString().equals(str);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindromeWord("казак")); // true
        System.out.println(p.isPalindromeWord("комок")); // true
        System.out.println(p.isPalindromeWord("java"));  // false
    }
}
