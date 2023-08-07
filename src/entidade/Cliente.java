package entidade;

import java.util.Date;

public class Cliente extends Pessoa{
    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, String nome, String cpf, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(nome, cpf, sexo, dataNascimento, telefone, email, rg);
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

    
    }