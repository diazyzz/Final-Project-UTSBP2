import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pesanan {
    private int unitPendapatanMakanan, unitPendapatanMinuman;
    private int totalPembayaran;
    private int totalPesanan;
    private int kembalian;

    HashMap <String,Integer> dataUnitPendapatanMakanan = new HashMap<>();
    HashMap<String,Integer> dataUnitPendapatanMinuman = new HashMap<>();

    public Pesanan() {
        this.totalPembayaran = 0;
        this.totalPesanan = 0;
        this.kembalian = 0;
    }
    public void unitMakanan(String jenisMakanan, int hargaMakanan) {
        if (dataUnitPendapatanMakanan.containsKey(jenisMakanan)) {
            dataUnitPendapatanMakanan.put(jenisMakanan, dataUnitPendapatanMakanan.get(jenisMakanan) + hargaMakanan);
        } else {
            dataUnitPendapatanMakanan.put(jenisMakanan, hargaMakanan);
        }
        unitPendapatanMakanan += hargaMakanan;
    }
    public void unitMinuman(String jenisMinuman, int hargaMinuman) {
        if (dataUnitPendapatanMinuman.containsKey(jenisMinuman)) {
            dataUnitPendapatanMinuman.put(jenisMinuman, dataUnitPendapatanMinuman.get(jenisMinuman) + hargaMinuman);
        } else {
            dataUnitPendapatanMinuman.put(jenisMinuman, hargaMinuman);
        }
        unitPendapatanMinuman += hargaMinuman;
    }
    public void totalPendapatan(){
        int totalpendapatan = unitPendapatanMakanan + unitPendapatanMinuman;
        System.out.println("Total pendapatan Keseluruhan : " + totalpendapatan);
    }

    public void displayLaporanMakanan(){
        System.out.println("Total pendapatan Makanan : " + unitPendapatanMakanan);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(dataUnitPendapatanMakanan.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int noUrut = 1;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(noUrut + ". " + entry.getKey() + " : " + entry.getValue());
            noUrut++;
        }
    }
    public void displayLaporanMinuman(){
        System.out.println("Total pendapatan Minuman : " + unitPendapatanMinuman);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(dataUnitPendapatanMinuman.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int noUrut = 1;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(noUrut + ". " + entry.getKey() + " : " + entry.getValue());
            noUrut++;
        }
    }
    public void displayPesanan(){
        System.out.println();
        System.out.println("TOTAL PESANAN           : " + getTotalPembayaran());
        System.out.println("TOTAL PEMBAYARAN        : " + getTotalPesanan());
        System.out.println("--------------------------------");
        System.out.println("KEMBALIAN               : " + getKembalian());
    }

    public void setTotalPembayaran (int totalPembayaran){
        this.totalPembayaran = totalPembayaran;
    }
    public void setTotalPesanan (int totalPesanan){
        this.totalPesanan = totalPesanan;
    }
    public void setKembalian(int kembalian){
        this.kembalian = kembalian;
    }

    public int getTotalPembayaran(){
        return totalPembayaran;
    }
    public int getTotalPesanan(){
        return totalPesanan;
    }
    public int getKembalian(){
        return kembalian;
    }
}
