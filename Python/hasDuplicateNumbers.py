numbers = [1, 2, 3, 3, 4, 5, 2, 7, 3, 8]
length = len(numbers)

for i in range(length):

    if numbers[i] == -1:
        continue

    hasDuplicate = False
    for j in range(i+1, length):

        if numbers[i] == numbers[j]:
            numbers[j] = -1
            hasDuplicate = True

    if hasDuplicate:
        print(numbers[i], end=' ')
