package br.ifpe.jaboatao.zacademicoweb.model;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String email_pessoal;
    private String emailInstitucional;
    private String senha;

    public Usuario(String nome, String cpf,int idade, String email_pessoal, String emailInstitucional, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email_pessoal = email_pessoal;
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
        return this.email_pessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.email_pessoal = emailPessoal;
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
