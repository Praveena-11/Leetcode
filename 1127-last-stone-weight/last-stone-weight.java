class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            maxHeap.add(num);
        }
         while(maxHeap.size()>1){
            int x=maxHeap.poll();
            int y=maxHeap.poll();
            if(x!=y){
                maxHeap.add(x-y);
            }
         }
         if(maxHeap.size()==1){
            return maxHeap.peek();
         }
         return 0;
    }
}