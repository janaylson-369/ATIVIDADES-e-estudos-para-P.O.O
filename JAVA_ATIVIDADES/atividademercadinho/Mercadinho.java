package atividademercadinho;

import java.util.ArrayList;

public class Mercadinho {

    private ArrayList<Cliente> clientes;

    public Mercadinho() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double calcularTotal() {
        double calculototal = 0;
        for (Cliente c : clientes) {
            calculototal += c.calcularPagamento();
        }
        return calculototal;
    }

    public void imprimirClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("compras: R$ " + calcularTotal());
    }
}

