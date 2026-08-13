class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            int[] count = new int[26];

            // Count each character
            for (int j = 0; j < strs[i].length(); j++) {

                char c = strs[i].charAt(j);

                count[c - 'a']++;
            }

            // Create a unique key from the counts
            StringBuilder key = new StringBuilder();

            for (int value : count) {
                key.append("#");
                key.append(value);
            }

            String finalKey = key.toString();

            // If this pattern doesn't exist yet,
            // create a new list
            if (!map.containsKey(finalKey)) {
                map.put(finalKey, new ArrayList<>());
            }

            // Add current word to its anagram group
            map.get(finalKey).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}