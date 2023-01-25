#returns the contiguous subarray with the maximum sum
#Application of the kadane's algorithm
class solution:
    def kadanearray(self,a:list[int])->list[int]:
        sum=0
        max=0
        s=0
        e=0

        for i in range(len(a)):
            sum+=a[i]
            if sum>max:
                max=sum
                e=i
            if sum<0:
                sum=0
                s=i+1
        return a[s:e+1]
        
kd = solution()
print(kd.kadanearray([-2,1,-3,4,-1,2,1,-5,4]))
