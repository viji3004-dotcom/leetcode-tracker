// Last updated: 24/07/2026, 19:36:26
1import java.util.*;
2
3class Solution {
4    public int maxPoints(int[][] points) {
5        int n = points.length;
6        if (n <= 2) return n;
7
8        int ans = 2;
9
10        for (int i = 0; i < n; i++) {
11            HashMap<String, Integer> map = new HashMap<>();
12            int max = 0;
13
14            for (int j = i + 1; j < n; j++) {
15                int dx = points[j][0] - points[i][0];
16                int dy = points[j][1] - points[i][1];
17
18                int g = gcd(dx, dy);
19                dx /= g;
20                dy /= g;
21
22                if (dx < 0) {
23                    dx = -dx;
24                    dy = -dy;
25                } else if (dx == 0) {
26                    dy = 1;
27                } else if (dy == 0) {
28                    dx = 1;
29                }
30
31                String key = dy + "/" + dx;
32                int count = map.getOrDefault(key, 0) + 1;
33                map.put(key, count);
34
35                max = Math.max(max, count);
36            }
37
38            ans = Math.max(ans, max + 1);
39        }
40
41        return ans;
42    }
43
44    private int gcd(int a, int b) {
45        if (b == 0) return Math.abs(a);
46        return gcd(b, a % b);
47    }
48}