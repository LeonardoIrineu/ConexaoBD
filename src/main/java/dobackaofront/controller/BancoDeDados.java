package dobackaofront.controller;

import dobackaofront.model.Usuario;

import java.sql.*;

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

        public Usuario getUsuario(int id) throws SQLException {
            comandoSQL = "select * from usuarios where id = ?";
            conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement stmt = conexao.prepareStatement(comandoSQL);

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    Usuario usuario = new Usuario();
                    usuario.setNome(rs.getString("nome"));
                    usuario.setIdade(rs.getInt("idade"));
                    usuario.setSexo(rs.getString("sexo").charAt(0));
                    usuario.setCpf(rs.getString("cpf"));
                    usuario.setCor_da_pele(rs.getString("cor_da_pele"));
                    usuario.setPeso(rs.getDouble("peso"));
                    usuario.setAltura(rs.getDouble("altura"));

                    rs.close();
                    stmt.close();
                    conexao.close();
                    return usuario;
                }else {
                    return null;
                }
            }
        }

        public void alterarDados(int id, Usuario usuario) throws SQLException {
            try {
                comandoSQL = "update usuarios set nome = ?, idade = ?, sexo = ?, cpf = ?, cor_da_pele = ?, peso = ?, altura = ? where id = ?";
                conexao = DriverManager.getConnection(url, login, senha);
                PreparedStatement stmt = conexao.prepareStatement(comandoSQL);

                stmt.setString(1, usuario.getNome());
                stmt.setInt(2, usuario.getIdade());
                stmt.setString(3, String.valueOf(usuario.getSexo()));
                stmt.setString(4, usuario.getCpf());
                stmt.setString(5, usuario.getCor_da_pele());
                stmt.setDouble(6, usuario.getPeso());
                stmt.setDouble(7, usuario.getAltura());
                stmt.setInt(8, id);

                stmt.executeUpdate();
                stmt.close();
                conexao.close();

                System.out.println("Cadastro do usuario: " + usuario.getNome() + " alterado com sucesso!");
            }catch (SQLException e) {
                System.out.println("Erro ao alterar os dados do usuario: " + usuario.getNome());
            }
        }
}
