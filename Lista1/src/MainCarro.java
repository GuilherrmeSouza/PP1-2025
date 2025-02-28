
import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        //criando objetos da classe Carro
        // = instanciar a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2004;
        obj1.velocidade = 0.0f;
        obj1.marca = "VM";
        obj1.modelo = "Fox";
        obj1.exibirDetalhes();
        obj1.acelerar(50);
        obj1.exibirDetalhes();
        obj1.frear(51);
        obj1.exibirDetalhes();
        obj1.acelerar(60);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2008, 0.0f, "Honda", "Civic");
        obj2.exibirDetalhes();

        Carro obj3 = new Carro(2010, 0.0f, "GM", "Astra");
        obj3.exibirDetalhes();

        Carro obj4 = new Carro();
        obj4.exibirDetalhes();
    }

}