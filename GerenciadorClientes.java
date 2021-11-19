import java.util.ArrayList;
import java.util.HashSet;

public class GerenciadorClientes {
     public ArrayList<Cliente> clientesCadastrados;

     public GerenciadorClientes(){
          this.clientesCadastrados = new ArrayList<>();
     }

     public Cliente buscarCliente(int codigo){
          for (Cliente cliente : clientesCadastrados) {
               if(cliente.getCodigo() == codigo) return cliente;
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