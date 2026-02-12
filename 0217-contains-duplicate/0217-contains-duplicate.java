class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ;
        for(int num : nums){
            set.add(num);
        }
        int lenOfArr = nums.length ;
        int sizeOfSet = set.size() ;
        if(lenOfArr == sizeOfSet){
            return false ;
        }

        return true ;
    }
}