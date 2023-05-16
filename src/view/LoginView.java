package view;

import controller.LoginController;
import model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginView extends  JFrame {
    private JPanel Login;
    private JButton btnLogin;
    private JButton btnLimpar;
    private JTextField txtLogin;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JPasswordField pswSenha;




    public LoginView() {
        initComponetes();
        listeners();


    }

    private void initComponetes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(800, 800);
        setVisible(true);
        setContentPane(Login);


        }

     public void listeners(){
         btnLogin.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String login = txtLogin.getText();
                 char[] senha =pswSenha.getPassword();

                 try {
                     LoginController lc = new LoginController();
                     ArrayList<Login> logiList = lc.buscarLoginSenha();
                     for(Login l: logiList){
                         if (l.getLogin().equalsIgnoreCase(new String((senha)))){
                             System.out.println("Login validado");

                             SystemView s = new SystemView();
                         } else {
                             JOptionPane.showMessageDialog(null,
                                     "Verrifique o usuario e senha",
                                     "Erro",
                                     JOptionPane.ERROR_MESSAGE);
                         }
                     }
                 }catch (SQLException ex) {
                     ex.printStackTrace();
                 }catch (ClassNotFoundException ex){
                     System.out.println("Classe não encontrada");
                 }

             }
         });

     }

}