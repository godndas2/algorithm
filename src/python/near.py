# 근삿값
# 원본 데이터 중 대상 데이터와 가장 가까운 값

import sys

def main():
    # init
    min = sys.maxsize

    # input
    numbers = [10, 20, 30, 27, 17]
    N = len(numbers)
    target = 25
    near = 0 # 가까운 값 27

    # process
    for i in range(0, N):
        _abs = abs(numbers[i] - target) # 차잇값의 절댓값
        if _abs < min:
            min = _abs # min algorithm
            near = numbers[i] # near algorithm : 차잇값의 절댓값의 최솟값

    # output
    print(f"{target}와/과 가장 가까운 값: {near}(차이: {min})")


if __name__ == "__main__":
    main()