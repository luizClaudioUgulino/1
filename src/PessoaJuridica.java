public class PessoaJuridica  extends Clientes{

    private String cnpj;
    private String representade;

    public PessoaJuridica(String nome, String telefone, String endereco, String representande,String cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.representade = representande;
        super.setLimite(10);
    }
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentade() {
        return representade;
    }

    public void setRepresentade(String representade) {
        this.representade = representade;
    }

  
}
