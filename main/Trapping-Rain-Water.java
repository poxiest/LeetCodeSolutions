1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int[] l = new int[n];
5        int[] r = new int[n];
6        l[0] = height[0];
7        r[n-1] = height[n-1];
8        int ans = 0;
9
10        for(int i = 1 ; i < n ; i++)
11            l[i] = Math.max(l[i-1], height[i]);
12        
13        for(int i = n-2 ; i >= 0 ; i--)
14            r[i] = Math.max(r[i+1], height[i]);
15
16        for(int i = 0 ; i < n ; i++)
17            ans += Math.min(l[i], r[i]) - height[i]; 
18        
19        return ans;
20    }
21}