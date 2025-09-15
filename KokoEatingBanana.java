class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minPile=1;
        int maxPile=0;
        for(int pile:piles){
            maxPile=Math.max(maxPile,pile);
        }
       while(minPile<maxPile){
        int mid=(minPile+maxPile)/2;
        if(canEatinTime(piles,h,mid)){
            maxPile=mid;
        }
        else{
            minPile=mid+1;
        }



       }
       return minPile;

        }
    private boolean canEatinTime(int[] piles,int h,int speed ){
        int hours=0;
        for(int pile:piles){
            hours+=(int) Math.ceil((double) pile/speed);

        
           
        }
        return hours<=h;
    

    } 
    
}
