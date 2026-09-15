class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int fruit1=-1,fruit2=-1;
        int fruit2cnt=0,cMax=0,maxCnt=0;
        for(int f:fruits){
            if(f==fruit1 || f==fruit2){
                cMax++;
            }else{
                cMax = fruit2cnt+1;
            }
            if(f==fruit2){
                fruit2cnt++;
            }else{
                fruit2cnt=1;
                fruit1 = fruit2;
                fruit2 = f;
            }
            maxCnt = Math.max(maxCnt,cMax);
        }
        return maxCnt;
    }
}