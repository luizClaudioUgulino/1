public class ProdutoDigital extends Produtos {

    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade, int tamanhoArquivo) {
        super(nome, preco, quantidade);
        this.tamanhoArquivo = tamanhoArquivo;
        //TODO Auto-generated constructor stub
      
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }


    @Override
    public double calculartudo(){
        return this.getPreco() * this.getQuantidade();
    }

    
}
