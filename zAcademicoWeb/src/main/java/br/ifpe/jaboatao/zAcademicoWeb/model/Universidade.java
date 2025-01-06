package br.ifpe.jaboatao.zAcademicoWeb.model;

public class Universidade implements Instituicao,InstituicaoPublica{
    private String nome;
    private String endereco;
    private String portaria;
    private String nomeReitor;

    @Override
    public void printInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Portaria: "+this.portaria);
    }

    @Override
    public String validaIdMec(){
        return "";
    }

    @Override
    public boolean trocouEndereco(String novoEndereco){
        return true;
    }

    @Override
    public void printNome(){
        System.out.println(this.nome);
    }

}
