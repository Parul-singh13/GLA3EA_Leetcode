public int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int sum1= (len*(len+1))/2;

        
        
        return sum1-sum;

    
        
    }
