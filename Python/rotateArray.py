numbers = [1, 2, 3, 3, 4, 5, 2, 7, 3, 8]
n = 3

n = n % len(numbers)
print(numbers[n:] + numbers[:n])
