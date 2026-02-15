class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26] ;
        int sLen = s.length() ;
        int tLen = t.length() ;
      if(sLen != tLen){
        return false ;
      }
      for(int i = 0 ; i < sLen ; i++){
        arr[s.charAt(i) - 'a']++ ;
        arr[t.charAt(i) - 'a']-- ;
      }
      for(int num : arr){
        if(num != 0){
            return false ;
        }
      }

      return true ;
    }
}