class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Use PriorityQueue for such kind of question
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for(int no : nums){ //int[] nums = {3,2,1,5,8,6,7};
            
            pq.add(no); //add element and compare ; first add 3->2; compare both, minimum will be on peek aways,keep sorting internally.
            
            if(pq.size()> k){ // if 3rd largest , only 3 elements are required inside pq, will be sorted automatically, min on top.
                
                pq.poll(); // remove element from front
            }
        }
         return pq.peek(); // not remove only read and return peek element: mini value will be on top of PQ.
    }
}