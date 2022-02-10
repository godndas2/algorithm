# input
# 3
# 1 3 5
# 5
# 2 3 6 7 9
# output
# 1 2 3 3 5 6 7 9

N = int(input())
A = list(map(int, input().split()))
M = int(input())
B = list(map(int, input().split()))

p1=p2=0
c=[]

while p1 < N and p2 < M:
    if A[p1] <= B[p2]:
        c.append(A[p1])
        p1 += 1
    else:
        c.append(B[p2])
        p2 += 1
if p1 < N:
    c = c + A[p1:]
if p2 < M:
    c = c + B[p2:]
for x in c:
    print(x, end = ' ')
