class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map <String,Integer> map1=new HashMap<>();
        List<String> result=new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++){
            String word=list2[j];
            if(map1.containsKey(word)){
                int total=j+map1.get(word);
                if(total<min){
                    result.clear();
                    result.add(word);
                    min=total;
                }else if(total==min){
                    result.add(word);
                }
            }
            
        }
        return result.toArray(new String[0]);

    }
}