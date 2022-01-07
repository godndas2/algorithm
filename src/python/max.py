# 가장 큰 값을 구하시오

import sys

def main():
    # init (초기화)
    max = -sys.maxsize - 1; # 가장 작은 값으로 초기화

    # input
    numbers = [-2, -5, 0, -7, -1]
    N = len(numbers)

    # process
    for i in range(0, N):
        if numbers[i] > max:
            max = numbers[i] # max: 더 큰 값으로 할당

    # output
    print(f'최댓값: {max}')

if __name__ == "__main__":
        main()
        
    