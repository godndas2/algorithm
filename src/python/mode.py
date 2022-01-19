# 가장 많이 중복된 값

import sys

# input
scores = [1, 3, 4, 3, 5]
indexes = [0] * (5 + 1) # 0 ~ 5까지 점수 인덱스의 개수 저장
max = -sys.maxsize - 1 # Max algorithm
mode = 0 # 최빈값이 담길 변수

# process
for i in range(0, len(scores)):
    indexes[scores[i]] = indexes[scores[i]] + 1 # count
for i in range(0, len(indexes)):
    if indexes[i] > max:
        max = indexes[i] # Max
        mode = i # Mode

# output
print(f"최빈값은: {mode} -> {max} 번 중복됨")