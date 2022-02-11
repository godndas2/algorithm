# input
# 8 32
# 23 87 65 12 57 32 99 81
# output
# 3

N, M = map(int, input().split())
A = list(map(int, input().split()))

A.sort()
lt = 0
rt = N -1

while lt <= rt:
    mid = (lt + rt) // 2
    if A[mid] == M:
        print(mid + 1) # 0번 부터 시작한 index
        break
    elif A[mid] > M:
        rt = mid - 1
    else:
        lt = mid + 1