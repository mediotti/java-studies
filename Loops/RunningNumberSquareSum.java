public class RunningNumberSquareSum {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 100;

        int sum = 0;
        int number = lower;

        while (number <= upper){
            sum = sum + (number*number);
            number++;
        }

        System.out.println("The sum of the square of all the number from " + lower + " to " + upper + " equals to = " + sum);
    }
}
