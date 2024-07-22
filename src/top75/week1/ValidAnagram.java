package top75.week1;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram",  "nagaram"));
        System.out.println(isAnagram2("rat",  "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chFromS = s.charAt(i);
            char chFromT = t.charAt(i);

            map.put(chFromS, map.getOrDefault(chFromS, 0) + 1);
            map.put(chFromT, map.getOrDefault(chFromT, 0) - 1);
        }

        for (Integer value : map.values()) {
            if (value != 0) return false;
        }

        return true;
    }

        public static boolean isAnagram2(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
