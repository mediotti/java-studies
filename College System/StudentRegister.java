import java.util.Scanner;

class Student{
    String studentName;
    String address;
    int phoneNumber; // 55119********
    char gender; // m, f, n.
    int birthDay; // YYYYMMDD
    int height; // in centimeters
    double weight;
    String degree;
    int yearClass;
    double avgGPA;
    boolean tuitionGrant;
    boolean scholar;
    int studentID; //******** (8 number)
}

public class StudentRegister {
    public static void main(String[] args){
        Scanner Reader = new Scanner(System.in);
        System.out.println("Insert the student name:");
        String ID0001 = Reader.nextLine();
        System.out.println("The student name is: " + ID0001);


    }
    
}
