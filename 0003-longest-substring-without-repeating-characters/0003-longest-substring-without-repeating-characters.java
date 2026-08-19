class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =  new HashSet<>();
        int lf=0;
        int maxlg=0;
        for(int rg =0; rg< s.length(); rg++){
            while(set.contains(s.charAt(rg))){
                set.remove(s.charAt(lf));
                lf++;
            }
            set.add(s.charAt(rg));
            int currlem=rg -lf + 1;

            maxlg=Math.max(maxlg,currlem);
        }
        return maxlg;
        
        
    }
}