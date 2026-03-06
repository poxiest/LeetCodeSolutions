1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        // holds all the values 
4        int vis[] = new int[128];
5
6        int start = 0;
7        int ans = 0;
8
9        for (int end = 0; end < s.length(); end++) {
10            // get the right most start 
11            start = Math.max(start, vis[s.charAt(end)]);
12            ans = Math.max(ans, end - start + 1);
13            vis[s.charAt(end)] = end + 1;
14        }
15        return ans;
16    }
17}