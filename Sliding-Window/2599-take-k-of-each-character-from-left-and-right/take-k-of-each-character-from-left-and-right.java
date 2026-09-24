class Solution {
    public int takeCharacters(String s, int k) {
        int a = 0, b = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a')
                a++;
            else if (ch == 'b')
                b++;
            else
                c++;
        }
        char[] ch = s.toCharArray();
        int ta = a - k, tb = b - k, tc = c - k;
        int j = 0;
        int window_max = -1;
        int cura = 0, curb = 0, curc = 0;
        if (ta < 0 || tb < 0 || tc < 0) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == 'a')
                cura++;
            else if (ch[i] == 'b')
                curb++;
            else
                curc++;
            while (cura > ta || curb > tb || curc > tc) {
                if (ch[j] == 'a')
                    cura--;
                else if (ch[j] == 'b')
                    curb--;
                else
                    curc--;
                j++;
            }
            window_max = Math.max(window_max, i-j + 1);
        }
        return window_max == -1 ? -1 : s.length() - window_max;
    }
}