# 등수 구하기

def main():
    # input
    scores = [90, 87, 100, 95, 80]
    N = len(scores)
    ranks = [1] * N # 1로 초기화

    # process
    for i in range(N):
        ranks[i] = 1 # 매번 1등으로 초기화
        for j in range(N):
            if scores[i] < scores[j]: # i(나)와 j(나머지) 비교
                ranks[i] += 1 # i보다 큰 점수가 나오면 1씩 순위 증가

    # output
    for i in range(N):
        print(f"{scores[i]:3}점 : {ranks[i]}등")

        
if __name__ == "__main__":
    main()