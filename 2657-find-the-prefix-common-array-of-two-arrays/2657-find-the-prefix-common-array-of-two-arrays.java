class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int[] freq = new int[A.length + 1];
        int[] C = new int[A.length];
        
        for(int i = 0; i < A.length;i++){
            int ans = 0;

            if(i!=0) ans = C[i-1];
            
            if(freq[A[i]] > 0){
                freq[A[i]]++;
                if(freq[A[i]]==2) ans++;
            }
            else freq[A[i]] = 1;

            if(freq[B[i]] > 0){
                freq[B[i]]++;
                if(freq[B[i]]==2) ans++;
            }
            else freq[B[i]] = 1;

            C[i] = ans;
        }
        return C;
}
}