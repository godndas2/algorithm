# n명의 점수 중에서 80점 이상인 점수의 합계

# Input: n명의 점수
sources = [100, 75, 50, 37, 90, 95]
sum = 0 # 합계가 저장될 변수

N = len(sources)

# process: 합계 (알고리즘)
for i in range(0, N): # 범위
    if sources[i] >= 80: # 조건
        sum = sum + sources[i] # 합계

# Output
print(f"{N}명의 점수 중 80점 이상의 총점: {sum}")
