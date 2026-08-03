class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buyprice=Integer.MAX_VALUE;
        int Maxprice=0;
        for(int i=0;i<n;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                Maxprice=Math.max(Maxprice,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
return Maxprice;
    }

}
