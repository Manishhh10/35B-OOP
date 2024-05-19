package Week3;

import java.util.Scanner;

public class TASK_TO_DO_3 {
    public static void main(String[] args) {

    // QUESTION 1
    // ###############################################
    // // 1. Write a JAVA program to find the maximum between three numbers.
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter the first number:");
    // int first = scan.nextInt();

    // System.out.println("Enter the second number:");
    // int second = scan.nextInt();

    // System.out.println("Enter the third number:");
    // int third = scan.nextInt();

    // if (first>second && first>third) {
    //     System.out.println(first + " is the maximum number out of three"); 
    // }else if (second>first && second>third){
    //     System.out.println(second + " is the maximum number out of three");
    // }else {
    //     System.out.println(third + " is the maximum number out of three");
    // }
    // ###############################################



    // QUESTION 2
    // ###############################################
    // // 2. Write a JAVA program to check whether a number is negative, positive, or zero.

    // Scanner scan2 = new Scanner(System.in);
    // System.out.println("Enter the number to check whether it is negative, positive, or zero.");
    // int the_number = scan2.nextInt();

    // if (the_number < 0) {
    //     System.out.println(the_number + " is negative."); 
    // }else if (the_number==0){
    //     System.out.println("Entered number is zero.");
    // }else {
    //     System.out.println(the_number + " is positive.");
    // }
    // ###############################################



    // QUESTION 3
    // ###############################################
    // // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

    // Scanner scan3 = new Scanner(System.in);
    // System.out.println("Enter the number to check whether it is divisible by 5 and 11 or not");
    // int number = scan3.nextInt();

    // if (number%5 == 0 && number%11 == 0) {
    //     System.out.println(number + " is divisible by both 5 and 11"); 
    // }else {
    //     System.out.println(number + " is not divisible by both 5 and 11");
    // }
    // ###############################################



    // QUESTION 4
    // ###############################################
    // // 4. Write a JAVA program to check whether a number is even or odd.

    // Scanner scan4 = new Scanner(System.in);
    // System.out.println("Enter the number to check whether it is even or add !");
    // int a_number = scan4.nextInt();

    // if (a_number%2 == 0) {
    //     System.out.println(a_number + " is Even."); 
    // }else {
    //     System.out.println(a_number + " is Odd.");
    // }
    // ###############################################



    // QUESTION 5
    // ###############################################
    // // 5. Write a JAVA program to check whether a year is a leap year or not. Hint: if year%4==0; if year%100!==0 ; year%400==0; 

    // Scanner scan5 = new Scanner(System.in);
    // System.out.println("Enter the year to check whether it is leap year or not !");
    // int year = scan5.nextInt();

    // if (year%4 == 0 && year%100 != 0 || year%400 == 0 ) {
    //     System.out.println(year + " is a leap year."); 
    // }else {
    //     System.out.println(year + " is not a leap year.");
    // }
    // ###############################################



    // QUESTION 6
    // ###############################################
    // // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant

    // Scanner scan6 = new Scanner(System.in);
    // System.out.println("Enter any alphabet to check whether it is vowel or consonant !");
    // char alphabet = scan6.next().charAt(0);

    // if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
    // alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
    //     System.out.println(alphabet + " is a vowel.");
    // }else {
    //     System.out.println(alphabet + " is not a consonant.");
    // }
    // ###############################################


    // Some Switch case Statements Questions:

    // QUESTION 1
    // ###############################################
    // // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

    // Scanner scans = new Scanner(System.in);
    // System.out.println("Enter your grade of A, B, C, D, or F:");
    // String grade = scans.nextLine();

    // switch (grade.toUpperCase()) {
    //     case "A":
    //         System.out.println("Your gpa is 4.0 !");
    //         break;
    //     case "B":
    //         System.out.println("Your gpa is 3.0 !");
    //         break;
    //     case "C":
    //         System.out.println("Your gpa is 2.0 !");
    //         break;
    //     case "D":
    //         System.out.println("Your gpa is 1.0 !");
    //         break;
    //     case "F":
    //         System.out.println("Your gpa is 0.0");
    //         break;
        
    //     default:
    //     System.out.println("Invalid grade entered");
    //         break;
    //     }
    // ###############################################


    // QUESTION 2
    // ###############################################
    // // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.

    // Scanner scans2 = new Scanner(System.in);
    // System.out.println("Enter the first number:");
    // double firstn = scans2.nextDouble();

    // System.out.println("Enter the second number:");
    // double secondn = scans2.nextDouble();

    // System.out.println("Enter the operator to perform the corresponding arithmetic operation:");
    // char operator = scans2.next().charAt(0);


    // double result;
    // switch (operator) {
    //     case '+':
    //         result = firstn + secondn;
    //         break;
    //     case '-':
    //         result = firstn - secondn;
    //         break;
    //     case '*':
    //         result = firstn * secondn;
    //         break;
    //     case '/':
    //         if (secondn != 0) {
    //             result = firstn / secondn;
    //         } else {
    //             System.out.println("Cannot divide by 0 !!");
    //             return;
    //         }
    //         break;
    //     default:
    //         System.out.println("Invalid operator !!");
    //         return;
    //     }
    //     System.out.println("Result is:" + result);
    // ###############################################



    // QUESTION 3
    // ###############################################
    // // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
    // Scanner scans3 = new Scanner(System.in);
    // System.out.println("Enter the number of month to know the season:");
    // int month = scans3.nextInt();

    // switch (month) {
    //     case 1:
    //     case 2:
    //     case 3:
    //         System.out.println("Winter");
    //         break;
    //     case 4:
    //     case 5:
    //     case 6:
    //         System.out.println("Spring");
    //     break;
    //     case 7:
    //     case 8:
    //     case 9:
    //         System.out.println("Summer");
    //     break;
    //     case 10:
    //     case 11:
    //     case 12:
    //         System.out.println("Fall or Winter");
    //     break;
    
    //     default:
    //     System.out.println(month + " is Invalid month");
    //         break;
    // }
    // ###############################################



     // QUESTION 4
    // ###############################################
    // // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.

    // Scanner scans4 = new Scanner(System.in);
    // System.out.println("Enter the name of the shape circle, rectangle, square, triangle:");
    // String shapename = scans4.nextLine();


    // switch (shapename.toLowerCase()) {
    //     case "square":
    //         System.out.println("Enter the length of the side of the square:");
    //         double side= scans4.nextDouble();
    //         double areaOfSquare = side * side;
    //         System.out.println("The area of the square is: "+ areaOfSquare);
    //         break;
    //     case "circle":
    //         System.out.println("Enter the radius of the circle:");
    //         double radius = scans4.nextDouble();
    //         double area = Math.PI * (radius * radius);
    //         System.out.println("The area of the circle is: "+ area);
    //         break;
    //     case "triangle":
    //         System.out.println("Enter the base of the triangle:");
    //         double base = scans4.nextDouble();
    //         System.out.println("Enter the height of the triangle:");
    //         double height = scans4.nextDouble();
    //         double areaOfTriangle = (base * height)/2;
    //         System.out.println("The area of the triangle is: "+ areaOfTriangle);
    //         break;
    //     case "rectangle":
    //         System.out.println("Enter the width of the Rectangle:");
    //         double width = scans4.nextDouble();
    //         System.out.println("Enter the height of the Rectangle:");
    //         double heightt = scans4.nextDouble();
    //         double areaOfRectangle = width * heightt;
    //         System.out.println("The area of the Rectangle is: "+ areaOfRectangle);
    //         break; 
    //     default:
    //     System.out.println(shapename + " is Invalid Shape:");
    //         break;
    // }
    // ###############################################

    }
}
