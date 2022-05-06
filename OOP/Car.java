class Vehicle {
    protected String brand = "Honda";
    public void honk() {
        System.out.prinln("Honk!, Honk!");
    }
}

public class Car extends Vehicle {
    private String modelName = "Fit";
        public static void main(String[] args) {
            Car myCar = new Car();
                myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
        
}