# 1 ~ 1000까지의 정수 중 13의 배수의 개수

# input
count = 0

# process
for i in range(1, 1000):
    if i % 13 == 0: # 13의 배수이면 증가
        count += 1 # count
        
    

# output
print(f'1 ~ 1000까지의 정수 중 13의 배수의 개수 : {count}')