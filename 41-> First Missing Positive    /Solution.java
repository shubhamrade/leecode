class Solution {
    public int firstMissingPositive(int[] nums) {
       int result = 1;
		List<Integer> sortedArray = Arrays.stream(nums).boxed().filter(a -> (a > 0)).collect(Collectors.toList());
        
        Collections.sort(sortedArray);

		while (true) {

			if (!sortedArray.contains(result)) {
				return result;
			}

			result++;

		}
    }
}