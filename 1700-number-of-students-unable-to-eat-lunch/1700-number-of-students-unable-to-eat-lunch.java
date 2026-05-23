class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int onestu =0;
        int zerstu = 0;

        for(int i =0;i<students.length;i++){
            if(students[i] == 1)onestu++;
            else zerstu++;
        }

        for(int i =0;i<sandwiches.length;i++){
            if(sandwiches[i] == 1 && onestu == 0) break;
            if(sandwiches[i] == 0 && zerstu == 0) break;
            if(sandwiches[i] == 1 && onestu > 0)onestu--;
            if(sandwiches[i] == 0 && zerstu > 0)zerstu--;
        }
        
        int ans = onestu + zerstu;
        return ans;
    }
}