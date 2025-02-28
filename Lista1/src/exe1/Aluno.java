package exe1;
public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;

    //construtor
    public Aluno() {
        this.nome = "Sem nome";
    }
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    //calcula nota final
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    //verifica se o aluno passuou
    public String passou(){
        return this.notaFinal() >= 6 ? "Passou" : "Nao Passou"; //ao invez de usar if else

    }
    public void dadosAluno(){
        System.out.println("Nome: " + this.nome +
            " Nro. Aluno : " + this.nroAluno +
                "Idade: " + this.idade +
            "Situação " + this.passou());
    }
}
