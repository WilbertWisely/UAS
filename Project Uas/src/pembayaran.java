import java.util.ArrayList;
import java.util.Scanner;

public class pembayaran {
    public static Object getKode;
    private String kode;
    private int durasi,tambahan,penginapan;
    public static ArrayList<pembayaran> initpembayaran(ArrayList<pembayaran>pembayaran ){
        pembayaran py1 = new pembayaran("3",2, 800000, 0);
        pembayaran.add(py1);
        pembayaran py2 = new pembayaran("2",1, 700000, 0);
        pembayaran.add(py2);
        pembayaran py3 = new pembayaran("1",2, 800000, 0);
        pembayaran.add(py3);
        return pembayaran;
    }
    public pembayaran() {
    }

    public pembayaran(String kode, int durasi, int penginapan, int tambahan) {
        this.kode = kode;
        this.durasi = durasi;
        this.tambahan = tambahan;
        this.penginapan = penginapan;
        
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getDurasi() {
        return this.durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getTambahan() {
        return this.tambahan;
    }

    public void setTambahan(int tambahan) {
        this.tambahan = tambahan;
    }

    public int getPenginapan() {
        return this.penginapan;
    }

    public void setPenginapan(int penginapan) {
        this.penginapan = penginapan;
    }
    public void tampilpembayaran() {
        //String string[] = App.py.toArray(new String[0]);
        System.out.println(kode + "\t\t" + durasi + "\t" + penginapan+ "\t"+ tambahan+"\t");
    }

}
