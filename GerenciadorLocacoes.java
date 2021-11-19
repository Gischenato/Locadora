import java.util.ArrayList;

public class GerenciadorLocacoes {
     private static GerenciadorLocacoes INSTANCE;
     private ArrayList<Locacao> listaDeLocacoes;

     public static GerenciadorLocacoes getInstance() {
          if (INSTANCE == null)
               INSTANCE = new GerenciadorLocacoes();

          return INSTANCE;
     }

     private GerenciadorLocacoes() {
          this.listaDeLocacoes = new ArrayList<>();
     }

     public void solicidaLocacao(int codCliente, int codFilme) {

     }

     public void solicitaDevolucao() {

     }
}
