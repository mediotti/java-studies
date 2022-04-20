public class PrintLeapYears {
    public static void main(String[] args) {
        int lower = 999;
        int upper = 2010;
        
        int count = 0;

        for(int number = lower; number <= upper; number++){
            if (number % 4 != 0 && (number % 100 == 0 || number % 400 != 0)){  //condições de um ano bissexto
                continue;
            }
            if (((number % 4 == 0) && (number % 100 != 0)) || (number % 400 != 0)){
                System.out.println(number + " is a leap year!");
                count++;
            }
        }
        System.out.println("Leap years in the interval of " + lower + " and " + upper + ": " + count);
    }
}
