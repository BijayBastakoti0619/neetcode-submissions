class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> count= new HashMap<>();

        for(int num:nums){
         count.put(num,count.getOrDefault(num,0)+1);
        }
       
        List<Integer> list= new ArrayList<>(count.keySet());
        list.sort((a,b)-> count.get(b) - count.get(a));

        int[] result= new int[k];

        for(int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        
        
        return result;

    }
}
