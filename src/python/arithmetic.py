# 1부터 20까지의 정수 중 홀수의 합
# 등차수열(Arithmetic Sequence) : 연속하는 두 수의 차이가 일정한 수열

# Input
sum = 0;

# Process
for i in range(1, 20): # 주어진 범위
    if i % 2 != 0: # 홀수로 필터링
        sum += i
        print(i, end=' ')

# Output
print(f'1부터 20까지의 홀수의 합: {sum}')