1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int res[] = new int[2];
4        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
5        for(int i = 0 ; i < nums.length ; i++) {
6            int req = target - nums[i];
7            if(store.containsKey(req)) {
8                res[0] = i;
9                res[1] = store.get(req);
10                return res;
11            } 
12            store.put(nums[i], i);
13        }
14        return res;
15    }
16}