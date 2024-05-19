package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        /* Array declaration */
        int [] myFirstArray;
        /* Memory alloc */
        myFirstArray = new int[5];
        /* Array Declaration and memory alloc */
        int [] mySecondArray = new int[3];
        /* Array declaration, memory alloc and initialization */
        int [] myThirdArray = {10,20,30,40};

        //Array index -> Position of element/values
        //Starts with zero
        mySecondArray[0] = 10;
        mySecondArray[1] = 20;
        mySecondArray[2] = 100;
        // Access/Store in new variable
        int arrayElement = mySecondArray[0];
        System.out.println("First index " + arrayElement);
        System.out.println("Second index " + mySecondArray[1]);

        /* Task 1
         * Make the following array named animals
         * ["Cat","Dog","Tiger","Snake"]
         * Print "Snake" 
         */
        // // Method 1
        // String [] animals = new String[4];

        // animals[0] = "Cat"; 
        // animals[1] = "Dog"; 
        // animals[2] = "Tiger"; 
        // animals[3] = "Snake";
        // String fourth = animals[3];
        // System.out.println(fourth);

        // Method 2
        String [] animals2 = {"Cat","Dog","Tiger","Snake"};
        System.out.println(animals2[3]);
    }
}
