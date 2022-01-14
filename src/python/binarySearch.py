# 정렬되어있는 데이터를 이진탐색을 사용하여 반씩 나눠서 검색

def main():
    # input
    data = [1, 3, 5, 7, 9] # desc
    N = len(data)
    search = 3 # 찾을 데이터
    flag = False # 찾으면 true
    index = -1 # 못찾을 때 -1 return

    # process
    low = 0 # min index
    high = N - 1 # max index
    
    while low <= high:
        mid = int((low + high) / 2) # mid index
        if data[mid] == search:
            flag = True; index = mid; break;
        if data[mid] > search:
            high = mid - 1 # 찾을 데이터가 작으면 왼쪽으로
        else:
            low = mid + 1 # 찾을 데이터가 크면 오른쪽으로
            
    # output
    if flag:
        print(f"{search}을(를) {index} 위치에서 찾았습니다.")
    else:
        print("데이터를 찾을 수 없습니다.")

if __name__ == "__main__":
    main()
    