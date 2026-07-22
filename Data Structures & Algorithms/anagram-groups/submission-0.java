class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==1){
            List<String> n = new ArrayList<>();
            n.add(strs[0]);
            res.add(n);
            return res;
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[]ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
               map.get(sorted).add(s);
            
        }
       for(Map.Entry<String,List<String>> entry : map.entrySet()){
          res.add(entry.getValue());
       }
       return res;
    }
}
