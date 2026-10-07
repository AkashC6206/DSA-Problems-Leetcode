class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        int n=boxTypes.length;
        int totalBox=0;
        int totalUnits=0;
        for(int i=n-1;i>=0;i--){
            if(truckSize<totalBox+boxTypes[i][0]) 
            {
                totalUnits+=((truckSize-totalBox)*boxTypes[i][1]);
                break;
            }
            totalBox+=boxTypes[i][0];
            totalUnits += (boxTypes[i][0]*boxTypes[i][1]);
        }
        return totalUnits;
    }
}