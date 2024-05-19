package Week4;

import java.util.Scanner;

public class TASK_TO_DO_4 {
    public static void main(String[] args) {
    // QUESTION 1
    // ###############################################
    // // 1. Write a program that asks your name and prints "Hello your name" five times. Use a loop.
    // Scanner scan = new Scanner(System.in);
    // System.out.println("What is your name?");
    // String name = scan.nextLine();

    // for (char i = 1; i <=5; i++) {
    //     System.out.println("Hello" + name);
    // }
    // ###############################################



    // QUESTION 2
    // ###############################################
    // 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
    // Miles    Kilometers
    // 1        1.609
    // 2        3.218
    // …        ….
    // 9        14.481
    // 10       16.090
    // System.out.println("Miles  Kilometers");
    // for (int i = 1; i <=10; i++) {
    //     System.out.println(i + "       " + i*1.609);
    // }
    // ###############################################



    // QUESTION 3
    // ###############################################
    // 3. Write a program that generates the following table: 
    // Number    Square
    // 10          100
    // 9           81
    // ..          ..
    // 2           4
    // 1           1

    // System.out.println("Number  Square");
    // for (int i = 10; i >=1; i--) {
    //     System.out.println(i + "       " + i*i);
    // }
    // ###############################################



    // QUESTION 4
    // ###############################################
    // // 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
    // // *****
    // // *****
    // // *****
    // // *****
    // // *****
    
    // Scanner scan4 = new Scanner(System.in);
    // System.out.println("Enter the width of the square:");
    // int width = scan4.nextInt();

    // for (int i = 12; i <=width; i++) {
    //     System.out.println("*****");
    // }
    // ###############################################



    // QUESTION 5
    // ###############################################
    // // 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
    // // Sample Run:
    // // Enter a positive non-zero integer 4
    // // Sum of 1 to 4 is 10
    // // Do you want to continue? Enter ‘y’ for yes or any other character for no. y Enter a positive non-zero integer 3. Sum of 1 to 3 is 6. Do you want to continue? Enter ‘y’ for yes and any other character for no. n.
    
    // Scanner scan5 = new Scanner(System.in);
    // char yesORno;
    
    // do {
    //     System.out.println("Enter a positive non-zero integer :");
    //     int integer = scan5.nextInt(); 
    //     if (integer<=0) {
    //         System.out.println("Integer should be positive or non-zero!!");
    //     }else{
    //         int sum = 0;
    //         for (int i = 0; i <=integer; i++) {
    //             sum += i;
    //         }
    //         System.out.println("Sum of 1 to " + integer + " is " + sum);
    //     }

    //     System.out.println("Do you want to continue? Enter 'y' for yes or any other character for no.");
    //     yesORno = scan5.next().charAt(0);
    // } while (yesORno == 'y');

    // ###############################################




    
    // QUESTION 6
    // ###############################################
    // // 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
    // // *
    // // **
    // // ***
    // // ****
    // // *****
    // // Use a nested for loop to generate the above pattern.
    
    // Scanner scan6 = new Scanner(System.in);
    // System.out.println("Enter the width of the triangle:");
    // int width = scan6.nextInt();

    // for (int i = 1; i <=width; i++) {
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // ###############################################




    // QUESTION 7
    // ###############################################
    // // 7. Write a program to calculate the HCF of Two given numbers.

    // Scanner scan7 = new Scanner(System.in);
    // System.out.println("Enter the first number:");
    // int first = scan7.nextInt();

    // System.out.println("Enter the second number:");
    // int second = scan7.nextInt();

    // int bigger_number;
    // int hcf;

    // if (first>second) {
    //     bigger_number = first;
    // }else{
    //     bigger_number = second;
    // }

    // for (int i = bigger_number; i > 0; i--) {
    //     if (first%i == 0 && second%i == 0) {
    //         hcf=i;
    //         System.out.println("The hcf of " + first + " and " + second + " is " + hcf);
    //         break;
    //     }
    // 
    // ###############################################



    // QUESTION 8
    // ###############################################
    // 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
    
    // Scanner scan7 = new Scanner(System.in);
    // System.out.println("Enter an integer to reverse it:");
    // int integer = scan7.nextInt();

    // int reversedNumber = reverseNumber(integer);

    // System.out.print("Reversed number: " + reversedNumber);

    // scan7.close();
    // }

    // public static int reverseNumber(int number){
    //     int reversedNumber = 0;
    //     while (number != 0) {
    //         int digit = number % 10;
    //         reversedNumber = reversedNumber * 10 + digit;
    //         number /= 10;
    //     }
    //     return reversedNumber;
    // }
// #########################################
    // Scanner scan7 = new Scanner(System.in);
    // System.out.println("Enter an integer to reverse it:");
    // int integer = scan7.nextInt();

    // String result = "";

    // String new_integers = Integer.toString(integer);

    // for (int i = new_integers.length() - 1; i >= 0; i--) {
    //     result += new_integers.charAt(i);
    // }
    // System.out.println("Reverse:" + result);

    // ##############################################

    // QUESTION 9
    // ###############################################
    // 9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.


    Scanner scan9 = new Scanner(System.in);
    String input ="lado";
    
    while (input.equals("quit")) {
        System.out.println("Enter a string:");
        String reverse = scan9.nextLine();
        input = reverse.toLowerCase().strip();
        System.out.println("input: " + input);
    }
    // ###############################################
}

}