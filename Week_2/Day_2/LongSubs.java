class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> st = new HashSet<>();
        int lp=0,rp=0,max=0;
        while(rp<n){
            char ch = s.charAt(rp);
             
                while(st.contains(ch)){
                    st.remove(s.charAt(lp));
                    lp++;
                }
                st.add(ch);
            max = Math.max(max,rp-lp+1);
            rp++;
        }
        return max;
    }
}