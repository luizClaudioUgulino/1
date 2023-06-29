import java.util.ArrayList;

public class CarrinhoDeCompras {

    private Clientes cliente;
   
    private ArrayList<Produtos> produtos;


    public CarrinhoDeCompras(Clientes cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<Produtos>();
    }

    public Clientes getCliente() {
        return cliente;
    }


    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Boolean adicionarProdutos( Produtos produto){
        if( this.produtos.size() < cliente.getLimite()){   /// obs. Isso esta querendo dizer, se o tamanho carrinho de compras for á baixo do limite do cliente, fica true.
        this.produtos.add(produto);
        return true;
        }else{
            return false;
        }
    }

    public void removerProdutos( Produtos produto){
         this.produtos.remove(produto);
    }


    public double calcularValorTotal(){
        double retorno = 0 ;
        for(int x = 0; x < produtos.size(); x++){

            Produtos pt = produtos.get(x);
            retorno += pt.calculartudo();
        }
        return retorno;

    }




}
