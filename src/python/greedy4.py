# input
# 5 140
# 90 50 70 100 60
# output
# 3
from collections import deque

N, limit = map(int, input().split())
p = list(map(int, input().split())) # 승객의 몸무게
p.sort()
p = deque(p)
cnt = 0

while p:
    if len(p) == 1:
        cnt += 1
        break
    if p[0] + p[-1] > limit:
        p.pop() 
        cnt += 1
    else:
        p.popleft() # deque collections
        p.pop()
        cnt += 1

print(cnt)

