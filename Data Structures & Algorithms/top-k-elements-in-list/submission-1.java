class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[]res=new int[k];
       
List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int i=0;
        for (Map.Entry<Integer, Integer> entry : list){
            res[i++]=entry.getKey();
            if(i==k)break;
        }
        return res;
    }
}
