# input
# 5 3
# 1
# 2
# 8
# 4
# 9
# output
# 3

def Count(len):
    cnt = 1
    ep = Line[0] # 첫번 째 말 배치
    for i in range(1, N - 1):
        if Line[i] - ep >= len:
            cnt += 1
            ep = Line[i]
    return cnt

N, C = map(int, input().split())
Line=[]
# _ 는 변수가 없다는 뜻
for _ in range(N):
    tmp = int(input())
    Line.append(tmp)
Line.sort()
lt = 1
rt = Line[N - 1]

while lt <= rt:
    mid = (lt+rt) // 2
    if Count(mid) >= C: # 가장 가까운 두 말의 거리
        res = mid
        lt = mid + 1
    else:
        rt = mid - 1

print(res)
