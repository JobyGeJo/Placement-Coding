numbers = [1, 2, 3, 3, 4, 5, 2, 7, 3, 8]

Sum = 0
for i in range(1, len(numbers), 2):
    Sum += numbers[i]

print(Sum)