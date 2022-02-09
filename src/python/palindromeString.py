# input
# 5
# level
# moon
# abcba
# soon
# gooG
# output
# YES
# NO
# YES
# NO
# YES

N = int(input())

for i in range(N):
    s = input()
    s = s.upper()
    if s == s[::-1]:
        print("#%d YES" %(i + 1))
    else:
        print("#%d NO" %(i + 1))
    # size = len(s)
    # for j in range(size // 2):
    #     if s[j] != s[-1-j]:
    #         print("#%d NO" %(i + 1))
    #         break
    # else:
    #     print("#%d YES" %(i + 1))