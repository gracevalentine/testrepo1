package View;

// import javax.imageio.ImageIO;
// import javax.swing.ButtonGroup;
// import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
// import javax.swing.JRadioButton;
import javax.swing.JTextField;
// import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
import java.util.Properties;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Controller.DateLabelFormatter;


public class RegistrationMenu extends JFrame{
    JFrame frame;
    JPanel photoPanel;
    JFileChooser fileFoto;

    public RegistrationMenu() {
        frame = new JFrame("Sistem Pencarian Film");
        frame.setSize(400, 500);
        frame.setLayout(null);

        JLabel registMenu = new JLabel("Registration");
        registMenu.setBounds(130, 20, 300, 20);
        registMenu.setFont(new Font(null, Font.BOLD, 14));
        frame.add(registMenu);

        JLabel nama = new JLabel("Nama: ");
        nama.setBounds(25, 55, 200, 25);
        frame.add(nama);
        JTextField isiNama = new JTextField();
        isiNama.setBounds(120, 56, 200, 25);
        frame.add(isiNama);

        JLabel email = new JLabel("Email: ");
        email.setBounds(25, 85, 200, 25);
        frame.add(email);
        JTextField isiEmail = new JTextField();
        isiEmail.setBounds(120, 86, 200, 25);
        frame.add(isiEmail);

        JLabel password = new JLabel("Password");
        password.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
        frame.add(password);
        JPasswordField isiPassword = new JPasswordField();
        isiPassword.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
        frame.add(isiPassword);

        // JLabel gender = new JLabel("Jenis Kelamin: ");
        // JRadioButton pria = new JRadioButton();
        // JRadioButton wanita = new JRadioButton();
        // ButtonGroup bgGender = new ButtonGroup();

        // JLabel birthday = new JLabel();
        UtilDateModel modelBirthday = new UtilDateModel();
        Properties prop = new Properties();
        prop.put("text.today", "Today");
        prop.put("text.month", "Month");
        prop.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(modelBirthday, prop);
        JDatePickerImpl isiBirthday = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        isiBirthday.setBounds(140, 102, 200, 28);
        frame.add(isiBirthday);

        JLabel foto = new JLabel("Foto: ");
        foto.setBounds(390, 10, 200, 20);
        frame.add(foto);
        JButton isiFoto = new JButton("Upload");
        isiFoto.setBounds(540, 12, 140, 20);
        frame.add(isiFoto);
        JLabel tampilFoto = new JLabel("Tampilan Foto Anda: ");
        tampilFoto.setBounds(390, 210, 200, 20);
        frame.add(tampilFoto);
        photoPanel = new JPanel();
        photoPanel.setBounds(390, 230, 120, 120);
        frame.add(photoPanel);

        // isiFoto.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         chooseFoto();
        //     }
        // });

        JButton backButton = new JButton("BACK");
        backButton.setBounds(60, 170, 100, 25);
        frame.add(backButton);

        JButton loginButton = new JButton("REGIST NOW");
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
        new RegistrationMenu();
    }
}