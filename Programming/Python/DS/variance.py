import math

def variance(data):
    mean = sum(data)/len(data)

    squared_deviations = []

    for x in data:
        deviation = x - mean
        squared = deviation**2
        squared_deviations.append(squared)

    return sum(squared_deviations)/len(data)
    


def standard_deviation(data):
    return math.sqrt(variance(data))

data = [10, 20, 30]

print(variance(data))
print(standard_deviation(data))

