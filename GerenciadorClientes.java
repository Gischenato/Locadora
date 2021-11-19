import java.util.ArrayList;

public class GerenciadorClientes {
     private static GerenciadorClientes INSTANCE;
     private ArrayList<Cliente> clientesCadastrados;

     public static GerenciadorClientes getInstance() {
          if (INSTANCE == null)
               INSTANCE = new GerenciadorClientes();

          return INSTANCE;
     }

     private GerenciadorClientes() {
          clientesCadastrados = new ArrayList<>();
     }

     public Cliente buscarCliente(int codigo) {
          for (Cliente cliente : clientesCadastrados) {
               if (cliente.getCodigo() == codigo)
                    return cliente;
          }
          return null;
     }

     @Override
     public String toString() {
          String res = "Clientes cadastrados:\n";
          for (Cliente cliente : clientesCadastrados) {
               res += cliente.toString() + "\n";
          }
          return res;
     }
}