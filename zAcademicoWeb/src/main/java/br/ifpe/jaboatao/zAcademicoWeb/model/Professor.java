package br.ifpe.jaboatao.zAcademicoWeb.model;

public class Professor extends Usuario{
    private String siape;
    private String areaFormacao;
    private String nivelInstrucao;


    public Professor(String nome, String cpf,int idade, String emailPessoal, String emailInstitucional, String senha,String siape, String areaFormacao, String nivelInstrucao) {
        super(nome, cpf, idade, emailPessoal, emailInstitucional,senha);
        this.siape = siape;
        this.areaFormacao = areaFormacao;
        this.nivelInstrucao = nivelInstrucao;
    }

    public String getSiape() {
        return this.siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getAreaFormacao() {
        return this.areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getNivelInstrucao() {
        return this.nivelInstrucao;
    }

    public void setNivelInstrucao(String nivelInstrucao) {
        this.nivelInstrucao = nivelInstrucao;
    }

    public String validaEmailInstitucional(String emailInstitucional){
        if(emailInstitucional.contains("jaboatao.ifpe.edu.br")){
            return emailInstitucional;
        }else{
            return "";
        }
    }


}
