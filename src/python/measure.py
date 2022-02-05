# k번 째 약수, 약수가 아닐 경우 -1 출력
# 약수 : 6 3
# 약수가 아닌 수 : 6 5

n, k = map(int, input().split())
cnt = 0

for i in range(1, n + 1):
    if n % i == 0:
        cnt += 1
    if cnt == k:
        print(i)
        break
else:
    print(-1)