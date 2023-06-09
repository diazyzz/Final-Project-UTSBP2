import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class Operasi {
    public void anggotaKelompok(){
        System.out.println("Oleh : ");
        System.out.println("1. Dias Norman (22082010134)");
        System.out.println("2. Krisna Eko Prasetyo (22082010149)");
        System.out.println("3. Hisyam Abiyansah G. (22082010161)");
        System.out.println("4. M. Farhan Hidayatulloh (22082010141)");
    }
    public void mulaiOperasi(){
        System.out.println("1. Owner");
        System.out.println("2. Admin");
        System.out.println("3. Kasir");
        System.out.println("4. Logout");
        System.out.print("pilih operasi : ");
    }
    public void mulaiOwner(){
        System.out.println("==SELAMAT DATANG OWNER==");
        System.out.println("1. Ubah Restoran");
        System.out.println("2, Ubah Owner");
        System.out.println("3. Info Restoran & Owner");
        System.out.println("4. Data Pelanggan");
        System.out.println("5. Data Penjualan");
        System.out.println("6. Ubah User & Pass");
        System.out.println("7. Kembali");
        System.out.print("pilih : ");
    }
    public void mulaiAdmin(){
        System.out.println("SELAMAT DATANG ADMIN");
        System.out.println("1. Lihat Menu");
        System.out.println("2. Tambah Menu");
        System.out.println("3. Ubah Menu");
        System.out.println("4. Hapus Menu");
        System.out.println("5. Kembali");
        System.out.print("Pilih : ");
    }
    public void mulaiKasir(){
        System.out.println("SELAMAT DATANG KASIR");
        System.out.println("1. Layani Pesanan");
        System.out.println("2. Cetak Nota");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
    }
    public void mulaiTambahMenu(){
        System.out.println("Tambah Menu");
        System.out.println("1. Makanan\n2. Minuman");
        System.out.print("pilih : ");
    }
    public void mulaiUbahMenu(){
        System.out.println("Ubah Menu");
        System.out.println("1. Makanan\n2. Minuman");
        System.out.print("pilih : ");
    }
    public void mulaiHapusMenu(){
        System.out.println("Pilih Jenis Menu yang ingin dihapus\n1. Makanan\n2. Minuman");
        System.out.print("Pilih : ");
    }
    public void menuDibuat(){
        System.out.println("Menu dibuat..");
        System.out.println("Tambah menu lagi? (y/n)");
    }
    public void awalLogin(){
        System.out.println("======== KANOPI ========");
        System.out.println("Kedai Nongkrong & Ngopi");
        System.out.println("========================");
    }
    public void mainMenu(){
        Scanner scn = new Scanner(System.in);
        Operasi operasi = new Operasi();
        Date now = new Date();
        LocalDate ldt = LocalDate.now();
        Owner owner = new Owner();
        Restoran restoran = new Restoran();
        Pelanggan pelanggan = new Pelanggan();
        Pesanan pesanan = new Pesanan();
        Menu menu = new Menu();
        Makanan makanan = new Makanan();
        Minuman minuman = new Minuman();
        Akun akun = new Akun();
        assert false;
        int pesananMakanan, pesananMinuman, pesananTotal, bayar, kembalian, pilihOperasi, pilihAdmin, pilihKasir;

        restoran.setRestoran("KANOPI", "Surabaya");
        owner.setOwner("Banteng", "IKIP", "08197000000");
        makanan.menuMakanan.add("Kebab");
        makanan.menuMakanan.add("Burger");
        makanan.menuMakanan.add("Hotdog");
        makanan.menuMakanan.add("Dimsum");

        minuman.menuMinuman.add("Tea");
        minuman.menuMinuman.add("Coffee");
        minuman.menuMinuman.add("Mineral");
        minuman.menuMinuman.add("Milk");

        makanan.hargaMakanan.add(13000);
        makanan.hargaMakanan.add(25000);
        makanan.hargaMakanan.add(20000);
        makanan.hargaMakanan.add(10000);

        minuman.hargaMinuman.add(3000);
        minuman.hargaMinuman.add(5000);
        minuman.hargaMinuman.add(2000);
        minuman.hargaMinuman.add(8000);

        do {
            System.out.println();
            operasi.awalLogin();
            operasi.mulaiOperasi();
            pilihOperasi = scn.nextInt();
            switch (pilihOperasi) {
                case 1 -> {
                    int pilihOwner;
                    do {
                        System.out.println();
                        operasi.mulaiOwner();
                        pilihOwner = scn.nextInt();
                        switch (pilihOwner) {
                            case 1 -> {
                                if (restoran != null) {
                                    restoran.setRestoran(null, null);
                                    System.out.print("Masukkan nama baru Restoran : ");
                                    scn = new Scanner(System.in);
                                    String ubahRestoran = scn.nextLine();
                                    System.out.print("Alamat baru Restoran : ");
                                    scn = new Scanner(System.in);
                                    String ubahAlamatRestoran = scn.nextLine();
                                    restoran = new Restoran();
                                    restoran.setRestoran(ubahRestoran, ubahAlamatRestoran);
                                } else {
                                    System.out.println("Data restoran belum ada...");
                                }
                            }
                            case 2 -> {
                                if (owner != null) {
                                    owner.setOwner(null, null, null);
                                    System.out.print("Masukkan nama baru Owner : ");
                                    scn = new Scanner(System.in);
                                    String ubahOwner = scn.nextLine();
                                    System.out.print("Alamat baru Owner : ");
                                    scn = new Scanner(System.in);
                                    String ubahAlamatOwner = scn.nextLine();
                                    System.out.print("Masukkan no Telp baru Owner : ");
                                    String ubahnoTelpOwner = scn.next();
                                    owner = new Owner();
                                    owner.setOwner(ubahOwner, ubahAlamatOwner, ubahnoTelpOwner);
                                } else {
                                    System.out.println("Data owner belum ada...");
                                }

                            }
                            case 3 -> {
                                System.out.println();
                                System.out.println("Data Restoran");
                                if (restoran != null) {
                                    restoran.displayRestoran();
                                } else {
                                    System.out.println("Data belum didaftarkan");
                                }
                                System.out.println();
                                System.out.println("Data Owner ");
                                if (owner != null) {
                                    owner.displayOwner();
                                } else {
                                    System.out.println("Data belum didaftarkan");
                                }
                            }
                            case 4 -> {
                                System.out.println();
                                System.out.println("Data pelanggan terdata pada : " + ldt);
                                pelanggan.displayDaftarPelanggan();
                            }
                            case 5 -> {
                                System.out.println();
                                pesanan.displayLaporanMakanan();
                                System.out.println();
                                pesanan.displayLaporanMinuman();
                                System.out.println();
                                pesanan.totalPendapatan();
                            }
                            case 6 -> {
                                System.out.print("Username lama: ");
                                String user = scn.next();
                                System.out.print("Password lama: ");
                                String pass = scn.next();
                                if (user.equals(akun.getUsername())&pass.equals(akun.getPassword())){
                                    System.out.println("Data yang anda masukkan benar.");
                                    System.out.println("Username baru: ");
                                    user = scn.next();
                                    System.out.println("Password baru: ");
                                    pass = scn.next();
                                    akun.setUsername(user);
                                    akun.setPassword(pass);
                                    System.out.println(akun.getUsername()+akun.getPassword());
                                    System.out.println("Telah berhasil mengubah username & password.");
                                } else {
                                    System.out.println("Data yang anda masukkan salah.");
                                }
                            }
                            case 7 -> System.out.println("TERIMAKASIH OWNER!");

                        }
                    } while (pilihOwner != 7);
                }
                case 2 -> {
                    do {
                        System.out.println();
                        operasi.mulaiAdmin();
                        pilihAdmin = scn.nextInt();
                        switch (pilihAdmin) {
                            case 1 -> {
                                System.out.println();
                                makanan.MenuMakanan();
                                minuman.MenuMinuman();
                            }
                            case 2 -> {
                                System.out.println();
                                operasi.mulaiTambahMenu();
                                int pilihTambahMenu = scn.nextInt();
                                if (pilihTambahMenu == 1) {
                                    String pilihTambahMenuMakanan;
                                    do {
                                        System.out.println();
                                        makanan.tambahMenuMakanan();
                                        makanan.displayTambahMenuMakanan();
                                        operasi.menuDibuat();
                                        pilihTambahMenuMakanan = scn.next();
                                    } while (!pilihTambahMenuMakanan.equals("n"));
                                } else {
                                    String pilihTambahMenuMinuman;
                                    do {
                                        System.out.println();
                                        minuman.tambahMenuMinuman();
                                        minuman.displayTambahMenuMinuman();
                                        operasi.menuDibuat();
                                        pilihTambahMenuMinuman = scn.next();
                                    } while (!pilihTambahMenuMinuman.equals("n"));
                                }
                            }
                            case 3 -> {
                                System.out.println();
                                operasi.mulaiUbahMenu();
                                int pilihUbahMenu = scn.nextInt();
                                System.out.println();
                                if (pilihUbahMenu == 1) {
                                    makanan.ubahMenuMakanan();
                                    makanan.displayUbahMenuMakanan();
                                } else {
                                    minuman.ubahMenuMinuman();
                                    minuman.displayUbahMenuMinuman();
                                }
                                System.out.println("Menu berhasil diubah..");
                            }
                            case 4 -> {
                                System.out.println();
                                operasi.mulaiHapusMenu();
                                int pilihHapusMenu = scn.nextInt();
                                if (pilihHapusMenu == 1) {
                                    makanan.MenuMakanan();
                                    System.out.print("Hapus menu Makanan nomor : ");
                                    int hapusMenu = scn.nextInt();
                                    makanan.menuMakanan.remove(hapusMenu - 1);
                                    makanan.hargaMakanan.remove(hapusMenu-1);
                                } else {
                                    minuman.MenuMinuman();
                                    System.out.print("Hapus menu Minuman nomor : ");
                                    int hapusMinuman = scn.nextInt();
                                    minuman.menuMinuman.remove(hapusMinuman - 1);
                                    minuman.hargaMinuman.remove(hapusMinuman-1);
                                }
                                System.out.println("Menu berhasil dihapus..");
                            }
                            case 5 -> System.out.println("TERIMAKASIH ADMIN!");
                        }
                    } while (pilihAdmin != 5);
                }
                case 3 -> {
                    do {
                        System.out.println();
                        operasi.mulaiKasir();
                        pilihKasir = scn.nextInt();
                        switch (pilihKasir) {
                            case 1 -> {
                                System.out.println();
                                System.out.println("== LAYANI PESANAN ==");
                                System.out.println("Masukkan Data Pelanggan");
                                System.out.print("id : ");
                                String idPelanggan = scn.next();
                                System.out.print("Nama : ");
                                String namaPelanggan = scn.next();
                                pelanggan.setPelanggan(idPelanggan, namaPelanggan);
                                System.out.println("Data pelanggan berhasil dimasukkan!");
                                System.out.println();
                                makanan.MenuMakanan();
                                System.out.print("Makanan : ");
                                int inputMakanan = scn.nextInt();
                                System.out.print("Jumlah : ");
                                int jumlahMakanan = scn.nextInt();
                                pesananMakanan = makanan.hargaMakanan.get(inputMakanan - 1) * jumlahMakanan;
                                pesanan.unitMakanan(makanan.menuMakanan.get(inputMakanan-1), pesananMakanan);
                                System.out.println();
                                minuman.MenuMinuman();
                                System.out.print("Minuman : ");
                                int inputMinuman = scn.nextInt();
                                System.out.print("Jumlah : ");
                                int jumlahMinuman = scn.nextInt();
                                pesananMinuman = minuman.hargaMinuman.get(inputMinuman - 1) * jumlahMinuman;
                                pesanan.unitMinuman(minuman.menuMinuman.get(inputMinuman-1), pesananMinuman);
                                menu.setPesanan(makanan.menuMakanan.get(inputMakanan-1),minuman.menuMinuman.get(inputMinuman-1), jumlahMakanan, jumlahMinuman);
                                System.out.println();
                                pesananTotal = pesananMakanan + pesananMinuman;
                                pesanan.setTotalPembayaran(pesananTotal);
                                System.out.println("Total : " + pesananTotal);
                                System.out.print("Bayar : ");
                                bayar = scn.nextInt();
                                pesanan.setTotalPesanan(bayar);
                                kembalian = bayar - pesananTotal;
                                pesanan.setKembalian(kembalian);
                                System.out.println("Kembalian : " + kembalian);
                                menu.setPembayaran(pesananMakanan, pesananMinuman);
                                pelanggan.daftarPelanggan(namaPelanggan, pesananTotal);
                            }
                            case 2 -> {
                                System.out.println();
                                System.out.println();
                                System.out.println("== NOTA PEMBAYARAN ==");
                                if (restoran != null) {
                                    restoran.displayRestoran();
                                    System.out.println("--------------------------------");
                                    System.out.println(now);
                                } else {
                                    System.out.println();
                                }
                                if (pelanggan != null) {
                                    pelanggan.displayPelanggan();
                                    System.out.println("--------------------------------");
                                    menu.displayMenu();
                                    pesanan.displayPesanan();
                                    System.out.println("--------------------------------");
                                    System.out.println();
                                    System.out.println("TERIMA KASIH HAVE A NICE DAY :)");
                                } else {
                                    System.out.println();
                                }
                            }
                            case 3 -> System.out.println("TERIMAKASIH KASIR!");
                        }
                    } while (pilihKasir != 3);
                }
            }
        } while (pilihOperasi != 4);
        System.out.println("TERIMAKASIH!");
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
}
