package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemView extends JFrame{


    JPanel pnlSystemView = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    public SystemView() {

        initComponentes();
        initMenubar();
        listener();
    }
    public void initComponentes(){
        setTitle("Tela de sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,800);
        setVisible(true);
        setContentPane(pnlSystemView);
        pnlSystemView.setLayout(null);
        setJMenuBar(menuBar);

    }



public void initMenubar(){
        JMenu cadastrosMenu = new JMenu("Cadastro");
        JMenu pesquisarMenu = new JMenu("Pesquisa");
        JMenu sairMenu = new JMenu("Sair");

        JMenuItem clientItem = new JMenuItem("Cliente");
        JMenuItem pesquiarItem = new JMenuItem("Pesquisa");
        JMenuItem sairItem = new JMenuItem("Sair");

        cadastrosMenu.add(clientItem);
        pesquisarMenu.add(pesquiarItem);
        sairMenu.add(sairItem);


        menuBar.add(cadastrosMenu);
        menuBar.add(pesquisarMenu);
        menuBar.add(sairMenu);

        clientItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new searchView();
                dispose();
            }
        });

        pesquiarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new searchView();
                dispose();
            }
        });

        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Deseja sair do sistema?";
                int opcaoEscolhida = JOptionPane.showConfirmDialog(null,
                        msg,"Sistema",
                        JOptionPane.YES_NO_OPTION);

                if (opcaoEscolhida == JOptionPane.YES_OPTION){
                    System.exit(0);
                }

            }
        });



}
public void listener(){
        ImageIcon addUser;
        addUser = new ImageIcon("C:\\Users\\marco.moreira\\Downloads\\icons\\user.png");

}





    public static void main(String[] args) {
            SystemView sw = new SystemView();
    }
}
