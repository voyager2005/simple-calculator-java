import java.util.Scanner; 

public class SimpleCalculator
{
    boolean addition = false; 
    boolean subtraction = false; 
    boolean multlipication = false; 
    boolean division = false; 
    boolean squareRoot = false; 
    boolean power = false; 
    boolean remainder = false; 

    double solution; 

    String firstNumber = ""; 
    String secondNumber = "" ; 
    String input = "" ;
    boolean whiteSpaceCounter = false; 

    void compute(Scanner sc)
    {
        // accpeting value
        input = sc.nextLine().trim();

        for(int i = 0 ; i < input.length() ; i++)
        {
            char ch = input.charAt(i); 

            if( Character.isDigit(ch) || ch == '.')
            {
                if(whiteSpaceCounter == false)
                {
                    firstNumber = firstNumber + ch ; 
                }
                else if(whiteSpaceCounter == true)
                {
                    secondNumber = secondNumber + ch ;
                }
            }
            else 
            {
                whiteSpaceCounter = true; 

                if( ch == '+')
                    addition = true; 
                else if( ch == '-')
                    subtraction = true; 
                else if( ch == '*')
                    multlipication = true; 
                else if( ch == '/')
                    division = true; 
                else if(ch == '_')
                {
                    squareRoot = true; 
                    squareRoot(firstNumber); 
                }
                else if( ch == '^')
                    power = true; 
                else if( ch == '%')
                    remainder = true; 
            }
        }

        if(addition == true)
            addition(firstNumber, secondNumber); 
        else if(subtraction == true)
            subtraction(firstNumber, secondNumber); 
        else if(multlipication == true)
            multlipication(firstNumber, secondNumber); 
        else if(division == true)
            division(firstNumber, secondNumber); 
        else if(power == true)
            power(firstNumber, secondNumber); 
        else if(remainder == true)
            remainder(firstNumber, secondNumber); 
    }

    double addition( String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = x + y ; 

        return solution; 
    }

    double subtraction( String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = x - y; 

        return solution; 
    }

    double multlipication( String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = x * y; 

        return solution; 
    }

    double division(String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = x / y ; 

        return solution; 
    }

    double squareRoot(String a)
    {
        double x = Double.parseDouble(a);

        solution = Math.sqrt(x); 

        return solution; 
    }

    double power(String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = Math.pow(x,y); 

        return solution; 
    }

    double remainder(String a, String b)
    {
        double x = Double.parseDouble(a); 
        double y = Double.parseDouble(b); 

        solution = x % y; 

        return solution; 
    }

    void display()
    {
        System.out.println(input + " = " + solution); 
    }

    void initialize()
    {
        addition = false; 
        subtraction = false; 
        multlipication = false; 
        division = false; 
        squareRoot = false; 
        power = false; 
        remainder = false; 

        solution = 0; 

        firstNumber = ""; 
        secondNumber = "" ; 
        whiteSpaceCounter = false; 
    }

    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in); 
        SimpleCalculator obj = new SimpleCalculator(); 
        int thread = 0 ; 

        while(thread == 0)
        {
            System.out.print("Enter mathematical expression: "); 
            obj.compute(sc); 
            obj.display(); 
            obj.initialize();  
        }
    }
}
