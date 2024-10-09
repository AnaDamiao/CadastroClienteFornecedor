package cadastrofornecedoreseclientes.entidades;

/**
 *
 * @author Ana Clara Damião
 */
public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String cpf, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    



}