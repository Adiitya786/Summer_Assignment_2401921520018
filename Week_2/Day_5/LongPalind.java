package Week_2.Day_5;
class Solution {
    public int ispalind(String s, int st, int end){
        if(st==end) return 1;
        if(s.charAt(st)==s.charAt(end)){
            return ispalind(s,st+1,end-1)+2;
        }
        else {
            int ans1 =ispalind(s,st+1,end);
            int ans2 =ispalind(s,st,end-1);
            return Math.max(ans1,ans2);
        }
    }
    public String longestPalindrome(String s) {
        return ispalind(s,0,s.length()-1);
    }
}