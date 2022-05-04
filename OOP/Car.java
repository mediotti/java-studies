public class Car {
    int modelYear;
    String modelName;
  
    public Car(int year, String name) {
      modelYear = year;                     //This will be a constructor, it'll initialize the object in memory when you create a new object.
      modelName = name;
    }
  
    public static void main(String[] args) {
      Car myCar = new Car(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }