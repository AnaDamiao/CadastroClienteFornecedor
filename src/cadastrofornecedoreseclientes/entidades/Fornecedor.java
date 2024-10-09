package cadastrofornecedoreseclientes.entidades;

/**
 *
 * @author Ana Clara Damião
 */
public class Fornecedor extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public Fornecedor(String cnpj, String inscricaoEstadual, String inscricaoMunicipal, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
    
}
