//EXEMPLO DE POLIMORFISMO SOBRECARGA DE METODOS

public class Calcados {

  String nome;
  int tamanho;

  public Calcados(String nome, int tamanho) {

  this.nome = nome;
  this.tamanho = tamanho;

  }

  public String Calcar(String nome, int tamanho, Boolean meia) {


System.out.println("O calçado " + nome + " usa Meia");


 return "Nome "+nome+"Tamanho: "+ tamanho+"Usa meia: "+ meia;
    }
    public String  Calcar(String nome, int tamanho) {
      System.out.println("O calçado " + nome + " NÃO usa Meia");
      return "Nome "+nome + "Tamanho" +tamanho;
      }
  
}
  