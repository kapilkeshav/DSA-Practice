class Solution:

    def nextPermutation(self, nums: List[int]) -> None:
        i=0
        j=0
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                break
            i=-1
        if i<0:
            nums.reverse()
        else:
            for j in range(len(nums)-1,i,-1):
                if nums[j]>nums[i]:
                    break
            nums[i],nums[j]=nums[j],nums[i]
            start,end = i+1,len(nums)
            nums[start:end]=nums[start:end][::-1]
