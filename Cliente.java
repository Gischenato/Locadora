public class Cliente {
     private String nome;
     private int codigo;
     
     public Cliente(String nome, int codigo){
          this.nome = nome;
          this.codigo = codigo;
     }

     public int getCodigo() {
          return codigo;
     }

     public String getNome() {
          return nome;
     }

     @Override
     public String toString() {
          return getNome() + " - " + getCodigo();
     }
}
