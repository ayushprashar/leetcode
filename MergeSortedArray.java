class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int k = 0;
        int i=0;
        int j=0;
        for(; i<m && j < n && k < nums1.length; k++) {
            if(nums1[i]<=nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
        }
        
        if(i != m) {
            while(i < m && k < nums1.length) {
                temp[k] = nums1[i];
                i++;
                k++;
            }
        } else if( j != n) {
            while(j < n && k < nums1.length) {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        for(i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
        }
        
    }
}