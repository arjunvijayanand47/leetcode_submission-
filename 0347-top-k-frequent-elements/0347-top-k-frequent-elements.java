class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<Integer> uniqueNumbers = new ArrayList<>(counts.keySet());
        uniqueNumbers.sort((a, b) -> counts.get(b) - counts.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueNumbers.get(i);
        }

        return result;
    }
    }
