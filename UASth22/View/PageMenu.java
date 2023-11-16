package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageMenu {
    JFrame frame;

    public PageMenu() {
        frame = new JFrame("Sistem Pencarian Film");
        frame.setSize(400, 280);
        frame.setLayout(null);

        JLabel mainLabel = new JLabel("Selamat Datang di Sistem Pencarian Film");
        mainLabel.setBounds(50, 20, 300, 20);
        mainLabel.setFont(new Font(null, Font.BOLD, 14));
        frame.add(mainLabel);

        JButton loginButton = new JButton("Login Pengguna");
        loginButton.setBounds(90, 65, 190, 25);
        frame.add(loginButton);

        JButton registButton = new JButton("Registrasi Pengguna Baru");
        registButton.setBounds(90, 110, 190, 25);
        frame.add(registButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginMenu();
                frame.setVisible(false);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PageMenu();
    }
}
