// Last updated: 24/07/2026, 19:40:33
1    class Solution {
2    public String[] splitMessage(String message, int limit) {
3        int[] stgTable = {
4                (limit - 5) * 9,
5                (limit - 6) * 9 + (limit - 7) * 90,
6                (limit - 7) * 9 + (limit - 8) * 90 + (limit - 9) * 900,
7                (limit - 8) * 9 + (limit - 9) * 90 + (limit - 10) * 900 + (limit - 11) * 9000,
8        };
9        int l = message.length(), stg = 0;
10        while (stg < stgTable.length) {
11            if (stgTable[stg] >= l) break;
12            stg++;
13        }
14        if (stg == stgTable.length) return new String[0];
15        ArrayList<String> list = new ArrayList<>();
16        int idx = 1, strIdx = 0;
17        for (int i = 0; i <= stg; i++) {
18            int size = limit - 5 - stg - i;
19            for (int j = 0; j < 9 * Math.pow(10, i) && strIdx < message.length(); j++) {
20                list.add(message.substring(strIdx, Math.min(message.length(), strIdx + size)) + "<" + idx);
21                strIdx += size;
22                idx++;
23            }
24        }
25        String[] res = list.toArray(new String[]{});
26        for (int i = 0; i < res.length; i++)
27            res[i] = res[i] + "/" + (idx - 1) + ">";
28        return res;
29    }
30}