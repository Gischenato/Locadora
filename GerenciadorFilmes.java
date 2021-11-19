import java.util.ArrayList;

public class GerenciadorFilmes {
     private ArrayList<Filme> filmesCadastrados;

     public GerenciadorFilmes() {
          filmesCadastrados = new ArrayList<>();
     }

     public Filme buscarFilme(int codigo) {
          for (Filme filme : filmesCadastrados) {
               if (filme.getCodigo() == codigo)
                    return filme;
          }
          return null;
     }

     @Override
     public String toString() {
          String res = "Filmes Cadastrados:\n";
          for (Filme filme : filmesCadastrados) {
               res += filme.toString() + "\n";
          }
          return res;
     }
}
