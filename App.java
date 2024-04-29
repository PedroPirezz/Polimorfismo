import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);

    Calcados Calcado1 = new Calcados("Vans", 42);
    

    Calcado1.Calcar(Calcado1.nome, Calcado1.tamanho, false);
    Calcado1.Calcar(Calcado1.nome, Calcado1.tamanho);


    Calcados2 calcado2 = new Tenis();
    Calcados2 calcado3 = new Sapato();
    

    System.out.println("Descricao do calcado 2: " + calcado2.descricao());
    System.out.println("Descricao do calcado 3: " + calcado3.descricao());
    



    teclado.close();



    }
}
