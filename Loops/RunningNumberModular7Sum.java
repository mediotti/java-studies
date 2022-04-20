public class RunningNumberModular7Sum {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 1000;

        int sum = 0;
        int number = lower;    
        
        while (number%7 != 0) {
            number++;
        }   
        
        if (number%7 == 0){
                while (number <= upper) {
                    sum = sum + number;
                    number = number + 7;
            }
        
        System.out.println("The sum from " + lower + " to " + upper + " equals to = " + sum);
        }
    }
}
