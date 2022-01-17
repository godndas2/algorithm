# 2개의 정수배열 합치기

# input
first = [1, 3, 5] # ASC
second = [2, 4] # ASC
M = len(first); N = len(second); # M:N
merge = [0] * (M + N) # 병합된 배열
i = 0; j = 0; k = 0

# process
while (i < M and j < N): # 둘 중 하나라도 배열의끝에 도달할 때까지
    if first[i] < second[j]:
        merge[k] = first[i]; k += 1; i += 1;
    else:
        merge[k] = second[j]; k += 1; j += 1;

while (i < M): # 첫 번째 배열이 끝까지 도달할 때까지
    merge[k] = first[i]; k += 1; i += 1;

while (j < N): # 두 번째 배열이 끝까지 도달할 때까지
    merge[k] = second[j]; k += 1; j += 1;

# output
for item in merge:
    print(item, end= ", ")
print()
    