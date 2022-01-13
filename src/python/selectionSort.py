# 무작위 데이터를 오름차순 or 내림차순으로 정렬

def main():
    # input
    data = [3, 2, 1, 5, 4]
    N = len(data)

    # process
    for i in range(N -1):
        for j in range(i + 1, N):
            if data[i] > data[j]: # ASC 
                temp = data[i]
                data[i] = data[j]
                data[j] = temp
                
    # output
    for i in range(N):
        print(data[i])


if __name__ == '__main__':
    main()
    