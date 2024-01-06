import java.util.HashMap;
import java.util.Map;

public class longestpalindrome {
      public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int size = 0;
        for (char c: s.toCharArray()) {
            int numberOfCharacters = map.getOrDefault(c, 0);
            map.put(c, ++numberOfCharacters);
            if (numberOfCharacters % 2 == 0) {
                size += 2;
            }
        }

        for (int value: map.values()) {
            if (value % 2 == 1) {
                size++;
                break;
            }
        }
        return size;
    }
}
