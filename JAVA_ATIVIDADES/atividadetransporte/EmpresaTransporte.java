
import java.util.ArrayList;
import java.util.Iterator;

public class EmpresaTransporte {

    /*  
    
    
    
    
    
    */
    private ArrayList<Manager> listmotoristas; //lista

    public EmpresaTransporte() {
        listmotoristas = new ArrayList<>();// construtor da lista
    }

    //cadastrarMotorista(Motorista motorista): Cadastra motorista na empresa;
    public void cadastrarMotorista(Manager motorista) {
        //lista     + add  + variavel
        listmotoristas.add(motorista);
    }

    //pesquisarMotoristaPeloNome(String nome): Pesquisa motorista pelo nome;
    public void pesqMotorista(String nome) {

        for (Manager b : listmotoristas) {
            if (b != null && b.getnome().equals(nome)) {
                System.out.printf("Motorista encontrado: %s \n", b.toString());
            }
        }

    }

    //excluirMotoristaPeloNome(String nome): Exclui motorista pelo nome;
    public boolean excluirMotoristaPeloNome(String nome) {
        Iterator<Manager> it = listmotoristas.iterator();

        while (it.hasNext()) {
            Manager m = it.next();

            if (m.getnome().equalsIgnoreCase(nome)) {
                it.remove();
                return true;
            }
        }
    return false;
    }

    public boolean excluirMotoristaPelo(String nome) {
    return listmotoristas.removeIf(m -> m.getnome().equalsIgnoreCase(nome));
    }

    
    //calcularPagamentoTotal(): Retorna o valor total a ser pago a todos os listmotoristas;
    public double calcularTotal() {
        double calculototal = 0;
        for (Manager m : listmotoristas) {
            calculototal += m.pagamentoMotorista();
        }
        return calculototal;
    }

    //gerarRelatorioMotoristas(): Exibe relatório completo dos motoristas.
    public void relatorioMotorista() {

        for (Manager b : listmotoristas) {
            System.out.println(b);
        }
        System.out.println( 
                        " Pagamento total por motorista: R$ " + calcularTotal());
    }
}