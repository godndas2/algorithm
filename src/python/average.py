# n명의 점수 중에서 80점 이상 95점 이하인 점수의 평균

# input
data = [90, 65, 78, 50, 95]
sum = 0;
count = 0;
N = len(data)

# process avg = sum / count
for i in range(0, N):
    if data[i] >= 80 and data[i] <= 95:
        sum += data[i]
        count += 1
        
avg = 0.0
if sum != 0 and count != 0:
    avg = sum / count
    
# output
print(f"80점 이상 95점 이하인 평균: {avg:.2f}")