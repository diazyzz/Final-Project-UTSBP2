import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Akun {
    private String username;
    private String password;
    private File file = new File("akun.txt"); // Membuat objek file

    public Akun() {
        try {
            Scanner scanner = new Scanner(file);
            this.username = scanner.nextLine();
            this.password = scanner.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUsername(String username) {
        this.username = username;
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(this.username + "\n"); // Menulis username ke file
            writer.write(this.password + "\n"); // Menulis password ke file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setPassword(String password) {
        this.password = password;
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(this.username + "\n"); // Menulis username ke file
            writer.write(this.password + "\n"); // Menulis password ke file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
