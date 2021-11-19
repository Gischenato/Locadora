import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorLocacoes {
     private static GerenciadorLocacoes INSTANCE;
     public ArrayList<Locacao> listaDeLocacoes;

     public static GerenciadorLocacoes getInstance() {
          if (INSTANCE == null)
               INSTANCE = new GerenciadorLocacoes();

          return INSTANCE;
     }

     private GerenciadorLocacoes() {
          listaDeLocacoes = new ArrayList<>();
     }

     private void addLocacao(Locacao locacao) {
          listaDeLocacoes.add(locacao);
     }

     public void solicitarLocacao(int codCliente, int codFilme) {
          GerenciadorClientes clientes = GerenciadorClientes.getInstance();
          GerenciadorFilmes filmes = GerenciadorFilmes.getInstance();

          Cliente cliente = clientes.buscarCliente(codCliente);
          Filme filme = filmes.buscarFilme(codFilme);

          if (cliente == null && filme == null)
               throw new IllegalArgumentException("Codigo de cliente e filme Invalido");
          if (filme == null)
               throw new IllegalArgumentException("Codigo de filme Invalido");
          if (cliente == null)
               throw new IllegalArgumentException("Codigo de cliente Invalido");

          addLocacao(new Locacao(LocalDate.now(), cliente, filme));
     }

     public void solicitarDevolucao() {

     }

     @Override
     public String toString() {
          String res = "Locacoes cadastradas:\n";
          for (Locacao locacao : listaDeLocacoes) {
               res += locacao.toString() + "\n";
          }
          return res;
     }
}
