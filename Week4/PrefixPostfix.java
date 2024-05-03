package Week4;
public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixValue = 10;
        System.out.println("Prefix will update here" + ++prefixValue);
        System.out.println("It will remain same" + prefixValue);
        /* Prefix is when you put operator in the left side of value/var */

        int postFixValue = 20;
        System.out.println("Post will not update here" + postFixValue++);
        System.out.println("It will update here" + postFixValue);
        /* Postfix is when you put operator in hte right side */
    }
}
