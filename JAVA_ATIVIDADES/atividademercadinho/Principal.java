package atividademercadinho;

public class Principal {

    public static void main(String[] args) {

        Mercadinho m = new Mercadinho();

        m.adicionarCliente(new ClienteRegular("Ana", 100.0));
        m.adicionarCliente(new ClienteVip("Carlos", 200.0, "1234-5678"));
        m.adicionarCliente(new ClienteOuroVip("Maria", 500.0, "9999-8888", "Rua Central, 45"));

        m.imprimirClientes();
        System.out.println("\nvalor total das compras de todos os clientes: R$ " + m.calcularTotal());
    }
}
