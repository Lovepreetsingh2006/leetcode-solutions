class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] C = new int[A.length];
        
        for(int i = 0; i < A.length;i++){
            int ans = 0;
            if(i!=0) ans = C[i-1];
            
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
                if(map.get(A[i])==2) ans++;
            }
            else map.put(A[i],1);

            if(map.containsKey(B[i])){
                map.put(B[i],map.get(B[i])+1);
                if(map.get(B[i])==2) ans++;
            }
            else map.put(B[i],1);

            C[i] = ans;
        }return C;
}}