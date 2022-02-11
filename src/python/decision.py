# input
# 4 11
# 802
# 743
# 457
# 539
# output
# 200

def Count(len):
    cnt = 0
    for x in Line:
        cnt += (x // len)

    return cnt

K, N = map(int, input().split())
Line = []
res = 0
largest = 0

for i in range(K):
    tmp = int(input())
    Line.append(tmp)
    largest = max(largest, tmp)

lt = 1
rt = largest

while lt <= rt:
    mid = (lt + rt) // 2
    if Count(mid) >= N:
        res = mid
        lt = mid + 1
    else:
        rt = mid - 1

print(res)


