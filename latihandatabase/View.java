/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandatabase;

import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class View {

    public View() {
        Controller controller = new Controller();
        ArrayList<User> users = controller.getAllUsers();
        if (users.size() > 0) {
            for (User user : users) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("Mohon maaf ada kesalahan, silakan coba kembali");
        }
        // User specificUser = controller.getUser("Budi", "Jl. Dipati Ukur");

        User newUser = new User();
        newUser.setName("Graceijndivai");
        newUser.setAddress("Jalan DU");
        newUser.setAge(15);
        newUser.setPhone("08261212323");
        // newUser.setName(textfieldName.getText());

        boolean status = controller.insertNewUser(newUser);
        if (status) {
            System.out.println("Insert Sukses");
        } else {
            System.out.println("Insert Gagal");
        }
    }

    public static void main(String[] args) {
        new View();
    }
}
