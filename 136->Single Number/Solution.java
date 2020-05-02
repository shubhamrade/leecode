class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> wordCount = new HashMap<Integer, Integer>();

		for (int number : nums) {

			wordCount.put(number, (wordCount.containsKey(number) ? (wordCount.get(number) + 1) : 1));

		}

		for (Integer key : wordCount.keySet()) {

			if (wordCount.get(key) == 1) {
				return key;
			}

		}

		return 0;
    }
}