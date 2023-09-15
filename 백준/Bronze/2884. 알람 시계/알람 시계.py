h, m = map(int, input().split())
a = 45

if m - 45 >= 0:
    print(h, m - 45)
else:
    if h == 0:
        print(23, (60 + (m - 45)) % 60)
    else:
        h -= 1
        print(h, (60 + (m - 45)) % 60)