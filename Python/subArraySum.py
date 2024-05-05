numbers = [1, 2, -3, 3, -4, 5, 2, -7, 3, 8]

Max = float('-inf')
Sum = 0

for i in range(len(numbers)):
    Sum += numbers[i]

    if Max < Sum:
        Max = Sum

    if Sum < 0:
        Sum = 0

print(Max)