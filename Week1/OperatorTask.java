public class OperatorTask {
    public static void main(String[] args) {
        /*Task 1
        * Write a program to print weather a variable is greater or equal to 18
        */
        // int num1=18, num2=10;
        // System.out.println("Greater than or eual to 18 " + (num2 >= num1));

        /* Task 2
        * Write a program to print simple interest from variables
        * Make 3 variable for amount, time and  rate and save the calculation into
        * Formula: si=amount * time * rate/100; // use float/double
        */
        int amount=100,time=12,rate=10;
        float SI=amount * time * rate/100;
        System.out.println("Simple Interest is " + SI);
        

        /* Task 3
         * Write a program to print the area and perimeter of ractangle
        area = length * breadth
        perimeter = 2 (length = breadth)
        */
        int length=10;
        int breadth= 15;
        int area = length * breadth;
        int perimeter = 2*(length + breadth);
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);

        /* Task 4
         * Complete the task 1 using ternary operators.
         */
        int tNum1 = 20, tNum2 = 18;
        String output;

        output = tNum1 > tNum2 ? "True Statement" : "False Statement";

        int intOutput = tNum2 >= tNum1 ? 20 : 18;
        System.out.println(output);
        System.out.println(intOutput);
    }
}
