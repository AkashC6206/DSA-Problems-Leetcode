class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.toString(boxTypes));
        int n=boxTypes.length;
        // System.out.println(n);
        int totalBox=0;
        int totalUnits=0;
        for(int i=n-1;i>=0;i--){
            System.out.println(boxTypes[i][1]);
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