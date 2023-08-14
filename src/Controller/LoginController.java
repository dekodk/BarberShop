package Controller;

import Controller.Helper.LoginHelper;
import Model.Dao.UsuarioDAO;
import View.Login;
import entidade.Usuario;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
       Usuario usuario = helper.obterModelo();
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       if(usuarioAutenticado != null){
           MenuPrincipal menu = MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuário ou senha inválidos!");
       }
    }
    
    public void fiztarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executeio fiz tarefa");
    }

    private MenuPrincipal MenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
