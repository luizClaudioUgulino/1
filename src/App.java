public class App {
    public static void main(String[] args) throws Exception {
 
        //// teste de impletações 
        PessoaFisica pf = new PessoaFisica("jean", "64932837776", "Rua 12 de ventos,n32,bairro caique", "12343298723");
        CarrinhoDeCompras cp = new CarrinhoDeCompras(pf);

        ProdutoFisico bl = new ProdutoFisico("notebook",2000,1,4); 
        ProdutoFisico cl = new ProdutoFisico("colar de diamante",1000,1,3); 
        ProdutoFisico pt = new ProdutoFisico("bola de tenis",20,1,1); 

       boolean possivel = cp.adicionarProdutos(pt); ///
        if(possivel){
            System.out.println("adição com sucesso protudo :" + pt.getNome());
        }else{
            System.out.println("limite atigindo");}

       possivel = cp.adicionarProdutos(cl); ///
        if(possivel){
            System.out.println("adição com sucesso protudo :" + cl.getNome());
        }else{
            System.out.println("limite atigindo");}

           possivel = cp.adicionarProdutos(bl); ///
        if(possivel){
            System.out.println("adição com sucesso protudo :" + bl.getNome());
        }else{
            System.out.println("limite atigindo");}
  

        double valor = cp.calcularValorTotal();  //// valor esperado  2000 + 1000 + 20 + 10 + 10 + 5 = 3045
        System.out.println("valor total do carrinho : " + valor);

        ProdutoFisico gl = new ProdutoFisico("celular",2000,1,4); 
            possivel = cp.adicionarProdutos(gl); ///
        if(possivel){
            System.out.println("adição com sucesso protudo :" + gl.getNome());
        }else{
            System.out.println("limite atigindo");}
  

        
    }
}
