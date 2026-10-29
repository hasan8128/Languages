print("Hello , World")
name = "John"
age = 16
print("My name is john") 
print ("I am 16 years old")

name = "mahmudul"
age  = 18
print("My name is" ,   name)
print("I am", age , "years old")

#My favourite colour is green 
my_favourite_colour = "Green"
number_of_letters = 5
print( my_favourite_colour )
print( number_of_letters)

name = input("What is your name ? ")
age = int(input("What is your age ?"))
print(" Hi" , name , "!" , "you are" , age ,"yeras old")

age = int(input())
if age>= 18:
    print(" You are eligible to vote")
else:
    print("Sorry, you are not eligible to vote")

count = 1
while count <= 5:
    print("Count is:", count)
    count += 1

secret_number = 28
guessed_number = int(input("Guess the secret number: "))
while guessed_number != 28:
       guessed_number = int(input("Wrong guess! Try again: "))    

print("Congratulations! You guessed the secret number.")


for i in range (1,11):
    print (i)

for i in range (1,30):
    print("Hello", i)

for i in range(1,21):
     if i % 2 == 0:
        print(i)

for i in range(1, 6):
    for j in range(1, 6):
        print(f"{i} x {j} = {i * j}")

for i in range (1,10):
     if  i == 5:
       continue
     print(i)
     if i ==8:    
       break
     
def square(length):
    return length*length
area = square(34)
print(area)
area = square(45)
print(area)

def identity(name, age = 18):
    print(f"{name} is {age} years old.")
identity ("mahmudul", 18)
identity("john")

def calculate_square_area(side_length):
    return side_length * side_length
result = calculate_square_area(5)
print(result)
result = calculate_square_area(10)
print(result)


def check_vote_eligibility(age):
    if age>= 18:
        return "eligible to vote"
    else:
        return "not eligible to vote"
    
    
print(check_vote_eligibility(20))
print(check_vote_eligibility(12))

def grade(score):
    if score>= 50:
        return "pass"
    else:
        return "fail"
print(grade(56))

def is_prime():
    number = int(input("Please enter the number: "))
    if number<=1:
        return "Not prime"
    for i in range(2, int(number**0.5) + 1):
                if number % i == 0:
                        return "Not prime"
    return "Prime"


print(is_prime())

def numbers(num1, num2):
        sum = num1 + num2
        difference = num1 - num2
        product = num1* num2
        division = num1 / num2 if num2 != 0 else "Division by zero is not allowed"
        return sum, difference, product, division
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
result = numbers(num1, num2)
print(result)

