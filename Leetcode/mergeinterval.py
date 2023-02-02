class Solution:
    def merge(self, interval: List[List[int]]) -> List[List[int]]:
        interval.sort()
        temp = interval[0]
        final = []
        for i in interval:
            if temp==i:
                continue
            else:
                if temp[1]>=i[0]:
                    temp[1]=max(temp[1],i[1])
                else:
                    final.append(temp)
                    temp = i
        final.append(temp)
        return final
