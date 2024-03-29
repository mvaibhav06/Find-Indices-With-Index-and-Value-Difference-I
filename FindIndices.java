public class FindIndices {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] out = {-1,-1};

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j])>=valueDifference && Math.abs(i-j)>=indexDifference){
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        return out;
    }
}
