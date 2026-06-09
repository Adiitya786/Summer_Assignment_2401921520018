package Week_2.Day_2;
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] a = new int[26];
        int[] b = new int[26];

        for (char ch : s1.toCharArray()) {
            a[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            b[s2.charAt(i) - 'a']++;

            // maintain window size
            if (i >= k) {
                b[s2.charAt(i - k) - 'a']--;
            }

            if (matches(a, b)) return true;
        }

        return false;
    }

    boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}