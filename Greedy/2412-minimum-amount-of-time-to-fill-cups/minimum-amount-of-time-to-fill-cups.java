class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[0]+amount[1]<=amount[2]){
            return amount[2];
        }
        int c=0;
        while(!(amount[0]+amount[1]<=amount[2])){
            amount[0]--;
            amount[1]--;
            c++;
        }
        return amount[2]+c;
    }
}