package Week_1.Day_5;
class Solution {
    public boolean isPalindrome(String s) {
      
        if(s.length()==0){ return true;}
        String str = s.toLowerCase();
        String fina = str.replaceAll("[^a-z0-9]","");
      for(int i =0;i<fina.length()/2;i++){
        if(fina.charAt(i) != fina.charAt(fina.length()-i-1)){
            return false;
        }
      }
      return true;
    }
}