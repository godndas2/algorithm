# 자릿수의 합
# input
# 3
# 125 15232 97
# output
# 97

N = int(input())
a = list(map(int, input().split()))

def digit_sum(x):
    sum = 0
    for i in str(x):
        sum += int(i)
        
    return sum
    # while x > 0:
    #     sum += x % 10
    #     x = x // 10

    # return sum

max = 0

for x in a:
    tot = digit_sum(x)
    if tot > max:
        max = tot
        res = x

print(res)
