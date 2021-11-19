import java.time.LocalDate;

public class Locacao {
     private LocalDate data;
     private Cliente cliente;
     private Filme filme;

     public Locacao(LocalDate data, Cliente cliente, Filme filme){
          this.data = data;
          this.cliente = cliente;
          this.filme = filme;
     }

     public Cliente getCliente() {
          return cliente;
     }

     public Filme getFilme() {
          return filme;
     }

     public LocalDate getDataLocacao() {
          return data;
     }

     public void setDevolvido(){
          this.filme.setStatus(false);
     }

     @Override
     public String toString() {
          return getCliente().getNome() + ": " + getFilme().getNome() + " - " + getDataLocacao().toString();
     }
} 
