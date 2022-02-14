# input
# 8
# 5 3 4 0 2 1 1 0
# output
# 4 8 6 2 5 1 3 7

N = int(input())
a = list(map(int, input().split()))
seq = [0] * N

for i in range(N):
    for j in range(N):
        if a[i] == 0 and seq[j] == 0:
            seq[j] = i + 1
            break
        elif seq[j] == 0:
            a[i] -= 1

for x in seq:
    print(x, end = ' ')