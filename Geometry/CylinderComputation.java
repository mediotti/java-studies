public class CylinderComputation {
    public static void main(String[] args) {
        final double pi = 3.1415;
        double raio, altura, areaSuperficie, areaBase, volume;
        
        raio = 4;
        altura = 5;

        volume = pi * raio * raio * altura;
        areaBase = pi * raio * raio;
        areaSuperficie = 2 * pi * raio * altura + 2 * pi * raio * raio;
        

        System.out.print("O volume do cilindro é: ");
        System.out.println(volume);

        System.out.print("A área da base do cilindro é: ");
        System.out.println(areaBase);

        System.out.print("A superfície do cilindro é: ");
        System.out.println(areaSuperficie);
    }
    
}
