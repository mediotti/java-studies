class ConstrutorProg {
    private String nomeCurso;
    
    public ConstrutorProg(String nome) {
        nomeCurso = nome;
    }

    public String getNome() {
            return "Nome do Curso retornado " + nomeCurso;
    }
}

public class Construtores {
    public static void main(String[] args) {
        ConstrutorProg cp = new ConstrutorProg("DevMedia - Java");
        System.out.println(cp.getNome());
    }
}
