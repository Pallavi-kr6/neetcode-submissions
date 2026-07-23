class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]leftp=new int[n];
        leftp[0]=1;
        for(int i=1;i<nums.length;i++){
             
            leftp[i]=leftp[i-1]*nums[i-1];
        }
        int[]rightp=new int[n];
        rightp[n-1]=1;
        for(int i=n-2;i>=0 ;i--){
            rightp[i]=rightp[i+1]*nums[i+1];
        }
        int []ans=new int[n];
        for(int i=0;i<n;i++){
         ans[i]=leftp[i]*rightp[i];
        }
        return ans;
    }
}  
