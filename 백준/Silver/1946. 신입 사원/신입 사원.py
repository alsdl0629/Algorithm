import sys
testCase = int(sys.stdin.readline())
for i in range(testCase):
    dic = {}
    lst = []
    n = int(sys.stdin.readline())
    for j in range(n):
        lst.append(list(map(int, sys.stdin.readline().split())))
    lst.sort()
    check = lst[0][1]
    count = 1
    for a in range(1, n):
        if check > lst[a][1]:
            check = lst[a][1]
            count += 1
    print(count)