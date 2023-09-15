a = int(input())
lst = []

for i in range(a):
    x, y = input().split()
    lst.append([int(x), int(y)])
lst.sort(key=lambda x: (x[0], x[1]))

for i in lst:
    print(i[0], i[1])