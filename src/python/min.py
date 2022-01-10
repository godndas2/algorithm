# 가장 작은 짝수 값을 구하시오

import sys

def main():
    # init
    min = sys.maxsize # 큰 값으로 초기화

    # input
    numbers = [2, 5, 3, 7, 1] # min: 1 -> min: 2 (짝수)
    N = len(numbers)

    # process
    for i in range(0, N):
        if numbers[i] < min and numbers[i] % 2 == 0: # 최솟값 (짝수)
            min = numbers[i] # min

    # output
    print(f"최솟값 (짝수): {min}")

if __name__ == "__main__":
    main()
    