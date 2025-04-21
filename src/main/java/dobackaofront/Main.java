package dobackaofront;

import dobackaofront.controller.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
//        Usuario usuario1 = new Usuario("Leonardo", 28, 'm',"12345678911","amarelo",73.5,1.70);
//        Usuario usuario2 = new Usuario("Karollyne", 23, 'f',"12345678911","negra",54.5,1.60);

        BancoDeDados bd = new BancoDeDados();
        bd.deletarDados(2);

    }
}