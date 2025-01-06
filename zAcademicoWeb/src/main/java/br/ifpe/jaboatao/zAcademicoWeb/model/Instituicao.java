package br.ifpe.jaboatao.zAcademicoWeb.model;

public interface Instituicao {

    public void printInfo();
    public String validaIdMec();
    public boolean trocouEndereco(String novoEndereco);
}
