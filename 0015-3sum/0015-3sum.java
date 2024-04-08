class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

       // we will use two pointer again, for triplet, we will fix 0th element and apply 2 pointers
        // then we will check all possible triplets, after that we will fix 1st elemnt and keep finding triplets which sum=0;
        
       if (arr == null || arr.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {

          // Add the set, and move to find other triplets
          result.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          right--;
        } else if (sum < 0)
          left++;
        else
          right--;
      }
    }
    return new ArrayList<>(result);
        
    }
}