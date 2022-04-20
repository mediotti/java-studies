public class RunningNumberOddSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            sum = sum + number;
            number = number + 2; //This will skip the even numbers, so the sequence will be: 1, 3, 5, 7, 9...
        }
        
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " equals to = " + sum);
    }
}
