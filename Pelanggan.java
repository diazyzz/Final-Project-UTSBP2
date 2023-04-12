import java.util.*;

class Pelanggan {
    private String nama;
    private String idPelanggan;
    HashMap<String, Integer> pelanggan = new HashMap<>();

    Pelanggan() {
        this.nama = " ";
        this.idPelanggan = " ";
    }

    public void daftarPelanggan(String pembeli, int biaya) {
        int totalBiaya = biaya;
        if (pelanggan.containsKey(pembeli)) {
            totalBiaya += pelanggan.get(pembeli);
        }
        pelanggan.put(pembeli, totalBiaya);
    }
    public void setPelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }
    public String getNama() {
        return nama;
    }

    public void displayDaftarPelanggan() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(pelanggan.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int noUrut = 1;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(noUrut + ". " + entry.getKey() + " : " + entry.getValue());
            noUrut++;
        }
    }
    public void displayPelanggan() {
        System.out.println("ID : " + this.getIdPelanggan());
        System.out.println("Pelanggan : " + this.getNama());
    }
}

