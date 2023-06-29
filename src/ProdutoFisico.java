public class ProdutoFisico extends Produtos{

    private double peso;
    ////  quantidade de produto se aplicar em tudo :
    /// tipo teve somar todos os produtos ?

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        if(peso < 2){
        super.setFrete(5);
        }else if ( peso > 2 && peso < 5){
            super.setFrete(10);
        }else if( peso > 5){
            super.setFrete( peso * 2.5);
        }

      this.peso = peso;
    }

     public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
     public double calculartudo(){
        return this.getPreco() * this.getQuantidade() + super.getFrete(); 
    }




}
