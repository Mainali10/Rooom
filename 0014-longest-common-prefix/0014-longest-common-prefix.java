class Solution {
    public String longestCommonPrefix(String[] strs) {
        String empty="";
        for(int i=0;i<strs[0].length(); i++){
            char currents=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                String str=strs[j];
                if(i>=str.length() || str.charAt(i)!=currents){
                    return empty;
                }
            }
          empty =empty + currents;
        }
              return empty;


    }
        
}
    
