h, m = map(int, input().split())
plus = int(input())

if m + plus < 60:
    print(h, m + plus)
else:
    if (m + plus) // 60 + h < 24:
        print((m + plus) // 60 + h, (m + plus) % 60)
    else:
        print((m + plus) // 60 + h - 24, (m + plus) % 60)