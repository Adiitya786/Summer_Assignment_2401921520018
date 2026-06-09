package Week_2.Day_2;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int[] a = new int[26];
        int[] b = new int[26];

        for(char ch : p.toCharArray()) {
            a[ch - 'a']++;
        }

        int k = p.length();

        for(int i = 0; i < s.length(); i++) {

            b[s.charAt(i) - 'a']++;

            // remove left character
            if(i >= k) {
                b[s.charAt(i - k) - 'a']--;
            }

            if(match(a, b)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }

    boolean match(int[] a, int[] b) {

        for(int i = 0; i < 26; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }
}