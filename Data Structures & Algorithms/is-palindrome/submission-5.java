class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        s=s.replace(" ","");
        s=s.toLowerCase();
        int r = s.length()-1;
        int l=0;
      while(l<=r){
        if(!Character.isLetterOrDigit(s.charAt(l))){
            l++;
            continue;
        }
        if(!Character.isLetterOrDigit(s.charAt(r))){
            r--;
            continue;
        }
        if(s.charAt(l)!=s.charAt(r)){
           return false;
        }
        l++;
        r--;
      }
      return true;

    }
}
