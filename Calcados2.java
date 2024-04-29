
//EXEMPLO DE POLIMORFISMO SOBRESCRITA DE METODOS


  public class Calcados2 {
    String descricao() {
        return "Um calcado generico.";
    }
}

class Tenis extends Calcados2 {
    
    String descricao() {
        return "Um tenis de marca famosa.";
    }
}

class Sapato extends Calcados2 {
    
    String descricao() {
        return "Um sapato social elegante.";
    }
}



  