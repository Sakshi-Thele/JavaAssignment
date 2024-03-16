1)Write a program that takes a numerical grade as input and outputs the corresponding letter
grade using if-else statements

public class GradeConverter {
    public static void main(String[] args) {
      
        int numericalGrade = 85;

        char letterGrade;

        if (numericalGrade >= 90) {
            letterGrade = 'A';
        } else if (numericalGrade >= 80) {
            letterGrade = 'B';
        } else if (numericalGrade >= 70) {
            letterGrade = 'C';
        } else if (numericalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("The corresponding letter grade is: " + letterGrade);
    }
}

o/p
The corresponding letter grade is: B
2)Write a program that checks if a given year is a leap year or not using both if-else and
switch-case.

Using if-else statements:
java

public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024; 
        
        boolean isLeapYear = false;
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
o/p:
2024 is a leap year

Using switch-case statements 

public class LeapYearCheckerSwitch {
    public static void main(String[] args) {
        int year = 2024; 
        
        boolean isLeapYear;
        
        switch (year % 400) {
            case 0:
                isLeapYear = true;
                break;
            default:
                switch (year % 100) {
                    case 0:
                        isLeapYear = false;
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                isLeapYear = true;
                                break;
                            default:
                                isLeapYear = false;
                                break;
                        }
                        break;
                }
                break;
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
o/p 2024 is a leap year.



Q3.Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
input and performs the operation using switch-case.


public class SimpleCalculator {
    public static void main(String[] args) {
        
        double num1 = 10;
        double num2 = 5;
        char operator = '*'; 
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                break;
        }
    }
}

o/p:Result: 50.0

4)Write a program that takes a number representing a weekday (1-7) and prints the name of the
weekday using switch-case


public class WeekdayName {
    public static void main(String[] args) {
        int dayNumber = 3; 
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        System.out.println("Day " + dayNumber + " corresponds to " + dayName);
    }
}
o/p:Day 3 corresponds to Tuesday

5)Write a program that takes a character as input and determines whether it’s a vowel or a
consonant using if-else.


public class VowelConsonantChecker {
    public static void main(String[] args) {
        char ch = 'a'; 

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
    }
}
o/p:a is a vowel.


Q6.)Implement a program that calculates the Body Mass Index (BMI) based on height and weight
input using if-else to classify the BMI int categories (underweight, normal weight, overweight,
etc.)


public class BMIcalculator {
    public static void main(String[] args) {
        
        double height = 1.75; 
        double weight = 70;   
        
        double bmi = weight / (height * height);

        
        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
    }
}

o/p:Category: Normal weight