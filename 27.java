class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
        //add elements that don't match to new index 
            if(nums[i]!=val) nums[k++]= nums[i];
        }
        return k;
    }
}

