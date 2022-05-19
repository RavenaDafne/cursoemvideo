package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSwing {
    private JButton butao;
    private JPanel janela;

    public AppSwing() {
        butao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá Mundo!!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppSwing");
        frame.setContentPane(new AppSwing().janela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
