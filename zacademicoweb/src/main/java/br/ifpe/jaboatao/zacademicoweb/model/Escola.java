package br.ifpe.jaboatao.zacademicoweb.model;
public class Escola implements Instituicao{
    private String id_mec;
    private String nome;
    private String endereco;
    private int ano_conclusao;
    private String contato;

    public Escola(String id_mec, String nome, String endereco, int ano_conclusao, String contato) {
        this.id_mec = id_mec;
        this.nome = nome;
        this.endereco = endereco;
        this.ano_conclusao = ano_conclusao;
        this.contato = contato;
    }

    public String getId_mec() {
        return this.id_mec;
    }

    public void setId_mec(String id_mec) {
        this.id_mec = id_mec;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAno_conclusao() {
        return this.ano_conclusao;
    }

    public void setAno_conclusao(int ano_conclusao) {
        this.ano_conclusao = ano_conclusao;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void imprimeDados(){
        System.out.println("ID MEC: "+this.id_mec);
        System.out.println("Nome da Escola: "+this.nome);
    }

    @Override
    public void printInfo(){
        System.out.println("ID MEC: "+this.id_mec);
        System.out.println("Nome da Escola: "+this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Contato: "+this.contato);
    }

    @Override
    public String validaIdMec(){
        System.out.println("Consultando base do MEC...");
        return "Deu certo!";
    }
    @Override
    public boolean trocouEndereco(String novoEndereco){
        if(!this.endereco.equals(novoEndereco)){
            return true;
        }else{
            return false;
        }
    }

}
