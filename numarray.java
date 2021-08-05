class NumArray {
    int len;
    int[] sum;
    public NumArray(int[] nums) {
        this.len = nums.length;
        sum = new int[len];
        for(int i=0;i<len;i++){
            if(i==0) sum[0] = nums[0];
            else sum[i] = nums[i] + sum[i-1];
        }
    }
    public int sumRange(int i, int j) {
        if(i==0) return sum[j];
        return (sum[j]-sum[i-1]);
    }
}

Output: [null, 1, -1, -3]