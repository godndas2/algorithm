# 소수의 개수 (Eratosthenes)
# input
# 20
# output
# 8

N = int(input())
ch = [0] * (N + 1)
cnt = 0

for i in range(2, N + 1):
    if ch[i] == 0:
        cnt += 1
        for j in range(i, N + 1, i):
            ch[j] = 1

print(cnt)