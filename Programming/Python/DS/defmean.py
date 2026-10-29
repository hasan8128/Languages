def median(data):
    data.sort()
    n = len(data)

    if n % 2 == 1:
        return data[n //2]
    else:
        middle1 = data[n//2 -1]
        middle2 = data[n//2]
        return (middle1 + middle2)/2

data = [1,2, 3, 4, 5]

print(median(data))

print(median([12, 7, 25, 9, 18, 30]))