1class Solution {
2    public int trap(int[] height) {
3        int res = 0;
4        int lHeight[] = new int[height.length];
5        int rHeight[] = new int[height.length];
6
7        // maintians max left height
8        lHeight[0] = height[0];
9        for(int i = 1 ; i < height.length ; i++) {
10            lHeight[i] = Math.max(lHeight[i-1], height[i]);
11        }
12
13        // maintain max right height
14        rHeight[height.length-1] = height[height.length-1];
15        for(int i = height.length-2 ; i >= 0  ; i--) {
16            rHeight[i] = Math.max(rHeight[i+1], height[i]);
17        }
18
19        for(int i = 0 ; i < height.length ; i++) {
20            res += Math.min(lHeight[i], rHeight[i]) - height[i];
21        }
22
23        return res;
24    }
25}