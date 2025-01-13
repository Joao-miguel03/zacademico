package br.ifpe.jaboatao.zacademicoweb.model.dao;

import org.springframework.jdbc.core.simple.JdbcClient;

import br.ifpe.jaboatao.zacademicoweb.model.Aluno;

public class AlunoDAO {
    private final JdbcClient jdbcClient;

    public AlunoDAO(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public int create(Aluno aluno) {
        return jdbcClient.sql("Insert into aluno (nome, cpf, idade, email_pessoal, senha, matricula) values (:nome, :cpf, :idade, :email_pessoal, :senha, :matricula)").param("nome", aluno.getNome()).param("cpf", aluno.getCpf()).param("idade", aluno.getIdade()).param("email_pessoal", aluno.getEmailPessoal()).param("senha", aluno.getSenha()).param("matricula", aluno.getMatricula()).update();
    }
}
