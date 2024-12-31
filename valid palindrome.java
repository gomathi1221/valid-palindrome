class Solution {
    public boolean isPalindrome(String s) {
        String txt=s.replaceAll("[^A-Za-z0-9]", "");
        String t=txt.toLowerCase();
        int left=0;
        int right=txt.length()-1;
       while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}