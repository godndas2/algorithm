# input
# 5
# big
# good
# sky
# blue
# mouse
# sky
# good
# mouse
# big
# output
# blue

N = int(input())
p = dict()

for  i in range(N):
    word = input()
    p[word] = 1

for i in range(N - 1):
    word = input()
    p[word] = 0

for key, value in p.items():
    if value == 1:
        print(key)
        break
