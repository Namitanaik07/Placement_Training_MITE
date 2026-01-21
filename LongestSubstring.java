
import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        String input3 = "abbas";
        System.out.println("Input: " + input3 + " | Output: " + findLongest(input3));
    }

    public static String findLongest(String s) {
        int n = s.length();
        int maxLength = 0;
        int startOfLongest = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right);


            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startOfLongest = left;
            }
        }
        return s.substring(startOfLongest, startOfLongest + maxLength);
    }
}
