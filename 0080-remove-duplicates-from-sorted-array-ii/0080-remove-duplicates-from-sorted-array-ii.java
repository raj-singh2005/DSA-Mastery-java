class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ;
        int j = i+1 ;
        int k = 1 ;
        int freq = 1 ;
        while(j < nums.length){
            
            if(nums[j] == nums[i]){
                freq++ ;
                if(freq > 2){
                    j++;
                    continue ;
                }else{
                    nums[i+1] = nums[j] ;
                    i++ ;
                    j++ ;
                    k++ ;

                }

            }else{
                freq = 1 ;
                nums[i+1] = nums[j] ;
                i++ ;
                j++ ;
                k++ ;

            }
        }

        return k ;
    }
}