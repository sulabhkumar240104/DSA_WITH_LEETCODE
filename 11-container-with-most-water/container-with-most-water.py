class Solution:
    def maxArea(self, height: List[int]) -> int:
        lt=0
        n=len(height)
        rt=n-1
        maw=0
        while lt<rt:
            wi=rt-lt
            hi=min(height[lt],height[rt])
            area=wi*hi
            maw=max(maw,area)
            if height[lt]<height[rt]:
                lt+=1
            else :
                rt-=1

        return maw