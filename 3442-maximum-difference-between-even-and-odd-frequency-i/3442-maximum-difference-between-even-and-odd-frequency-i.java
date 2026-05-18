class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c , 1);
            }
            else{
                map.put(c , map.get(c)+1);
            }
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(var e: map.entrySet()){
            if(e.getValue() > max && e.getValue() % 2 != 0) max = e.getValue();
            if(e.getValue() < min && e.getValue() % 2 == 0) min = e.getValue();
        }
        return (max-min);
    }
}