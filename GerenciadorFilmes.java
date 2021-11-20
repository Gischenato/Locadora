import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorFilmes {
     private static GerenciadorFilmes INSTANCE;
     public ArrayList<Filme> filmesCadastrados;
     private HashMap<Categoria, Integer> quantidadePorCategoria;

     public static GerenciadorFilmes getInstance() {
          if (INSTANCE == null)
               INSTANCE = new GerenciadorFilmes();

          return INSTANCE;
     }

     private GerenciadorFilmes() {
          filmesCadastrados = new ArrayList<>();
          iniciaDicionario();
          
     }

     private void iniciaDicionario(){
          quantidadePorCategoria = new HashMap<>();
          Categoria[] categorias = Categoria.values(); 
          for (Categoria categoria : categorias) {
               quantidadePorCategoria.put(categoria, 0);
          }
     }

     public void adicionarFilme(Filme filme) {
          filmesCadastrados.add(filme);
     }

     public Filme buscarFilme(int codigo) {
          for (Filme filme : filmesCadastrados) {
               if (filme.getCodigo() == codigo)
                    return filme;
          }
          return null;
     }

     public void adicionarACategoria(Filme filme){
          Categoria categoria = filme.getCategoria();
          int quant = quantidadePorCategoria.get(categoria);
          quantidadePorCategoria.put(categoria, quant + 1);
     }

     public HashMap<Categoria, Integer> getDicionario(){
          return quantidadePorCategoria;
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
