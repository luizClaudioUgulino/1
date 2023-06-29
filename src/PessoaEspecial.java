public class PessoaEspecial extends Clientes {

    private String documentoIndetificacao;

    public PessoaEspecial(String nome, String telefone, String endereco, String documentoIndetificacao) {
        super(nome, telefone, endereco);
        this.documentoIndetificacao = documentoIndetificacao;
        //TODO Auto-generated constructor stub
        super.setLimite(-1);
    }
    
    public String getDocumentoIndetificacao() {
        return documentoIndetificacao;
    }

    public void setDocumentoIndetificacao(String documentoIndetificacao) {
        this.documentoIndetificacao = documentoIndetificacao;
    }



}
