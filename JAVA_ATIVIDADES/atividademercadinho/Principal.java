package atividademercadinho;

public class Principal {

    public static void main(String[] args) {

        Mercadinho m = new Mercadinho();

        m.adicionarCliente(new ClienteRegular("bob", 1000.0));
        m.adicionarCliente(new ClienteVip("barlei", 2000.0, "3333"));
        m.adicionarCliente(new ClienteOuroVip("vitoris", 5000.0, "9999", "Rua vasco da gama, 45"));

        m.imprimirClientes();
        System.out.println("\nvalor total: R$ " + m.calcularTotal());
    }
}
