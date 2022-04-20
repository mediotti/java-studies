public class ArihmeticTest {
    public static void main (String[] args){
        int numberA = 98;
        int numberB = 5;

        int sum = numberA + numberB;
        int difference = numberA - numberB;
        int product = numberA * numberB;
        int quotient = numberA / numberB;
        int remainder = numberA % numberB;

        int equation_exercise_no2 = (31*numberA) + (17*numberB);

        System.out.println("The sum, difference, product, quotient and remainder of " + numberA + " and " + numberB + " are:");
        System.out.println(sum + ", " + difference + ", " + product + ", " + quotient + ", " + remainder);   
        System.out.println("The second exercise equation results in = " + equation_exercise_no2);
        
            ++numberA;
            --numberB;
      System.out.println("number1 after increment is " + numberA);
      System.out.println("number2 after decrement is " + numberB);
      quotient = numberA / numberB; 
      System.out.println("The new quotient of " + numberA + " and " + numberB + " is " + quotient);
    }
}
