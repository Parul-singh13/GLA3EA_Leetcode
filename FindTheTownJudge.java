 public int findJudge(int n, int[][] trust) {
        int len=trust.length;
        if(n==1){
            return 1;
        }
        if(len < n-1){
            return -1;
        }
        int[] trusting=new int[n+1];
        int[] trusted= new int[n+1];
        for(int i=0;i<len;i++){
            trusting[trust[i][0]]++;
            trusted[trust[i][1]]++;
            
        }
        for(int i=0;i<=n;i++){
            if(trusting[i]==0 && trusted[i]==n-1){
                return i;
            } 
        }
        return -1;
        
    }
