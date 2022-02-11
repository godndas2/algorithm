# input
# 9 9
# 1 2 3 4 5 6 7 8 9
# output
# 9

def Count(capacity):
    cnt = 1
    sum = 0
    for x in Music:
        if sum + x > capacity:
            cnt += 1
            sum = x
        else:
            sum += x

    return cnt

N, M = map(int, input().split())
Music = list(map(int, input().split()))
MAX = max(Music)

lt = 1
rt = sum(Music)
res = 0

while lt <= rt:
    mid = (lt + rt) // 2
    if mid >= MAX and Count(mid) <= M:
        res = mid
        rt = mid - 1
    else:
        lt = mid + 1

print(res)