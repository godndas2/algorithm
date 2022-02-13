# input
# 5
# 1 4
# 2 3
# 3 5
# 4 6
# 5 7
# output
# 3

N = int(input())
meet = []
for i in range(N):
    S, E = map(int, input().split())
    meet.append((S, E)) # (1,4) (2,3) ...
meet.sort(key = lambda x : (x[1], x[0]))

et = 0
cnt = 0

for S, E in meet:
    if S >= et:
        et = E
        cnt += 1
        
print(cnt)