class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub = s.substring(i,j);
                boolean isSingleChar = !sub.isEmpty() && sub.chars().distinct().count() == 1;
                if(isSingleChar) m.put(sub,m.getOrDefault(sub,0)+1);
            }
        }
        int maxLen = -1;
        for(Map.Entry<String,Integer> e : m.entrySet()){
            if(e.getValue() >= 3){
                // System.out.println(e.getKey() + " " + e.getKey().length() + " "+e.getValue());
                maxLen = Math.max(maxLen,e.getKey().length());
            }
        }
        return maxLen;
    }
}