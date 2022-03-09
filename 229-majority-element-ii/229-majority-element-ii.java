class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int old_freq=mp.get(nums[i]);
                mp.put(nums[i],old_freq+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val>nums.length/3){
                ans.add(key);
            }
        }
        return ans;
        
    }
}