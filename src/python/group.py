# 컬렉션 형태의 데이터를 특정 키 값에 해당하는 그룹화 된 합계 리스트

class Record():
    def __init__(self, name, quantity):
        self.name = name # 상품명
        self.quantity = quantity # 수량
        
def main():
    # input
    records = [ Record("Radio", 3), Record("TV", 1), Record("Radio", 2), Record("DVD", 4) ]
    groups = [  ]
    N = len(records)

    # process # Sort -> Sum -> Group

    # Sort # Selection Sort
    for i in range(0, N - 1):
        for j in range(i + 1, N):
            if (records[i].name > records[j].name):
                temp = records[i]
                records[i] = records[j]
                records[j] = temp

    # Group
    sum = 0 # 합계
    for i in range(N):
        sum += records[i].quantity # 같은 상품명의 수량을 합침
        if (i + 1) == N or records[i].name != records[i + 1].name:
            # 한 그룹의 key 지정 및 합침
            groups.append(Record(records[i].name, sum)) # 하나의 그룹 저장
            sum = 0 # 하나의 그룹이 저장되면 합계 초기화

    # output
    print("[1] 원본 데이터")
    for r in records:
        print(f"{r.name.rjust(6)} - {r.quantity}")
    
    print("[2] 이름으로 그룹화 된 데이터")
    for g in groups:
        print(f"{g.name.rjust(6)} - {g.quantity}")

if __name__ == "__main__":
    main()
    