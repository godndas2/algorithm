# k번 째 큰 수
# input
# 10 3
# 13 15 34 23 45 65 33 11 26 42
# output
# 143

n, k = map(int, input().split())
a = list(map(int, input().split()))
res = set() # distinct

for i in range(n):
    for j in range(i + 1, n):
        for m in range(j + 1, n):
            res.add(a[i] + a[j] + a[m])
res = list(res)
res.sort(reverse=True) # DESC
print(res[k-1])
