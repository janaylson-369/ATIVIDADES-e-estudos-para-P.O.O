package atividademercadinho;

public class Principal {

    public static void main(String[] args) {

        Mercadinho m = new Mercadinho();

        m.adicionarCliente(new ClienteRegular("Ana", 325.0));
        m.adicionarCliente(new ClienteVip("Carlos", 6428.0, "98995494"));
        m.adicionarCliente(new ClienteOuroVip("Maria", 6451.0, "5115151", "Rua do medo"));

        m.imprimirClientes();
        System.out.println("\nvalor total das compras de todos os clientes: R$ " + m.calcularTotal());
    }
}
