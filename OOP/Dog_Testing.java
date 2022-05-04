class Dogs {
    
    int idade, peso;
    String nome, raça;
    char sexo;

    void latir(){
        if (peso <= 5)
            System.out.print("Yip!, Yip!");
        
        if (peso > 5)
            System.out.println("Au!, Au!");
    }

}

public class Dog_Testing{
    public static void main(String[] args) {
        Dogs ID001 = new Dogs();
            ID001.nome = "Lola";
            ID001.peso = 5;
            ID001.idade = 13;
            ID001.raça = "Poodle";
            ID001.sexo = 'F';
        
        Dogs ID002 = new Dogs();
            ID001.nome = "Luna";
            ID001.peso = 7;
            ID001.idade = 11;
            ID001.raça = "Poodle";
            ID001.sexo = 'F';
        
        ID001.latir();
        ID002.latir();
    }
}
