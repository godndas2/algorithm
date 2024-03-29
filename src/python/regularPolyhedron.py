# 정다면체
# input
# 4 6
# output
# 5 6 7

N, M = map(int, input().split())
cnt = [0] * (N + M + 3)
max = 0

for i in range(1, N + 1):
    for j in range(1, M + 1):
        cnt[i + j] += 1

for i in range(N + M + 1):
    if cnt[i] > max:
        max = cnt[i]

for i in range(N + M + 1):
    if cnt[i] == max:
        print(i, end = ' ')