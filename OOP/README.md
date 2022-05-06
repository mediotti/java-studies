# OOP Concepts

## Abstração

- O que é?
    - Abstração é o conceito de minimizar a complexidade de algo, buscando sempre ocultar informações complexas demais que possam influenciar negativamente a utilização objetiva de uma classe.
    - Em Java, a abstração pode gerar:
        - Ocultar a complexidade “desnecessária” de dados em sistemas.
        - Auxiliar na diminuição de repetição de códigos.
        - Dar flexibilidade para alterar apenas a implementação abstrata de código.
        - Abstração Parcial = Atingida através de classes abstratas.
        - Abstração Total = Atingida através de interfaces.
- Exemplo prático:

```java
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
```

- Através da abstração, foi criado uma classe **Dogs**, onde nela, os atributos buscam atingir um alto nível de abstração, tendo apenas informação presentes em toda a classe de cachorros existentes, isso vale também para o método latir.

## Encapsulamento

- O que é?
    - Está diretamente conectado a segurança de informações ao longo do código, ele permite que você proteja informações armazenadas em classes de acessos por todo o sistema.
    - É possível implementar esse princípio criando variáveis de classe privadas, somente acessando-as através de métodos getters e setter públicos.
        - Acesso restrito a campos de dados de uma classe.
        - Esses campos são configurados como “privados”
        - Cada campo deve ter um método getter e setter.
            - Getter: Retorna o valor do campo.
            - Setter: Permite a alteração do valor do campo
        - Possibilidade de criar métodos **write-only** e **read-only.**
        
        ```java
        public char getGender(){
                return gender;
            }
        
            
            public void setAge(int newAge){
                age = newAge;
            }
        ```
## Herança
- O que é?
    - No Java, é possível atribuir heranças em métodos e objetos, de uma classe para outra. É possível atribuir a herança em dois tipos:
        - Subclasse(Filhos): A classe que herda de outra classe.
        - Superclasse(Pais): A classe que irá atribuir suas características para classes de níveis inferiores.
    - Em java, é utilizado o "extends", para criar uma subclasse que inclua heranças numa classe.