package Week_3.Day_4;
class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxarea = 0;
        int nsl[]  = new int[arr.length];
        int nsr[] = new int[arr.length];
             Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
            s = new Stack<>();
        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // curr area : j-i-1 = width
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

}