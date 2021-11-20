import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
     public static void main(String[] args) {
          GerenciadorClientes clientes = GerenciadorClientes.getInstance();
          GerenciadorFilmes filmes = GerenciadorFilmes.getInstance();
          GerenciadorLocacoes locacoes = GerenciadorLocacoes.getInstance();

          clientes.adicionarCliente(new Cliente("Giovanni", 1));
          clientes.adicionarCliente(new Cliente("Gabriel", 2));
          clientes.adicionarCliente(new Cliente("Augusto", 3));
          clientes.adicionarCliente(new Cliente("Katharina", 4));
          clientes.adicionarCliente(new Cliente("Amalia", 5));

          filmes.adicionarFilme(new Filme("Rogue One", 1, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Gente Grande", 2, Categoria.COMEDIA));
          filmes.adicionarFilme(new Filme("Capitao America", 3, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Parasita", 4, Categoria.DRAMA));
          filmes.adicionarFilme(new Filme("Your Name", 5, Categoria.ROMANCE));
          filmes.adicionarFilme(new Filme("Venom", 6, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Coraline", 7, Categoria.FANTASIA));
          filmes.adicionarFilme(new Filme("O Castelo Animado", 8, Categoria.FANTASIA));
          filmes.adicionarFilme(new Filme("Kung Fu Panga", 9, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("A Voz Do Silencio", 10, Categoria.DRAMA));
          filmes.adicionarFilme(new Filme("A Viagem de Chihiro", 11, Categoria.FANTASIA));
          filmes.adicionarFilme(new Filme("Shang Chi", 12, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Jumaji", 13, Categoria.COMEDIA));
          filmes.adicionarFilme(new Filme("Weathering With You", 14, Categoria.DRAMA));


          //TESTE (1)

          locacoes.solicitarLocacao(1, 2);
          locacoes.solicitarLocacao(2, 3);
          locacoes.solicitarLocacao(4, 1);
          locacoes.solicitarLocacao(4, 3);
          locacoes.solicitarLocacao(1, 5);
          locacoes.solicitarLocacao(3, 5);
          locacoes.solicitarLocacao(1, 3);
          locacoes.solicitarLocacao(5, 3);
          locacoes.solicitarLocacao(5, 8);
          locacoes.solicitarLocacao(1, 10);
          locacoes.solicitarLocacao(1, 11);
          locacoes.solicitarLocacao(1, 14);

          //TESTE (2)
          // [a]
          locacoes.filmesAssistidosPorCliente("Giovanni");
          linha(24);
          // [b]
          System.out.println(locacoes.filmesAssistidosPorCategoria(Categoria.FANTASIA));  
          linha(24);
          // [c]
          locacoes.clientesQueAssistiram("O Castelo Animado");
          linha(50);

          //TESTE (3)
          Map<Categoria, Integer> categoriasAssistidas = filmes.getDicionario();
          System.out.println(categoriasAssistidas);
          linha(50);

          //TESTE (4)
          Set<Filme> filmesNuncaLocados = filmes.filmesNaoLocados();
          System.out.println(filmesNuncaLocados);
          linha(50);

          //TESTE (5)
          try {
               filmes.salvarFilmes();
          } catch (Exception e) {
               System.out.println("ERRO DE IO");
               e.printStackTrace();
          }
          
     }

     public static void linha(int linhas){
          String linha = "=-";
          System.out.println(linha.repeat(linhas));
     }
}