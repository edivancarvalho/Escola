package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Alunos;

/**
 *
 * @author edivan
 */
public class AlunosDao {
    
    private Connection conexao;

    // Construtor que preparar a conexao;
    public AlunosDao() {
        conexao = ModuloConexaoDao.conector();
    }

    // Dao para adicionar.
    public void adicionarAlunos(Alunos aluno) throws Exception {
        // variavel que ira realizar o insert
        String sql = "insert into aluno (alu_nome) VALUES (?)";

        try {
            // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // pegar os dados da variavel Alunos usando o getNome;
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }

}
