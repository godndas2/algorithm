# input
# 8 3
# 1 2 1 3 1 1 1 2
# output
# 5

N, M = map(int, input().split())
A = list(map(int, input().split()))
lt = 0
rt = 1
tot = A[0]
cnt = 0

while True:
    if tot < M:
        if rt < N:
            tot += A[rt]
            rt += 1
        else:
            break
    elif tot == M:
        cnt += 1
        tot -= A[lt]
        lt += 1
    else:
        tot -= A[lt]
        lt += 1

print(cnt)