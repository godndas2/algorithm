# input
# 10
# 69 42 68 76 40 87 14 65 76 81
# 50
# output
# 20

L = int(input())
a = list(map(int, input().split()))
m = int(input())

a.sort()
for _ in range(m):
    a[0] += 1
    a[L - 1] -= 1
    a.sort()

print(a[L - 1] - a[0])