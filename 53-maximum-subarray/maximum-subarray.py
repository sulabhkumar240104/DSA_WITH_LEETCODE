class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum=0
        maxsum=nums[0]
        for num in nums:
            sum+=num
            maxsum=max(sum,maxsum)
            if(sum<0):
                sum=0
            
        return maxsum
  