class Solution {
    public int[] topKFrequent(int[] nums, int k) {

   Map<Integer,Integer> count= new HashMap<>();

   for(int num: nums){
      count.put(num,count.getOrDefault(num,0)+1);
   }

   PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> count.get(b) - count.get(a));

   pq.addAll(count.keySet());


   int[] result= new int[k];

   for(int i=0;i<k;i++){
    result[i]=pq.poll();
   }

   return result;     

    }
}
