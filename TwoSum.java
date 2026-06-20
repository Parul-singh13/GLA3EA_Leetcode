//Brute Force : Time Complexity(n2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
              if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            }
        }
        return new int[]{};
    }
}

//Optimized using HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;
      Map<Integer,Integer> mp=new HashMap<>();
     for(int i=0;i<n;i++){
        int comp=target-nums[i];
        if(mp.containsKey(comp)){
            return new int[]{mp.get(comp),i};
             
        }
        mp.put(nums[i],i);


     }
     return new int[]{};
    }
}
