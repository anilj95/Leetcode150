class Solution {
    // almost similar to String permutaion in eclipse code.
    // just one extra method we have to write for adding arrray to list.
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList();
        
        permutation(list, nums, 0);
        
        return list;
        
    }
    
    public void permutation(List<List<Integer>> list, int[] arr, int fi){
        
        
        if(fi == arr.length-1){
            
            list.add(toList(arr));
            
        }
        
        for(int i = fi ; i< arr.length;i++){
              swap(arr,i,fi);
              permutation(list, arr, fi+1);
              swap(arr,i,fi);
        }
        
    }
    
    public void swap(int[] arr, int i, int fi){
        
        int temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
    
    public List<Integer> toList(int[] nums){
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums){
            
            list.add(i);
        }
        
        return list;
    }
    
    
}