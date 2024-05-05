numbers = [1, 2, 3, 3, 4, 5, 2, 7, 3, 8]
max1 = 0
max2 = -1

for n in numbers:

    if n > max1:
        max2 = max1
        max1 = n

    elif n > max2:
        max2 = n

print(max2)