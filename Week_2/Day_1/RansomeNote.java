package Week_2.Day_1;
class Solution {
    public boolean canConstruct(String r, String m) {
        int n = r.length();
        int p = m.length();
        
        int arr[] = new int[126];
        int arr2[] = new int[126];
        for(int i =0;i<n;i++){
            arr[r.charAt(i)-'a']++;
        }
        for(int i =0;i<p;i++){
            arr2[m.charAt(i)-'a']++;
        }
        for(int i =0;i<126;i++){
            if(  arr[i]  > arr2[i]) return false;
        }
        return true;
    }
}