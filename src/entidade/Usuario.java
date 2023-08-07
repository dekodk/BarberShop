package entidade;

import java.util.Date;

public class Usuario extends Pessoa{
    protected String senha;
    protected String nivel;

    public Usuario(String senha, String nivel, String nome, String cpf, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(nome, cpf, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    
}