package Week_2.Day_3;
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
       int m = s.length();
       int j =0;
       for(int i =0;i<n;i++){
        
        if(j<m && s.charAt(j)==t.charAt(i)){
            j++;
        }
       
       }
       return j==m;
    }
}