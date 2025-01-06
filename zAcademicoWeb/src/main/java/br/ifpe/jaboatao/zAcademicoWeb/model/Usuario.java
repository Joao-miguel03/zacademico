package br.ifpe.jaboatao.zAcademicoWeb.model;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String emailPessoal;
    private String emailInstitucional;
    private String senha;

    public Usuario(String nome, String cpf,int idade, String emailPessoal, String emailInstitucional, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.emailPessoal = emailPessoal;
        this.emailInstitucional = emailInstitucional;
        this.senha = senha;
    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmailPessoal() {
        return this.emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getEmailInstitucional() {
        return this.emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public abstract String validaEmailInstitucional(String emailInstitucional);

}
