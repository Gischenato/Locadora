public class Filme {
     private String nome;
     private int codigo;
     private boolean locado;
     private Categoria categoria;

     public enum Categoria {
          Drama, Acao, Comedia, Romance
     }

     public Filme(String nome, int codigo, Categoria categoria) {
          this.nome = nome;
          this.codigo = codigo;
          this.categoria = categoria;
          this.locado = false;
     }

     public int getCodigo() {
          return codigo;
     }

     public String getNome() {
          return nome;
     }

     public Categoria getCategoria() {
          return categoria;
     }

     public boolean locado(){
          return locado;
     }

     public void setStatus(boolean locado) {
          this.locado = locado;
     }

     @Override
     public String toString() {
          return getCategoria() + ": " + getNome() + " - " + getCodigo(); 
     }
}
