import exe2.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.depositar(1000);
        obj1.exibirDetalher();

        Cliente obj2 = new Cliente(123, 456, "julio" , 3000);
        obj2.depositar(1500);
        obj2.exibirDetalher();
    }
}
