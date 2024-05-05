number = 9756

while number > 9:

    s = str(number)
    number = '' 
    for c in range(len(s) - 1):
        number += str(abs(int(s[c]) - int(s[c+1])))

    number = int(number)

print(number)