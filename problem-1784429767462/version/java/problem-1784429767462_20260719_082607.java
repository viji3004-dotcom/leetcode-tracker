// Last updated: 19/07/2026, 08:26:07
1class Solution {
2    public int minimumGroups(String[] words) {
3        String[] brenolcavi = words;
4
5        HashSet<String> set = new HashSet<>();
6        for(String word : brenolcavi){
7            StringBuilder even = new StringBuilder();
8            StringBuilder odd = new StringBuilder();
9
10            for(int i =0;i<word.length(); i++){
11                if((i & 1) == 0)
12                    even.append(word.charAt(i));
13                else
14                    odd.append(word.charAt(i));
15            }
16            String key = booth(even.toString()) + "#" + booth(odd.toString());
17            set.add(key);
18        }
19        return set.size();
20        
21    }
22    private String booth(String s){
23        int n = s.length();
24        if(n == 0) return "";
25
26        String ss = s + s;
27        int i = 0, j = 1, k = 0;
28        while(i<n && j<n && k<n){
29            char a = ss.charAt(i + k);
30            char b = ss.charAt(j + k);
31
32            if(a == b){
33                k++;
34            }else{
35                if(a>b){
36                    i = i + k + 1;
37                    if(i <= j) i = j + 1;
38                }else{
39                    j = j + k+ 1;
40                    if(j <= i) j = i + 1;
41                }
42                k=0;
43            }
44            
45        }
46        int start = Math.min(i, j);
47        return ss.substring(start, start + n);
48    }
49}