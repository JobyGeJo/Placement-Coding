numbers = [1, 2, 3, 3, 4, 5, 2, 7, 3, 8]
length = len(numbers)

for i in range(length):

    if numbers[i] == -1:
        continue

    count = 1
    for j in range(i+1, length):

        if numbers[i] == numbers[j]:
            numbers[j] = -1
            count += 1

    print(f"{numbers[i]} --> {count}")