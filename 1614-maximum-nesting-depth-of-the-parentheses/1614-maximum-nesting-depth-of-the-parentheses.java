class Solution {
    public int maxDepth(String s) {
        int solt=0,curr=0;
        for(char it : s.toCharArray()){
            if(it=='('){
                curr++;
                solt=Math.max(curr,solt);
            }
            else if( it==')'){
                curr--;
            }
        }
         return solt;
    }
}