public class FinalProjectUTSBP2 {
    public static void main(String[] args) {

        Akun akun = new Akun();
        akun.setUsername("admin");
        akun.setPassword("admin");

        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);

    }
}
