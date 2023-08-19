package entidade;

public class Cliente extends Pessoa{
    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo , String cpf, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, cpf, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return getNome();
}
    }