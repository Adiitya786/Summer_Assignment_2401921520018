package Week_2.Day_3;

public class RepeatSubs {
    
}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
          String conc = s+s;
          if(conc.substring(1,conc.length()-1).contains(s)) return true;
          return false;
     
    }
}