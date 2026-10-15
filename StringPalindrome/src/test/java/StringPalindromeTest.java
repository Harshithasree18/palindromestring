import org.junit.Test;
import static org.junit.Assert.*;

public class StringPalindromeTest {
    @Test public void identifiesPalindrome() { assertTrue(new StringPalindrome().isPalindrome("Madam")); }
    @Test public void identifiesNonPalindrome() { assertFalse(new StringPalindrome().isPalindrome("Hello")); }
    @Test public void ignoresSpacesAndCase() { assertTrue(new StringPalindrome().isPalindrome("Never odd or even")); }
}
