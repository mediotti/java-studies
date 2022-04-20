public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 1000;

        int sum = 0;

        for(int number = lower; number <= upper; number++){
            if ((number % 15 == 0) && (number % 21 == 0) && (number % 35 == 0) && (number % 105 == 0)){
                continue;
            }
            if ((number % 3 == 0) || (number % 5 == 0) || (number % 7 == 0)){
                sum = sum + number;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
