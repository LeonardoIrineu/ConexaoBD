package dobackaofront;

import dobackaofront.controller.BancoDeDados;
import dobackaofront.model.Usuario;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        BancoDeDados bd = new BancoDeDados();

        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setIdade(28);
        usuario.setSexo('m');
        usuario.setCpf("12345678911");
        usuario.setCor_da_pele("branca");
        usuario.setPeso(61);
        usuario.setAltura(1.78);

        bd.alterarDados(6, usuario);






//        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//
//        for (int i=0; i<6; i++){
//            Usuario usuario = bd.getUsuario(i);
//            usuarios.add(usuario);
//        }
//
//        System.out.println("até aqui");
//        System.out.println(usuarios.size());
//
//        for (int i=0; i<usuarios.size(); i++){
//            if (usuarios.get(i) == null){
//                continue;
//            }else {
//                usuarios.get(i).apresentar();
//            }
//
//        }

//        bd.inserirDados(usuario1);
//        bd.deletarDados(2);

    }
}