package br.ifpe.jaboatao.zAcademicoWeb.model.dao;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import br.ifpe.jaboatao.zAcademicoWeb.model.Aluno;

@Repository
public class AlunoDAO {
    private final JdbcClient jdbcClient;

    public AlunoDAO(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public int create(Aluno aluno) {
        return jdbcClient.sql("Insert into aluno (nome, cpf, idade, email_pessoal, senha, matricula) values (:nome, :cpf, :idade, :email_pessoal, :senha, :matricula)").param("nome", aluno.getNome()).param("cpf", aluno.getCpf()).param("idade", aluno.getIdade()).param("email_pessoal", aluno.getEmailPessoal()).param("senha", aluno.getSenha()).param("matricula", aluno.getMatricula()).update();
    }
}
