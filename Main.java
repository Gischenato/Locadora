public class Main {
     public static void main(String[] args) {
          GerenciadorClientes clientes = GerenciadorClientes.getInstance();
          GerenciadorFilmes filmes = GerenciadorFilmes.getInstance();
          GerenciadorLocacoes locacoes = GerenciadorLocacoes.getInstance();

          clientes.adicionarCliente(new Cliente("Giovanni", 1));
          clientes.adicionarCliente(new Cliente("Gabriel", 2));
          clientes.adicionarCliente(new Cliente("Augusto", 3));
          clientes.adicionarCliente(new Cliente("Katharina", 4));

          filmes.adicionarFilme(new Filme("Rogue One", 1, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Gente Grande", 2, Categoria.COMEDIA));
          filmes.adicionarFilme(new Filme("Venom", 3, Categoria.ACAO));
          filmes.adicionarFilme(new Filme("Parasita", 4, Categoria.DRAMA));
          filmes.adicionarFilme(new Filme("Your Name", 5, Categoria.ROMANCE));

          locacoes.solicitarLocacao(1, 2);
          locacoes.solicitarLocacao(3, 5);
          System.out.println(locacoes);          
     }
}