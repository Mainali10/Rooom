class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int temp1=0;
        while(x>0){
            int temp2= x % 10;
            temp1=temp1 * 10 + temp2;
            x=x/10;
        }
        return temp==temp1;
        
    }
}