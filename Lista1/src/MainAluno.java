import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        //instancia a classe Aluno -> objeto
        Aluno obj1 = new Aluno(); //chamando o construtor
        System.out.println("Nome: " + obj1.nome + " Media: " + obj1.notaFinal());
        Aluno obj2 = new Aluno(123, 19,"Tiago", 5.4f, 8.9f); //f é para converter esse caracter em float
        System.out.println("Nome: " + obj2.nome + " Media: " + obj2.notaFinal());

    }
}
