package Week3;
public class IfElseClass {
    public static void main(String[] args) {
        // /* If statement */
        // if (true) {
        //     System.out.println("True Statement");
        // }
        // /* If takes boolean expression inside () */
        // int num1 = 10, num2 = 20;
        // if(num1 == num2){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }
        // /* Note that else is optional */
        // /* If else if */
        // if (num1 == num2){
        //     System.out.println("Equal");
        // }else if(num1 < num2){
        //     System.out.println("Lesser");
        // }else{
        //     System.out.println("Greater");
        // }
        // /* Note that else should be at last */
        // /* If else if ladder */
        // if(num1 > num2){
        //     System.out.println("Greater");
        // }
        // /* If else if ladder */
        // else if(num1 != num2){
        //     System.out.println("Not Equal");
        // }
        // else if(num1 == num2){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Default statement");
        // }

        // /* Nested if statement */
        // if (num1 < 0){
        //     if(num1 > num2){
        //         System.out.println("Negative and greater");
        //     }else{
        //         System.out.println("Negative and lesser");
        //     }    
        // }else{
        //     if(num1 > num2){
        //         System.out.println("Positive and greater");
        //     }else{
        //         System.out.println("Positive and lesser");
        //     }
        // }
         /* Task
     * Consider the folllowing marking
     * Calculate the total an avg in a variable
     * if any of the marking is less than 35, print fail
     * if avg is less than 60, print third div 
     * if avg is less than 70, print second div
     * if avg is less than 80, print first div
     * if avg is equal or greater than 80 , print distinction 
     * if avg is less than 0 or more than 100, print invalid
     */
    int science = 35;
    int english = 55;
    int math = 89;

    int total = science + english + math;
    int average = total/3;

    if(science<35 || english<35 || math<35){
        System.out.println("Fail");
    }
    else if(average < 60){
        System.out.println("Third Division");
    }
    else if(average < 70){
        System.out.println("Second Division");
    }
    else if(average < 80){
        System.out.println("Third Division");
    }
    else if(average < 0 || average > 100){
        System.out.println("Distinction");
    }else{
        System.out.println("Invalid");
    }
    }
   
    
}
