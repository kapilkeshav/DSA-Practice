class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        for i in range(len(matrix)):
            for j in range(i,len(matrix)-1):
                matrix[i][j+1],matrix[j+1][i]=matrix[j+1][i],matrix[i][j+1]
        
        for i in range(len(matrix)):
            left,right=0,len(matrix[i])-1
            while(left<right):
                temp=matrix[i][left]
                matrix[i][left]=matrix[i][right]
                matrix[i][right]=temp
                left+=1
                right-=1
