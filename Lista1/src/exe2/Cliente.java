package exe2;

public class Cliente {

    public int nroAgencia, nroConta; // variavel tipo primitivo

    public String nome; //tipo de classe

    public float saldo; //tipo primitivo
    //metodo contrutor sem parametro

    public Cliente() {
        this.nome = "Sem nome";
    }
    //metodo contrutor com parametro

    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    ;
    //realizar deposito

    public void depositar(float x) {
        this.saldo += x;
    }

    public void exibirDetalher() {
        System.out.println("Nro. Conta: : " + this.nroConta +
                " Saldo: R$ " + this.saldo);
    }
    //sacar o money
    public void sacar(float x) {
        if (this.saldo >= x) {
            this.saldo -= x;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
