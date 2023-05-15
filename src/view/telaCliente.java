package view;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class telaCliente extends JFrame {
    private JButton excluirButton;
    private JButton editarButton;
    private JButton sairButton;
    private JButton novoButton;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton femininoRadioButton;
    private JRadioButton masculinoRadioButton;
    private JTextField textField3;
    private JFormattedTextField formattedTextField1;
    private JTable table1;
    private JPanel telaCliente;
    private JButton atualizarButton;
    private JButton gravarButton;
    private JButton cancelarButton;

    public telaCliente() {
    addListener();
    iniciarComponentes();

}


    public void iniciarComponentes() {
        setTitle("Tela Cliente");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaCliente);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addListener(){
    table1.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            String[] collunsNames = {"codigo","nome"};
            JTable table = new JTable();

            super.componentResized(e);
        }

    });
}

    public static void main(String[] args) {
        view.telaCliente tela = new telaCliente();
    }
}
