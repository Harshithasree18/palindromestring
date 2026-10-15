public class StringPalindrome {
    public boolean isPalindrome(String text) {
        if (text == null) throw new IllegalArgumentException("Text must not be null");
        String normalized = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return normalized.equals(new StringBuilder(normalized).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(new StringPalindrome().isPalindrome("Madam"));
    }
}
