1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> results = new ArrayList<>();
4        // sort to perform 2 pointer approach to find 2nd and 3rd 
5        Arrays.sort(nums);
6        for(int i = 0 ; i < nums.length - 2 ; i++) {
7            // eliminate duplicates 
8            if (i > 0 && nums[i] == nums[i-1]) continue;
9
10            int l = i+1, r = nums.length - 1;
11            while(l < r) {
12                int s = nums[i] + nums[l] + nums[r];
13                if (s > 0)
14                    r--;
15                else if (s < 0) 
16                    l++;
17                else {
18                    results.add(List.of(nums[i], nums[l], nums[r]));
19                    l++; r--;
20
21                    // eliminate duplicates
22                    while ( nums[l-1] == nums[l] && l < r)
23                        l++;
24                    
25                    // eliminate duplciates 
26                    while ( nums[r+1] == nums[r] && l < r)
27                        r--;
28                }
29            }
30        }
31        return results;
32    }
33}