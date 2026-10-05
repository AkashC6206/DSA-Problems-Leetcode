class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,tens = 0, twen = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)five++;
            else if(bills[i]==10){
                if(five>0) five--;
                else return false;
                tens++;
            }
            else if(bills[i]==20){
                if(tens>0 && five>0){
                    tens--; five--;
                }else if(tens<=0 && five>=3) five-=3;
                else return false;
            }
            else{
                return false;
            }
        }
        return true;
    }
}