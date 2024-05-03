package Week3;

import java.util.Scanner;

public class TASK_TO_DO {
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
    // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant

    Scanner scan6 = new Scanner(System.in);
    System.out.println("Enter any alphabet to check whether it is vowel or consonant !");
    char alphabet = scan6.next().charAt(0);

    if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
    alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
        System.out.println(alphabet + " is a vowel."); 
    }else {
        System.out.println(alphabet + " is not a consonant.");
    }
    // ###############################################
    }
}
