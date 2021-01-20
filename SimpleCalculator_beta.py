import math

# declaring boolean variables for the symbol in the program 
addition = False
subtraction = False
multiplication = False
division = False
squareRoot = False
power = False
remainder = False

# declaring and initializing solution variable to store the solution of the mathematical expression 
solution = 0.0

# storing the first and the second numbers in the equation 
firstNumber = ""
secondNumber = ""

# boolean variable that turns True after the symbol is found
symbolHasBeenFound = False


# compute method that finds the first and second number along with the symbol provided
# for example if the user enters 10+20
# the firstNumber = 10, secondNumber = 20, and addition = True
def compute():
    global maths
    global addition
    global subtraction
    global multiplication
    global division
    global squareRoot
    global power
    global remainder
    global solution
    global firstNumber
    global secondNumber
    global symbolHasBeenFound

    for i in range(0, len(maths)):
        ch = maths[i]  # extracting the character at index of i
        if ch.isdigit() or ch == '.':
            if not symbolHasBeenFound:
                # here we are adding the character to the firstNumber because the symbol has not been found
                firstNumber = firstNumber + ch
            elif symbolHasBeenFound:
                # here we are adding the character to the secondNumber because the symbol has been found
                secondNumber = secondNumber + ch
        else:
            symbolHasBeenFound = True

            # finding the type of symbol the user has entered
            # ex if the user had entered 10*20
            # the symbol = '*' so the variable multiplication will turn true
            if ch == '+':
                addition = True
            elif ch == '-':
                subtraction = True
            elif ch == '*':
                multiplication = True
            elif ch == '/':
                division = True
            elif ch == '_':
                squareRoot = True
                sqrt(firstNumber)
            elif ch == '^':
                power = True
            elif ch == '%':
                remainder = True

    if addition:
        add(firstNumber, secondNumber)
    elif subtraction:
        sub(firstNumber, secondNumber)
    elif multiplication:
        mul(firstNumber, secondNumber)
    elif division:
        div(firstNumber, secondNumber)
    elif power:
        pow_er(firstNumber, secondNumber)
    elif remainder:
        rem(firstNumber, secondNumber)


def add(a, b):
    global solution
    solution = float(a) + float(b)


def sub(a, b):
    global solution
    solution = float(a) - float(b)


def mul(a, b):
    global solution
    solution = float(a) * float(b)


def div(a, b):
    global solution
    solution = float(a) / float(b)


def sqrt(a):
    global solution
    solution = math.sqrt(float(a))


def pow_er(a, b):
    global solution
    solution = pow(float(a), float(b))


def rem(a, b):
    global solution
    solution = float(a) % float(b)


def display():
    global solution
    global maths
    print(maths + " = " + str(solution) + "\n")


def initialize():
    global addition
    global subtraction
    global multiplication
    global division
    global squareRoot
    global power
    global remainder
    global solution
    global firstNumber
    global secondNumber
    global symbolHasBeenFound

    # re initialising all the variable after the program has been executed
    addition = False
    subtraction = False
    multiplication = False
    division = False
    squareRoot = False
    power = False
    remainder = False
    solution = 0.0
    firstNumber = ""
    secondNumber = ""
    symbolHasBeenFound = False


while True:
    maths = input("Enter mathematical expression: ")
    compute()
    display()
    initialize()
