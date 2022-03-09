class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       int csum=0;
        int rem=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            csum+=nums[i];
            rem=csum%k;
            if(rem<0)
                rem+=k;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                if(len>=2)
                    return true;
                
            }else{
                mp.put(rem,i);
            }
            
            
        }
        return false;
    }
}