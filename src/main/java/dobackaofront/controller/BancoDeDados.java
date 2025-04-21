package dobackaofront.controller;

import dobackaofront.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {

    //conexao - abertura e fechamento do banco de dados
    String url = "jdbc:mysql://localhost:3306/cadastro";
    String login = "root";
    String senha = "admin";
    String comandoSQL;

    Connection conexao = null;
        public void inserirDados(Usuario usuario) {
            try {
                conexao = DriverManager.getConnection(url, login, senha);
                System.out.println("Conectado com sucesso!");

                comandoSQL = "insert into usuarios(nome,idade,sexo,cpf,cor_da_pele,peso,altura) values(?,?,?,?,?,?,?)";

                PreparedStatement stmt = conexao.prepareStatement(comandoSQL);
                stmt.setString(1, usuario.getNome());
                stmt.setInt(2, usuario.getIdade());
                stmt.setString(3, String.valueOf(usuario.getSexo()));
                stmt.setString(4, usuario.getCpf());
                stmt.setString(5, usuario.getCor_da_pele());
                stmt.setDouble(6, usuario.getPeso());
                stmt.setDouble(7, usuario.getAltura());

                stmt.executeUpdate();
                stmt.close();

                System.out.println("Usuario cadastro com sucesso!");
                conexao.close();
                System.out.println("A conexão com o banco de dados foi realizada com sucesso!");
            } catch (
                    SQLException e) {
                System.out.println("Não foi possivel conectar ao banco de dados");
            }
        }

        public void deletarDados(int id) throws SQLException {
            comandoSQL = "delete from usuarios where id = ?";
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement stmt = conexao.prepareStatement(comandoSQL);
            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Usuario deletado com sucesso!");
            stmt.close();
            conexao.close();

        }
}
