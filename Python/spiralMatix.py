Matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16]
]

M = len(Matrix)
N = len(Matrix[0])
ans = []

rowCountCondition = [0, 1, 0, -1]
columnCountCondition = [1, 0, -1, 0]
currendIndex = 0

x, y = 0, 0
m, n = 0, 0

for _ in range(M * N):

    ans.append(Matrix[x][y])
    
    current_XCount = rowCountCondition[currendIndex]
    current_YCount = columnCountCondition[currendIndex]

    x += current_XCount
    y += current_YCount

    if not (m <= x < M and n <= y < N):

        x -= current_XCount
        y -= current_YCount

        if current_YCount + current_XCount > 0:
            m += current_XCount
            n += current_YCount
        
        else:
            M += current_XCount
            N += current_YCount

        currendIndex = (currendIndex + 1) % 4

        x += rowCountCondition[currendIndex]
        y += columnCountCondition[currendIndex]

print(ans)