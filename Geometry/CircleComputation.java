public class CircleComputation {
    public static void main (String[] args) {
        double raio;
        double area;
        double circunferencia;

        final double Pi = 3.14159265;

        raio = 1.2;
        area = raio * raio * Pi;
        circunferencia = 2 * Pi * raio;

        System.out.print("O raio do circulo é: ");
        System.out.println(raio);
        System.out.print("A área do circulo é: ");
        System.out.println(area);
        System.out.print("A circunferencia do circulo é: ");
        System.out.println(circunferencia);
    }
}
