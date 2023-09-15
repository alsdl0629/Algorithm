a = int(input())
lst = []
for i in range(a):
    age, name = input().split()
    lst.append([int(age), name, a])
lst.sort(key=lambda x: (x[0], x[2]))
lst1 = []
for i in lst:
    print(i[0],i[1])