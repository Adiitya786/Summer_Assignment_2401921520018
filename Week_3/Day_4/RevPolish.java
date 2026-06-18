package Week_3.Day_4;
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length,ans=0;
        Stack<Character> s = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        for(int i =n-1;i>=0;i--){
            s.push(tokens[i].charAt(0));
        }
        while(!s.isEmpty()){
            if(s.peek()=='+' ||s.peek()=='-'||s.peek()=='/'||s.peek()=='*'){
                int i = s1.pop();
                // int j = s1.pop();
                int op = s.pop();
                if(op=='+') ans+=i;
                else if(op=='-') ans-=i;
                else if(op=='/') ans /=i;
                else ans*=i;
            }
            else {
                s1.push(s.pop());
            }
        }
        return ans;
    }
}