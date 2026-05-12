class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = nums1.length+nums2.length;
        int[] arr = new int[n];
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];

        }

        if(arr.length % 2 != 0){
            return arr[arr.length / 2];
        }
        else{
            double a = arr[arr.length/2];
            double b = arr[(arr.length/2)-1];
            double ans = ((a+b) / 2);
            return ans;
        }

    }
}