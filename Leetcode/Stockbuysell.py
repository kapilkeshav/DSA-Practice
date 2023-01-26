class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_ = prices[0]
        maxpro = 0
        for i in range(len(prices)):
            min_=min(min_,prices[i])
            maxpro = max(maxpro,prices[i]-min_)
        return maxpro
            
