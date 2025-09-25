import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str is the input string.
	 * @return max run length
	 */
	public static int maxRun(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int ans = 1;
        int tmp = 1;
		for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                tmp ++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        return Math.max(ans, tmp);
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str is the input string.
	 * @return blown up string
	 */
	public static String blowup(String str) {
        String ans = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int count = c - '0';
                if (i + 1 < n) {
                    char nxt = str.charAt(i + 1);
                    ans += String.valueOf(nxt).repeat(count);
                }
            } else {
                ans += c;
            }
        }
        return ans;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if (len <= 0 || a.length() < len || b.length() < len) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < a.length() - len; i++) {
            String sub = a.substring(i, i + len);
            set.add(sub);
        }
        for (int i = 0; i < b.length() - len; i++) {
            String sub = b.substring(i, i + len);
            if (set.contains(sub)) {
                return true;
            }
        }
        return false;
	}
}
