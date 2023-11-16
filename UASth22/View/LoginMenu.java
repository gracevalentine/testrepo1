package Sem3.PrakPBO.LatihanUASth22.View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import LatihanUASth22.View.PageMenu;

public class LoginMenu {
    JFrame frame;

    public LoginMenu() {
        frame = new JFrame("Sistem Pencarian Film");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel loginMenu = new JLabel("Menu Login");
        loginMenu.setBounds(130, 20, 200, 20);
        loginMenu.setFont(new Font(null, Font.BOLD, 14));
        frame.add(loginMenu);

        JLabel email = new JLabel("Email: ");
        email.setBounds(25, 55, 200, 25);
        frame.add(email);
        JTextField cekEmail = new JTextField();
        cekEmail.setBounds(120, 56, 200, 25);
        frame.add(cekEmail);

        JLabel password = new JLabel("Password: ");
        password.setBounds(25, 100, 200, 25);
        frame.add(password);
        JPasswordField cekPassword = new JPasswordField();
        cekPassword.setBounds(120, 101, 200, 25);
        frame.add(cekPassword);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(60, 170, 100, 25);
        frame.add(backButton);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(200, 170, 100, 25);
        frame.add(loginButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PageMenu();
                frame.setVisible(false);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginMenu();
    }
}
