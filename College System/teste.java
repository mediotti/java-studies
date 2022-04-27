import java.util.Scanner;
class Area {
    int length;//Get User Input for classes
    int width;
    int a;
    int b;
 
    public Area(int x,int y) {
        length = x;
        width = y;
    }
    public int getArea() {
        return width * length;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        //get user input for a
        int a = reader.nextInt();

        System.out.println("Enter the second number");
        //get user input for b
        int b = reader.nextInt();

        Area folk = new Area(a,b);
        System.out.println("Area of " + a + " * " + b + " is: " + folk.getArea());
    }
}