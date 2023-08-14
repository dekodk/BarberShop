package entidade;

import java.util.Date;

public class Usuario extends Pessoa{
    protected String senha;
    protected String nivel;

    public Usuario(int id, String nome, char sexo, String cpf, String dataNascimento, String telefone, String email, String rg, String senha, String nivel){
        super(id, nome, cpf, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivel = nivel;
    }

    public Usuario(int id, String nome, String cpf) {
        super(nome, cpf);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}