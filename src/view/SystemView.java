package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemView extends JFrame {
    private JPanel telaInicio;
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JButton clientesButton;

    public SystemView() {
        createUIComponents();
    }

    private void listeners(){
        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }

    private void createUIComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sistema");
        setSize(800, 800);
        setVisible(true);
        setContentPane(telaInicio);

    }

    public static void main(String[] args) {
        SystemView sys =new SystemView();
    }
}
