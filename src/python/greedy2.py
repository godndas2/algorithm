# input
# 5
# 172 67
# 183 65
# 180 70
# 170 72
# 181 60
# output
# 3

N = int(input())
body = []

for i in range(N):
    a, b = map(int, input().split())
    body.append((a, b))
body.sort(reverse=True) # DESC

largest = 0
cnt = 0

for x, y in body:
    if y > largest:
        largest = y
        cnt += 1

print(cnt)