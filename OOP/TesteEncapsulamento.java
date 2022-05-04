class Encapsulamento {
    private String username;
    private int age;
    private char gender;
    
    public int getAge(){
        return age;
    }
    public String getUsername(){
        return username;
    }   
    public char getGender(){
        return gender;
    }

    
    public void setAge(int newAge){
        age = newAge;
    }
    public void setUsername(String newUsername){
        username = newUsername;
    }
    public void setGender(char newGender){
        gender = newGender;
    }
}

public class TesteEncapsulamento {
    public static void main(String[] args) {
        Encapsulamento obj = new Encapsulamento();

        obj.setAge(20);
        obj.setGender('M');
        obj.setUsername("medzdev");

        System.out.println("Username: " + obj.getUsername());
        System.out.println("Gender: " + obj.getGender());
        System.out.println("Age: " + obj.getAge());
    }
}
