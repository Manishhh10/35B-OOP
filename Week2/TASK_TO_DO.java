package Week2;

import java.util.Scanner;

public class TASK_TO_DO {
    private static final int PrincipleAmount = 0;

    public static void main(String[] args) {

        // QUESTION 1
        // ###################################################
        // // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.

        // Scanner scan = new Scanner(System.in);
        // System.out.println("To cast vote please enter your age:");
        // int age = scan.nextInt();

        // if (age >= 18) {
        //     System.out.println("You can cast vote !");
        // } else {
        //     System.out.println("You cannot cast vote !");
        // }
        // ###################################################



        // QUESTION 2    
        // ####################################################    
        // // 2. Write a program to calculate SI.
        // // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

        // Scanner scan2 = new Scanner(System.in);
        // System.out.println("Enter the principal amount:");
        // int principal = scan2.nextInt();

        // System.out.println("Enter the time:");
        // int time = scan2.nextInt();

        // System.out.println("Enter the rate:");
        // int rate = scan2.nextInt();

        // int simple_interest = (principal*time*rate)/100;
        // System.out.println("The Simple Interest is: "+ simple_interest);
        // ####################################################


        // QUESTION 3
        // ####################################################
        // // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

        // Scanner scan3 = new Scanner(System.in);
        // System.out.println("Enter the height of the traingle:");
        // int heightt = scan3.nextInt();

        // System.out.println("Enter the breadth of the triangle:");
        // int breath = scan3.nextInt();

        // int triangles_area = (heightt*breath)/2;
        // System.out.println("Area of the triangle is:" + triangles_area);

        // System.out.println("Enter the length of the cuboid:");
        // int length = scan3.nextInt();

        // System.out.println("Enter the heigth of the cuboid:");
        // int height = scan3.nextInt();

        // System.out.println("Enter the width of the cuboid:");
        // int width = scan3.nextInt();

        // int Volume_of_Cuboid = length*height*width;
        // System.out.println("The volume of the cuboid is:" + Volume_of_Cuboid);

        // System.out.println("Enter the length or breath or height of the cube:");
        // int side = scan3.nextInt();

        // int Volume_of_Cube = side*side*side;
        // System.out.println("The volume of the cube is:" + Volume_of_Cube);


        // ####################################################
        

        // QUESTION 4
        // ####################################################
        // // 4. Write the ternary operator for question no. 1

        // Scanner scan4 = new Scanner(System.in);
        // System.out.println("To cast vote please enter your age:");
        // int age = scan4.nextInt();
        
        // String result = age > 18 ? "You can cast vote !" : "You cannot cast vote !";

        // System.out.println(result);
        // ####################################################


        // QUESTION 5 and 6
        // ####################################################
        // // 5 and 6. Write a program to take two integer inputs from the user and print the sum and product of them.

        // Scanner scan5 = new Scanner(System.in);
        // System.out.println("Enter the first number:");
        // int first = scan5.nextInt();

        // System.out.println("Enter the second number:");
        // int second = scan5.nextInt();

        // int sum = first + second;
        // int product = first*second;
        // int division = product/sum;

        // System.out.println("The sum of two numbers is " + sum);
        // System.out.println("The product of two numbers is " + product);
        // System.out.println("The division of sum and product is " + division);
        
        // ####################################################


        // QUESTION 7
        // ####################################################
        // // 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

        // Scanner scan6 = new Scanner(System.in);
        // System.out.println("Enter your Name:");
        // String name = scan6.nextLine();

        // System.out.println("Enter your Roll number:");
        // String roll = scan6.nextLine();

        // System.out.println("Enter your Interests:");
        // String usersinterest = scan6.nextLine();

        // System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest are " + usersinterest + ".");
        // ####################################################



        // QUESTION 8
        // ###################################################
        // // 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

        // Scanner scan7 = new Scanner(System.in);
        // System.out.println("Enter the side of the square:");
        // int side = scan7.nextInt();

        // int areaofsquare = side*side;
        // int perimetrOfsquare = side*side*side*side;

        // System.out.println("Area of the square is" + areaofsquare);
        // System.out.println("Perimeter of the square is" + perimetrOfsquare);


        // System.out.println("Enter the principal amount:");
        // int principall = scan7.nextInt();

        // System.out.println("Enter the time:");
        // int timee = scan7.nextInt();

        // System.out.println("Enter the rate:");
        // int ratee = scan7.nextInt();

        // int simple_interestt = (principall*timee*ratee)/100;
        // System.out.println("The Simple Interest is: "+ simple_interestt);


        // System.out.println("Enter the height of the traingle:");
        // int heighttt2 = scan7.nextInt();

        // System.out.println("Enter the breadth of the triangle:");
        // int breathhh2 = scan7.nextInt();

        // int triangles_areaa2 = (heighttt2*breathhh2)/2;
        // System.out.println("Area of the triangle is:" + triangles_areaa2);

        // System.out.println("Enter the length of the cuboid:");
        // int lengthh = scan7.nextInt();

        // System.out.println("Enter the heigth of the cuboid:");
        // int heightt = scan7.nextInt();

        // System.out.println("Enter the width of the cuboid:");
        // int widthh = scan7.nextInt();

        // int Volume_of_Cuboid2 = lengthh*heightt*widthh;
        // System.out.println("The volume of the cuboid is:" + Volume_of_Cuboid2);

        // System.out.println("Enter the length of the side of the cube:");
        // int sides = scan7.nextInt();

        // int Volume_of_Cube2 = sides*sides*sides;
        // System.out.println("The volume of the cube is:" + Volume_of_Cube2);
        // ###################################################


        // QUESTION 9
        // ###################################################
        // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        // Scanner scan8 = new Scanner(System.in);
        // System.out.println("Enter the length of the rectangle:");
        // double length = scan8.nextDouble();
                
        // System.out.println("Enter the breadth of the rectangle:");
        // double breadth = scan8.nextDouble();
                
        // double area = length * breadth;
                
        // int areaInt = (int) area;
        // System.out.println("Area of the rectangle is: " + areaInt);
        // ###################################################


        // QUESTION 10
        // ###################################################
        // 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
        // a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        // d. If more than 39 -> Third class and if below than 40 the result is fail. 
        // Hint: Use ternary operator

        // Scanner scan9 = new Scanner(System.in);
        // System.out.println("Enter the marks of first subject out of 100:");
        // int firstmarks = scan9.nextInt();

        // System.out.println("Enter the marks of second subject subject out of 100:");
        // int secondmarks = scan9.nextInt();

        // System.out.println("Enter the marks of third subject subject out of 100:");
        // int thirdmarks = scan9.nextInt();

        // System.out.println("Enter the marks of four subject subject out of 100:");
        // int fourthmarks = scan9.nextInt();

        // int totalmarks = firstmarks+secondmarks+thirdmarks+fourthmarks;
        // int percentage = (100*totalmarks)/400;
        
        // String total = percentage >= 70 ? "First Class" : percentage >= 59 ? "Upper Second Class" : percentage >= 49 ? "Second Class" : percentage >= 39 ? "Third Class" : "Fail";

        // System.out.println(total);

        // ###################################################
    }
}
