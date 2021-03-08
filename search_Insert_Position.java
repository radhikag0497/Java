class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++) {
            if(nums[i] == target){
                return i;
            }
        }
        if(i == nums.length) {
            for(int j=0;j<nums.length;j++) {
                if((j<nums.length-1) && target > nums[j] && target < nums[j+1]){
                    return (j+1);
                }
                else if(target > nums[nums.length-1]){
                    return (nums.length);
                }
            }
        }
        return 0;
    }
}
