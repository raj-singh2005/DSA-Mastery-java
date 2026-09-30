class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxLen = word2.length() ;
        String mergedWord = "" ;
        if(word1.length() >= word2.length()){
            maxLen = word1.length() ;
        }

        for(int i = 0 ; i < maxLen ; i++){
            if(i < word1.length()){
              mergedWord += word1.charAt(i) ;
            }

            if(i < word2.length()){
              mergedWord += word2.charAt(i) ;
            }

        }

        return mergedWord ;
    }
}