1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        
4        Map<String, List<String>> anagrams = new HashMap<>();
5
6        for (String s : strs) {
7            char[] sc = s.toCharArray();
8            Arrays.sort(sc);
9            String key = new String(sc);
10            anagrams.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
11        }
12
13        return new ArrayList<>(anagrams.values());
14    }
15}