package br.ifpe.jaboatao.zacademicoweb.model;
import java.util.ArrayList;

public class Aluno extends Usuario{
    private String matricula;
    private Escola escolaAnterior;
    private ArrayList<NotaSelecao> notasSelecao;

    public Aluno(String nome, String cpf,int idade, String email_pessoal, String emailInstitucional, String senha, String matricula){
        super(nome, cpf, idade, email_pessoal,emailInstitucional,senha);
        this.matricula = matricula;
    }

    public ArrayList<NotaSelecao> getNotasSelecao() {
        return this.notasSelecao;
    }

    public void setNotasSelecao(ArrayList<NotaSelecao> notasSelecao) {
        this.notasSelecao = notasSelecao;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public Escola getEscolaAnterior() {
        return this.escolaAnterior;
    }

    public void setEscolaAnterior(Escola escolaAnterior) {
        this.escolaAnterior = escolaAnterior;
    }


    public String  validaEmailInstitucional(String emailInstitucional){
        if(emailInstitucional.contains("discente.ifpe.edu.br")){
            return emailInstitucional;
        }else{
            return "";
        }
    }

    public void imprimeNotasSelecao(){
        for (NotaSelecao notaSelecao : this.notasSelecao) {
            System.out.println("Disciplina: "+notaSelecao.getDisciplina());
            System.out.println("Nota: "+notaSelecao.getNota());
            System.out.println("EJA? "+notaSelecao.isEja());
        }
    }


}
