public class OddEvenSum {
    public static void main(String[] args) {
        final int lower = 1, upper = 1000;
        int sumOdd = 0, sumEven = 0;
        int absDiff;

        for (int number = lower; number <= upper; number++){
            if(number % 2 == 0){
                sumEven += number;      //Mesma coisa que usar sumEven = sumEven + number.
            }

            if(number % 2 != 0){
                sumOdd += number;       //Mesma coisa que usar sumOdd = sumEven + number.
            }
        }

        /*if (sumOdd>sumEven){
            absDiff = sumOdd - sumEven;
        } else{
            absDiff = sumEven - sumOdd;
        } */
        
        absDiff = (sumOdd>sumEven) 
        ? sumOdd - sumEven  //Sintaxe: expressãoBooleana ? expressão1(true) : expressão2(false) --- Tem a mesma função de um if statement
        : sumEven - sumOdd;  

        System.out.println("A soma dos numeros impares de " + lower + " até " + upper + " é igual a = " + sumOdd);
        System.out.println("A soma dos numeros pares de " + lower + " até " + upper + " é igual a = " + sumEven);
        System.out.println("A diferença absoluta entre as duas soma é = " + absDiff);
    }
    
}
